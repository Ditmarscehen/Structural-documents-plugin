package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PascalFileType extends LanguageFileType {

    public static final PascalFileType INSTANCE = new PascalFileType();

    private PascalFileType() {
        super(PascalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Pascal File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Pascal language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pascal";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PascalIcons.FILE;
    }

}
