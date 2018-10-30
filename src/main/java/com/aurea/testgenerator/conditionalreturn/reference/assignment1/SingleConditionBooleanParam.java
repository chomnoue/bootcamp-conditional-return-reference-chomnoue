package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;

public class SingleConditionBooleanParam {

    public static final String CONST_STRING = "Const string";

    private int integerField;
    private boolean booleanField;

    public AnyType testAndReturn(String stringParam, boolean booleanParam, int intParam) {
        if (booleanParam && CONST_STRING.equals(stringParam) && intParam > 30) {
            System.out.println("Returning default");
            return AnyType.DEFAULT;
        } else {
            return null;
        }
    }

    public AnyType testAndReturnNoElse(int intParam) {
        if (this.booleanField && intParam == this.integerField) {
            int intVar = intParam + integerField;
            return new AnyType(intVar);
        }
        System.out.println("returning null");
        return null;
    }

    public void nonSupportedVoid() {

    }

    public AnyType nonSupportedNoIf(String stringParam) {
        System.out.println(stringParam);
        return AnyType.DEFAULT;
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
