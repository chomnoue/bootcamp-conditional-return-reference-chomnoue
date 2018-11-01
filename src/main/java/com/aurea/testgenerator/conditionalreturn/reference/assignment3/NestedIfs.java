package com.aurea.testgenerator.conditionalreturn.reference.assignment3;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;

public class NestedIfs {

    private int integerField;
    private boolean booleanField;

    public AnyType testNested(String stringParam, int intParam) {
        if (this.booleanField && intParam == this.integerField) {
            int intVar = intParam + integerField;
            return new AnyType(intVar);
        } else if (intParam != this.integerField && stringParam.equals("Hello")) {
            System.out.println("Returning default");
            return AnyType.DEFAULT;
        } else {
            System.out.println("returning null");
            return null;
        }
    }

    public static String deeplyNestedStatic(boolean cond1, boolean cond2, boolean cond3, boolean cond4,
            boolean cond5, boolean cond6, boolean cond7){
        if(cond1){
            if(cond2){
                return "coud 2 met";
            }
            return "cond 2 not met";
        }else if(cond3){
            if(cond4){
                if(cond5){
                    return "cond 5 met";
                }
                System.out.println("cond 5 not met, not returning");
            }
            if(cond6){
                return "cond 6 met";
            }else {
                if(cond7){
                    System.out.println("cond 7 met, not returning");
                }else {
                    return "Cond 7 not met";
                }
            }
        }
        return "Reached the end";
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
