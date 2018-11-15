package com.aurea.testgenerator.conditionalreturn.reference.assignment2;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class MultipleConditionsPatternTest {

    @Test
    public void testMultipleConditionalTrue() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "Venus";
        object.setBooleanField(true);
        boolean booleanParam = true;
        object.setIntegerField(7183);
        int intParam = 7183;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testMultipleConditionalElseTrue() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "hello";
        object.setBooleanField(false);
        boolean booleanParam = true;
        object.setIntegerField(3152 + 1);
        int intParam = 3152;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testMultipleConditionalElseElseTrue() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "Polaris";
        object.setBooleanField(false);
        boolean booleanParam = true;
        object.setIntegerField(9976);
        int intParam = 9976;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT_SIX);
    }

    @Test
    public void testMultipleConditionalElseElseElse() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "44AU";
        object.setBooleanField(false);
        boolean booleanParam = false;
        object.setIntegerField(9976);
        int intParam = 9976;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isNull();
    }
}
