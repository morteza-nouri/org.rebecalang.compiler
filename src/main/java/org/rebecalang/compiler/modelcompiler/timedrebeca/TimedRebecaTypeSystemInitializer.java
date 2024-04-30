package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.MailboxDeclaration;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaCode;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.springframework.beans.factory.annotation.Autowired;

public class TimedRebecaTypeSystemInitializer extends TypeSystemInitializer {

    @Autowired
    public TimedRebecaTypeSystemInitializer(AbstractTypeSystem typeSystem) {
        super(typeSystem);
    }

    protected void fillTypeSystem(RebecaModel rebecaModel) {
        super.fillTypeSystem(rebecaModel);
        addMailboxDeclarationsToTypeSystem((TimedRebecaCode) rebecaModel.getRebecaCode());
    }

    private void addMailboxDeclarationsToTypeSystem(TimedRebecaCode rebecaCode) {
        for (MailboxDeclaration mailboxDeclaration : rebecaCode.getMailboxDeclaration()) {
            if (typeSystem.hasType(mailboxDeclaration.getName())) {
                CodeCompilationException rce = new CodeCompilationException(
                        "Multiple Definition of " + mailboxDeclaration.getName(),
                        mailboxDeclaration.getLineNumber(),
                        mailboxDeclaration.getCharacter()
                );
                exceptionContainer.addException(rce);
            } else {
                ((TimedRebecaTypeSystem) typeSystem).addMailboxClassType(mailboxDeclaration);
            }
        }
    }

}
