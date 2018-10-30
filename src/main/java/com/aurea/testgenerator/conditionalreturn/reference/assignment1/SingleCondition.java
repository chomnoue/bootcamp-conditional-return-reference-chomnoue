package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;

public class SingleCondition {

    public static final String CONST_STRING = "Const string";
    public static final int CONST_INT = 375;

    private int integerField;
    private boolean booleanField;
    private String stringField;
    private long longField;

    public AnyType testAndReturn(String stringParam, int intParam) {
        if (CONST_STRING.equals(stringParam) && intParam > 30) {
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

    public String testAndReturnComplex(String stringParam, int intParam, long longParam, int secondIntParam) {
        if ((!stringParam.equals(CONST_STRING) || intParam > 30) && (45 < this.integerField
                ^ longParam < this.longField) && secondIntParam!=CONST_INT) {
            return CONST_STRING;
        } else {
            return "literal string";
        }
    }



    public String testAndReturnFieldOrParam(String stringParam, boolean booleanParam, String secondStringParam) {
        if (secondStringParam == null || booleanParam ) {
            return stringParam;
        } else {
            return this.stringField;
        }
    }

    public void nonSupportedVoid() {

    }

    public AnyType nonSupportedNoIf(String stringParam) {
        System.out.println(stringParam);
        return AnyType.DEFAULT;
    }

    public AnyType nonSupportedIfNotReturning(String stringParam) {
        if(CONST_STRING.equals(stringParam)){
            System.out.println(stringParam);
        }
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

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public long getLongField() {
        return longField;
    }

    public void setLongField(long longField) {
        this.longField = longField;
    }
}
