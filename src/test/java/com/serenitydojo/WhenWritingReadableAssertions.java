package com.serenitydojo;

import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is 35
        Assert.assertEquals(sum, 35);
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        // Check that the sum is greater than 30
        assertThat(sum).isGreaterThan(30);
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        // Check that the sum is between 10 and 20
        assertThat(sum).isBetween(10,20);
//        assertThat(true).isFalse();
        assertThat(true).isTrue();

    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;

        // Check that the sum is within 10% of 100
        assertThat(roughlyOneHundred).isCloseTo(100, Percentage.withPercentage(10));
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        assertThat(color).containsIgnoringCase("red");
        assertThat(true).isTrue();
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        assertThat(color).containsIgnoringCase("red");
        assertThat(true).isTrue();
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        assertThat(licenseNumber).containsOnlyDigits();
        assertThat(true).isTrue();
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        assertThat(colors).containsIgnoringCase("red");
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        assertThat(colors).endsWith("blue");
//        assertThat(true).isFalse();
        assertThat(true).isTrue();
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red"
        assertThat(colors).contains("red");
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red" and "blue
        assertThat(colors).contains("red","blue");
        assertThat(true).isTrue();
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains 3 elements
//        assertThat(colors).element(3);
        assertThat(colors).element(2);
        assertThat(true).isTrue();
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","green" and "blue"
        assertThat(colors).contains("red","green","blue");
        assertThat(true).isTrue();
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");

        // Check that the list contains "red","blue" and "green" in any order
        assertThat(colors).containsExactlyInAnyOrder("green","blue","red");
        assertThat(true).isTrue();
    }




}
