package org.intellij.sdk.language;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PascalLexerAdapter extends FlexAdapter {

    public PascalLexerAdapter() {
        super(new PascalLexer(null));
    }

}
