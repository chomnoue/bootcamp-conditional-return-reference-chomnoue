package com.aurea.testgenerator.conditionalreturn.reference;

public class AnyType {

    public static final AnyType DEFAULT = new AnyType(5);
    public static final AnyType DEFAULT_SIX = new AnyType(6);

    private final int value;


    public AnyType(int value) {
        this.value = value;
    }
}
