package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.PascalLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PascalTokenType extends IElementType {

    public PascalTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PascalLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PascalTokenType." + super.toString();
    }

}
