package com.aurea.testgenerator.conditionalreturn.reference.assignment3;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;

public class NestedIfs {

    private int integerField;
    private boolean booleanField;

    public AnyType testMultiple(String stringParam, int intParam) {
        if (this.booleanField && intParam == this.integerField) {
            int intVar = intParam + integerField;
            return new AnyType(intVar);
        } else if (intParam != this.integerField && stringParam != null) {
            System.out.println("Returning default");
            return AnyType.DEFAULT;
        } else {
            System.out.println("returning null");
            return null;
        }
    }

    public int getIntegerField() {
        return integerField;
    }

    public void setIntegerField(int integerField) {
        this.integerField = integerField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }
}
