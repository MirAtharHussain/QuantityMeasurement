package com.bridgelabz.Quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);

    }

    @Test
    public void givenFeet_IfNotNull_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotNull(feet1);
        Assert.assertNotNull(feet2);
    }

    @Test
    public void givenObjectReferences_IFNotSame_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenObject_CheckType_OfFeetClass() {
        Feet feet1 = new Feet(0.0);
        Assert.assertEquals(Feet.class, feet1.getClass());
    }

    @Test
    public void givenValueCheckForEquality() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    @Test
    public void givenInch_IfNotNull_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotNull(inch1);
        Assert.assertNotNull(inch2);
    }

    @Test
    public void givenInchObjectReferences_IFNotSame_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotSame(inch1,inch2);
    }

    @Test
    public void givenInchObject_CheckType_OfFeetClass() {
        Inch inch1 = new Inch(0.0);
        Assert.assertEquals(Inch.class, inch1.getClass());
    }

    @Test
    public void givenInchValueCheckForEquality() {
        Inch inch1 = new Inch(1.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertEquals(inch1,inch2);
    }
}
