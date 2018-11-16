package com.aurea.testgenerator.conditionalreturn.reference.assignment3;

import javax.annotation.Generated;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

@Generated("GeneralPatterns")
public class NestedLongMethodPatternTest {

    @Test
    public void deeplyNestedLongMethodConditionalTrueTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = true;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("coud 2 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalTrueElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = false;
        boolean cond2 = false;
        boolean cond1 = true;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 2 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = true;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 5 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseElseTrueTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        object.setBooleanField(true);
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("boolean field met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseElseTrueElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        object.setBooleanField(false);
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueTrueElseElseElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = true;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = false;
        boolean cond6 = true;
        boolean cond5 = true;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("cond 6 met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseElseTrueTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = false;
        object.setBooleanField(true);
        boolean cond3 = true;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("boolean field met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseElseTrueElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = false;
        object.setBooleanField(false);
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseTrueElseElseElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = false;
        boolean cond6 = false;
        boolean cond5 = false;
        boolean cond4 = false;
        boolean cond3 = true;
        boolean cond2 = true;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Cond 7 not met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseElseTrue() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = true;
        boolean cond5 = true;
        boolean cond4 = false;
        object.setBooleanField(true);
        boolean cond3 = false;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("boolean field met");
    }

    @Test
    public void deeplyNestedLongMethodConditionalElseElseElse() throws Exception {
        NestedLongMethod object = new NestedLongMethod();
        boolean cond7 = true;
        boolean cond6 = false;
        boolean cond5 = true;
        boolean cond4 = false;
        object.setBooleanField(false);
        boolean cond3 = false;
        boolean cond2 = false;
        boolean cond1 = false;
        String actualResult = object.deeplyNestedLongMethod(cond1, cond2, cond3, cond4, cond5, cond6, cond7);
        assertThat(actualResult).isEqualTo("Reached the end");
    }
}
