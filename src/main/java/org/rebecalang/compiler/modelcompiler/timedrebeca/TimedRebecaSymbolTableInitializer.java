package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.MailboxDeclaration;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaCode;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CoreVersion;

public class TimedRebecaSymbolTableInitializer extends SymbolTableInitializer {
    public TimedRebecaSymbolTableInitializer(AbstractTypeSystem typeSystem) {
        super(typeSystem);
    }

    public void fillSymbolTable(RebecaModel rebecaModel, CoreVersion coreVersion) {
        super.fillSymbolTable(rebecaModel, coreVersion);
        addMailboxClassToSymbolTableInInitialization((TimedRebecaCode) rebecaModel.getRebecaCode());
    }

    protected void addMailboxClassToSymbolTableInInitialization(TimedRebecaCode rebecaCode) {
        for (MailboxDeclaration mailboxDeclaration : rebecaCode.getMailboxDeclaration()) {
            if (typeSystem.hasType(mailboxDeclaration.getName())) {
                CodeCompilationException rce = new CodeCompilationException(
                        "Multiple definition of "
                                + mailboxDeclaration.getName(),
                        mailboxDeclaration.getLineNumber(),
                        mailboxDeclaration.getCharacter());
                exceptionContainer.addException(rce);
            } else {
                ((TimedRebecaTypeSystem)typeSystem).addMailboxClassType(mailboxDeclaration);
            }
            try {
                Type type = typeSystem.getType(mailboxDeclaration.getName());
                addFields(type, mailboxDeclaration.getKnownSenders(), AccessModifierUtilities.PRIVATE);
            } catch (CodeCompilationException e) {
                e.printStackTrace();
            }
        }
    }
}
