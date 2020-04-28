package com.bridgelabz.Quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void givenFeet_IfNotNull_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotNull(feet1);
        Assert.assertNotNull(feet2);
    }

    @Test
    public void givenObjectReferences_IFNotSame_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenObject_CheckType_OfFeetClass() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(Length.class, feet1.getClass());
    }

    @Test
    public void givenValueCheckForEquality() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInch_IfNotNull_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotNull(inch1);
        Assert.assertNotNull(inch2);
    }

    @Test
    public void givenInchObjectReferences_IFNotSame_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchObject_CheckType_OfFeetClass() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(Length.class, inch1.getClass());
    }

    @Test
    public void givenInchValueCheckForEquality() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        double toInch = feet1.covertInToInch(Length.Unit.FEET, 0.0);
        Assert.assertEquals(0.0,toInch,0.0);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenComapared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        double inToInch = feet1.covertInToInch(Length.Unit.FEET, 1.0);
        Assert.assertEquals(12,inToInch,0.0);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        double toFeet = inch1.covertInToFeet(Length.Unit.INCH, 12.0);
        Assert.assertEquals(1.0,toFeet,0.0);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        double toYard = feet1.covertInToYard(Length.Unit.FEET, 3.0);
        Assert.assertEquals(1.0,toYard,0.0);
    }

    @Test
    public void given1Feetand1Yard_WhenComapred_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenComapred_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        double covertInToInch = yard1.covertInToInch(Length.Unit.YARD, 1.0);
        Assert.assertEquals(36.0,covertInToInch,0.0);
    }

    @Test
    public void given36Inchand1Yard_WhenComapred_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        double check = inch1.covertInToYard(Length.Unit.INCH,36.0);
        Assert.assertEquals(1.0,check,0.0);
    }
    @Test
    public void given1yardand3Feet_WhenComapred_ShouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 3.0);
        double covertInToFeet = yard1.covertInToFeet(Length.Unit.YARD, 1.0);
        Assert.assertEquals(3.0,covertInToFeet,0.0);

    }

    @Test
    public void given2InchAnd5CentiMeter_WhenCompared_ShoudReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double centiMeter = inch.covertInToCentiMeter(Length.Unit.INCH, 2.0);
        Assert.assertEquals(5.0,centiMeter,0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturnInInch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double addTwoLengths = inch.addTwoLengths(Length.Unit.INCH, 2.0, Length.Unit.INCH, 2.0);
        Assert.assertEquals(4.0,addTwoLengths, 0.0);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturnInInch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double addTwoLengths = inch.addTwoLengths(Length.Unit.FEET, 1.0, Length.Unit.INCH, 2.0);
        Assert.assertEquals(14.0,addTwoLengths, 0.0);
    }
    @Test
    public void given2InchAnd1Feet_WhenAdded_ShouldReturnInInch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double addTwoLengths = inch.addTwoLengths(Length.Unit.FEET, 1.0, Length.Unit.FEET, 1.0);
        Assert.assertEquals(24.0,addTwoLengths, 0.0);
    }
    @Test
    public void given2InchAnd2andHalfCentimeter_WhenAdded_ShouldReturnInInch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double addTwoLengths = inch.addTwoLengths(Length.Unit.INCH, 2.0, Length.Unit.CENTIMETER, 2.5);
        Assert.assertEquals(3.0,addTwoLengths, 0.0);
    }

    @Test
    public void given1GallonandLitreofWater_WhenCompared_ShouldReturnTrue() {
        Volume volume = new Volume(Volume.Unit.GALLON, 1.0);
        double inTOLitres = volume.convertInTOLitres(Volume.Unit.GALLON, 1.0);
        Assert.assertEquals(3.78,inTOLitres,0.0);
    }
    @Test
    public void given1Litreand1000mlofWater_WhenCompared_ShouldReturnTrue() {
        Volume volume = new Volume(Volume.Unit.GALLON, 1.0);
        double inTOMl = volume.convertInTOMl(Volume.Unit.LITRE,1.0);
        Assert.assertEquals(1000,inTOMl,0.0);
    }
    @Test
    public void given1GallonAnd4litres_WhenAdded_ShouldReturnInLitres() {
        Volume volume = new Volume(Volume.Unit.GALLON, 1.0);
        double toLitres = volume.addInToLitres(Volume.Unit.GALLON, 1.0, Volume.Unit.LITRE, 3.78);
        Assert.assertEquals(7.56, toLitres, 0.0);
    }
    @Test
    public void given1litreAnd1000Ml_WhenAdded_ShouldReturnInLitres() {
        Volume volume = new Volume(Volume.Unit.LITRE, 1.0);
        double toLitres = volume.addInToLitres(Volume.Unit.LITRE, 1.0, Volume.Unit.ML, 1000);
        Assert.assertEquals(2, toLitres, 0.0);
    }
}