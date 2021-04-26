package org.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.language.PascalFileType;
import org.intellij.sdk.language.PascalLanguage;
import org.jetbrains.annotations.NotNull;

public class PascalFile extends PsiFileBase {

    public PascalFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PascalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PascalFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Pascal File";
    }

}
