package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static com.aurea.testgenerator.conditionalreturn.reference.assignment1.SingleConditionReturnString.CONST_STRING;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class SingleConditionReturnStringPatternTest {

    @Test
    public void testAndReturnConditionalTrue() throws Exception {
        SingleConditionReturnString object = new SingleConditionReturnString();
        String stringParam = CONST_STRING;
        int intParam = 30 + 1;
        String actualResult = object.testAndReturn(stringParam, intParam);
        assertThat(actualResult).isEqualTo(CONST_STRING);
    }

    @Test
    public void testAndReturnConditionalElse() throws Exception {
        SingleConditionReturnString object = new SingleConditionReturnString();
        String stringParam = CONST_STRING + 1;
        int intParam = 878;
        String actualResult = object.testAndReturn(stringParam, intParam);
        assertThat(actualResult).isEqualTo("any string");
    }

    @Test
    public void testAndReturnNoElseConditionalTrue() throws Exception {
        SingleConditionReturnString object = new SingleConditionReturnString();
        object.setBooleanField(true);
        object.setIntegerField(5547);
        int intParam = 5547;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testAndReturnNoElseConditionalElse() throws Exception {
        SingleConditionReturnString object = new SingleConditionReturnString();
        object.setBooleanField(false);
        int intParam = 5144;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNull();
    }
}
