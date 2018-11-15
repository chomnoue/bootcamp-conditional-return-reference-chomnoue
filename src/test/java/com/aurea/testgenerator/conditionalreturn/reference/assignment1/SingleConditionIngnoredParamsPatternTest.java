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
        String ignoredSting = "Uranus";
        boolean ignoredBoolean = true;
        int intParam = 30 + 1;
        AnyType actualResult = object.testAndReturn(ignoredSting, stringParam, ignoredBoolean, intParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testAndReturnConditionalElse() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        String stringParam = CONST_STRING + 1;
        String ignoredSting = "ROSCOSMOS";
        boolean ignoredBoolean = true;
        int intParam = 6078;
        AnyType actualResult = object.testAndReturn(ignoredSting, stringParam, ignoredBoolean, intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void testAndReturnNoElseConditionalTrue() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        object.setBooleanField(true);
        object.setIntegerField(2409);
        int intParam = 2409;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testAndReturnNoElseConditionalElse() throws Exception {
        SingleConditionIngnoredParams object = new SingleConditionIngnoredParams();
        object.setBooleanField(false);
        int intParam = 9133;
        AnyType actualResult = object.testAndReturnNoElse(intParam);
        assertThat(actualResult).isNull();
    }
}
