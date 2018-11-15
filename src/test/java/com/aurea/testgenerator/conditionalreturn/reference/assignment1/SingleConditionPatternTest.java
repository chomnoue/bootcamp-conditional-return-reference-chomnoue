package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static com.aurea.testgenerator.conditionalreturn.reference.assignment1.SingleCondition.CONST_INT;
import static com.aurea.testgenerator.conditionalreturn.reference.assignment1.SingleCondition.CONST_STRING;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class SingleConditionPatternTest {

    @Test
    public void testAndReturnConditionalTrue() throws Exception {
        SingleCondition object = new SingleCondition();
        String stringParam = CONST_STRING;
        int intParam = 30 + 1;
        AnyType actualResult = object.testAndReturn(stringParam, intParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testAndReturnConditionalElse() throws Exception {
        SingleCondition object = new SingleCondition();
        String stringParam = CONST_STRING + 1;
        int intParam = 2549;
        AnyType actualResult = object.testAndReturn(stringParam, intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void testAndReturnNoElseConditionalTrue() throws Exception {
        SingleCondition object = new SingleCondition();
        object.setBooleanField(true);
        object.setIntegerField(7835);
        int intParam = 7835;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testAndReturnNoElseConditionalElse() throws Exception {
        SingleCondition object = new SingleCondition();
        object.setBooleanField(false);
        int intParam = 8485;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void testAndReturnComplexConditionalTrue() throws Exception {
        SingleCondition object = new SingleCondition();
        String stringParam = CONST_STRING + 1;
        int secondIntParam = CONST_INT + 1;
        long longParam = 8051101182465628160L;
        object.setIntegerField(45 - 1);
        int intParam = 3094;
        object.setLongField(8051101182465628160L + 1);
        String actualResult = object.testAndReturnComplex(stringParam, intParam, longParam, secondIntParam);
        assertThat(actualResult).isEqualTo(CONST_STRING);
    }

    @Test
    public void testAndReturnComplexConditionalElse() throws Exception {
        SingleCondition object = new SingleCondition();
        String stringParam = CONST_STRING;
        int secondIntParam = 3809;
        long longParam = 6700229239917487104L;
        int intParam = 30 - 1;
        String actualResult = object.testAndReturnComplex(stringParam, intParam, longParam, secondIntParam);
        assertThat(actualResult).isEqualTo("literal string");
    }

    @Test
    public void testAndReturnFieldOrParamConditionalTrue() throws Exception {
        SingleCondition object = new SingleCondition();
        String secondStringParam = null;
        String stringParam = "Jupiter";
        boolean booleanParam = true;
        String actualResult = object.testAndReturnFieldOrParam(stringParam, booleanParam, secondStringParam);
        assertThat(actualResult).isEqualTo(stringParam);
    }

    @Test
    public void testAndReturnFieldOrParamConditionalElse() throws Exception {
        SingleCondition object = new SingleCondition();
        String secondStringParam = "Eagle Nebula";
        String stringParam = "Canis Major";
        object.setStringField("Wolf 359");
        boolean booleanParam = false;
        String actualResult = object.testAndReturnFieldOrParam(stringParam, booleanParam, secondStringParam);
        assertThat(actualResult).isEqualTo("Wolf 359");
    }
}
