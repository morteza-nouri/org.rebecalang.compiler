package org.rebecalang.compiler.modelcompiler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

@ContextConfiguration(classes = CompilerConfig.class)
@SpringJUnitConfig
public class MailboxTest {
    public static final String MODEL_FILES_BASE = "src/test/resources/org/rebecalang/compiler/modelcompiler/mailbox/";
    @Autowired
    public RebecaModelCompiler compiler;
    @Autowired
    public ExceptionContainer exceptionContainer;

    @Test
    public void GIVEN_CorrectMailbox_WEHN_Compiling_THEN_NoError() {
        File model = new File(MODEL_FILES_BASE + "TimedRebecaMailbox.rebeca");
        Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
        extension.add(CompilerExtension.TIMED_REBECA);

        compiler.compileRebecaFile(model, extension, CoreVersion.CORE_2_1);

        exceptionContainer.print(System.out);
        Assertions.assertTrue(exceptionContainer.exceptionsIsEmpty());

    }
}