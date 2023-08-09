package com.objectmentor.utilities.args;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    private boolean booleanValue = false;
    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }


}