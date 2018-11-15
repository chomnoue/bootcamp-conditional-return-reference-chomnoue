package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static com.aurea.testgenerator.conditionalreturn.reference.assignment1.SingleConditionBooleanParam.CONST_STRING;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class SingleConditionBooleanParamPatternTest {

    @Test
    public void testAndReturnConditionalTrue() throws Exception {
        SingleConditionBooleanParam object = new SingleConditionBooleanParam();
        String stringParam = CONST_STRING;
        boolean booleanParam = true;
        int intParam = 30 + 1;
        AnyType actualResult = object.testAndReturn(stringParam, booleanParam, intParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testAndReturnConditionalElse() throws Exception {
        SingleConditionBooleanParam object = new SingleConditionBooleanParam();
        String stringParam = "Sirius B";
        boolean booleanParam = false;
        int intParam = 9761;
        AnyType actualResult = object.testAndReturn(stringParam, booleanParam, intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void testAndReturnNoElseConditionalTrue() throws Exception {
        SingleConditionBooleanParam object = new SingleConditionBooleanParam();
        object.setBooleanField(true);
        object.setIntegerField(5350);
        int intParam = 5350;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testAndReturnNoElseConditionalElse() throws Exception {
        SingleConditionBooleanParam object = new SingleConditionBooleanParam();
        object.setBooleanField(false);
        int intParam = 1218;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNull();
    }
}
