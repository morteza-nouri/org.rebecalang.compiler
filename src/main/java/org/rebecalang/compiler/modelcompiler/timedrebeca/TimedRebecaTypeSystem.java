package org.rebecalang.compiler.modelcompiler.timedrebeca;

import lombok.Getter;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.MailboxDeclaration;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Qualifier("TIMED_REBECA")
public class TimedRebecaTypeSystem extends CoreRebecaTypeSystem {

    @Getter
    public final static OrdinaryPrimitiveType TIMER_TYPE;

    @Getter
    public final static OrdinaryPrimitiveType MAILBOX_TYPE;

    protected Map<Type, MailboxDeclaration> mailboxDeclarationsMetaData;

    static {
        TIMER_TYPE = new OrdinaryPrimitiveType();
        TIMER_TYPE.setName("Timer");
        MAILBOX_TYPE = new OrdinaryPrimitiveType();
        MAILBOX_TYPE.setName("Mailbox");
    }

    @Override
    protected void initializeTypeSystem() {
        super.initializeTypeSystem();

        mailboxDeclarationsMetaData = new HashMap<>();

        addNewType(TIMER_TYPE);
        addNewType(MAILBOX_TYPE);
    }

    public Type addMailboxClassType(MailboxDeclaration mbd) {
        OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
        type.setName(mbd.getName());
        type.setLineNumber(mbd.getLineNumber());
        type.setCharacter(mbd.getCharacter());
        addNewType(type);
        mailboxDeclarationsMetaData.put(type, mbd);
        try {
            addTypeCompatibility(getType(mbd.getName()), MAILBOX_TYPE);
        } catch (CodeCompilationException e) {
            e.printStackTrace();
        }
        return type;
    }
}
