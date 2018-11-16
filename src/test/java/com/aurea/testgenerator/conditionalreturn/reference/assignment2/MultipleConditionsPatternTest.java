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
        String stringParam = "Leo Minor";
        object.setBooleanField(true);
        boolean booleanParam = false;
        object.setIntegerField(7234);
        int intParam = 7234;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testMultipleConditionalElseTrue() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "hello";
        object.setBooleanField(false);
        boolean booleanParam = true;
        object.setIntegerField(8615 + 1);
        int intParam = 8615;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testMultipleConditionalElseElseTrue() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "Hyperion";
        object.setBooleanField(false);
        boolean booleanParam = true;
        object.setIntegerField(858);
        int intParam = 858;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT_SIX);
    }

    @Test
    public void testMultipleConditionalElseElseElse() throws Exception {
        MultipleConditions object = new MultipleConditions();
        String stringParam = "Orion";
        object.setBooleanField(false);
        boolean booleanParam = false;
        object.setIntegerField(858);
        int intParam = 858;
        AnyType actualResult = object.testMultiple(stringParam, intParam, booleanParam);
        assertThat(actualResult).isNull();
    }
}
