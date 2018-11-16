package com.aurea.testgenerator.conditionalreturn.reference.assignment1;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static com.aurea.testgenerator.conditionalreturn.reference.assignment1.SingleConditionIngnoredParams.CONST_STRING;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class SingleConditionIngnoredParamsPatternTest {

    @Test
    public void testAndReturnConditionalTrue() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        String stringParam = CONST_STRING;
        String ignoredSting = "111kiloparsecs";
        boolean ignoredBoolean = true;
        int intParam = 30 + 1;
        AnyType actualResult = object.testAndReturn(ignoredSting, stringParam, ignoredBoolean, intParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testAndReturnConditionalElse() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        String stringParam = CONST_STRING + 1;
        String ignoredSting = "Columbia";
        boolean ignoredBoolean = true;
        int intParam = 2100;
        AnyType actualResult = object.testAndReturn(ignoredSting, stringParam, ignoredBoolean, intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void testAndReturnNoElseConditionalTrue() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        object.setBooleanField(true);
        object.setIntegerField(9966);
        int intParam = 9966;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testAndReturnNoElseConditionalElse() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        object.setBooleanField(false);
        int intParam = 2063;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNull();
    }
}
