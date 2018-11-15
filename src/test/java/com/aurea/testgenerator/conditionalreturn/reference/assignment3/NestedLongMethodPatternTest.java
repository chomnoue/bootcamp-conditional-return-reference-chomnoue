package com.aurea.testgenerator.conditionalreturn.reference.assignment3;

import javax.annotation.Generated;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class NestedLongMethodPatternTest {

    @Test
    public void deeplyNestedLongMethodConditionalTrueTrue() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = true;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("coud 2 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalTrueElse() throws Exception {
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = false;
        boolean cond2 = false;
        boolean cond1 = true;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 2 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 5 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseTrue() throws Exception {
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseElseTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseElseElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseTrue() throws Exception {
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseElseTrue() throws Exception {
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseElseElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseElse() throws Exception {
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = false;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = NestedLongMethod.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }
}
