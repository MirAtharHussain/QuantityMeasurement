package com.bridgelabz.Quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void givenFeet_IfNotNull_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotNull(feet1);
        Assert.assertNotNull(feet2);
    }

    @Test
    public void givenObjectReferences_IFNotSame_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenObject_CheckType_OfFeetClass() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(Length.class, feet1.getClass());
    }

    @Test
    public void givenValueCheckForEquality() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertEquals(inch1,inch2);
    }
    @Test
    public void givenInch_IfNotNull_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotNull(inch1);
        Assert.assertNotNull(inch2);
    }

    @Test
    public void givenInchObjectReferences_IFNotSame_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotSame(inch1,inch2);
    }

    @Test
    public void givenInchObject_CheckType_OfFeetClass() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(Length.class, inch1.getClass());
    }

    @Test
    public void givenInchValueCheckForEquality() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd1Feet_WhenComapared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(feet1,inch1);
    }
    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(inch1, feet1);
    }
}
