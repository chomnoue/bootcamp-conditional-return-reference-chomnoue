package com.aurea.testgenerator.conditionalreturn.reference.assignment3;

import com.aurea.testgenerator.conditionalreturn.reference.AnyType;
import javax.annotation.Generated;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class NestedIfsPatternTest {

    @Test
    public void testNestedConditionalTrue() throws Exception {
        NestedIfs object = new NestedIfs();
        String stringParam = "Ariel";
        object.setBooleanField(true);
        object.setIntegerField(8184);
        int intParam = 8184;
        AnyType actualResult = object.testNested(stringParam, intParam);
        assertThat(actualResult).isNotNull();
    }

    @Test
    public void testNestedConditionalElseTrue() throws Exception {
        NestedIfs object = new NestedIfs();
        String stringParam = "Hello";
        object.setBooleanField(false);
        object.setIntegerField(2407 + 1);
        int intParam = 2407;
        AnyType actualResult = object.testNested(stringParam, intParam);
        assertThat(actualResult).isEqualTo(AnyType.DEFAULT);
    }

    @Test
    public void testNestedConditionalElseElse() throws Exception {
        NestedIfs object = new NestedIfs();
        String stringParam = "Pearl Cluster";
        object.setBooleanField(false);
        object.setIntegerField(5253);
        int intParam = 5253;
        AnyType actualResult = object.testNested(stringParam, intParam);
        assertThat(actualResult).isNull();
    }

    @Test
    public void deeplyNestedStaticConditionalTrueTrue() throws Exception {
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = true;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("coud 2 met");
    }

    @Test
    public void deeplyNestedStaticConditionalTrueElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = true;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 2 not met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueTrueTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = true;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 5 met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueTrueElseTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueTrueElseElseTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueTrueElseElseElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueElseTrue() throws Exception {
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = true;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueElseElseTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedStaticConditionalElseTrueElseElseElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedStaticConditionalElseElse() throws Exception {
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = false;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedIfs.deeplyNestedStatic(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }
}
