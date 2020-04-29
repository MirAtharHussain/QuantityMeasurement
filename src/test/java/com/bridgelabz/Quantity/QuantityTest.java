package com.bridgelabz.Quantity;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);

    }

    @Test
    public void givenFeet_IfNotNull_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        Assert.assertNotNull(feet1);
        Assert.assertNotNull(feet2);
    }

    @Test
    public void givenObjectReferences_IFNotSame_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenObject_CheckType_OfFeetClass() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        Assert.assertEquals(QuantityMeasurement.class, feet1.getClass());
    }

    @Test
    public void givenValueCheckForEquality() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInch_IfNotNull_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        Assert.assertNotNull(inch1);
        Assert.assertNotNull(inch2);
    }

    @Test
    public void givenInchObjectReferences_IFNotSame_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchObject_CheckType_OfFeetClass() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        Assert.assertEquals(QuantityMeasurement.class, inch1.getClass());
    }

    @Test
    public void givenInchValueCheckForEquality() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 0.0);
        boolean toInch = feet1.conversionComapareCheck(feet1,inch1);
        Assert.assertTrue(toInch);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotFalseLength() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenComapared_ShouldReturnEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        Assert.assertNotEquals(inch1, feet1);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 12.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_WhenCompared_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_WhenComapred_ShouldReturnNotEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_WhenComapred_ShouldReturnNotEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch1.conversionComapareCheck(inch1,yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 36.0);
        boolean compareCheck = yard1.conversionComapareCheck(yard1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_WhenComapred_ShouldReturnEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch1.conversionComapareCheck(inch1,yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardand3Feet_WhenComapred_ShouldReturnEqualLength() throws QuantityMeasurementException {
        QuantityMeasurement yard1 = new QuantityMeasurement(EnumConversion.Unit.YARD, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(EnumConversion.Unit.FEET, 3.0);
        boolean compareCheck = feet1.conversionComapareCheck(feet1,yard1);
        Assert.assertTrue(compareCheck);

    }

    @Test
    public void given2InchAnd5CentiMeter_WhenCompared_ShoudReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(EnumConversion.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.conversionComapareCheck(inch,cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturnInInch() {
        QuantityMeasurement inch = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        double lengths = inch.addTwoLengths(inch, inch1);
        Assert.assertEquals(4.0,lengths,0.0);

    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturnInInch() {
        QuantityMeasurement feet = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        double lengths = feet.addTwoLengths(feet, inch);
        Assert.assertEquals(14.0,lengths,0.0);
    }

    @Test
    public void given2InchAnd1Feet_WhenAdded_ShouldReturnInInch() {
        QuantityMeasurement inch = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        QuantityMeasurement feet = new QuantityMeasurement(EnumConversion.Unit.FEET, 1.0);
        double lengths = feet.addTwoLengths(feet, inch);
        Assert.assertEquals(14.0,lengths,0.0);
    }

    @Test
    public void given2InchAnd2andHalfCentimeter_WhenAdded_ShouldReturnInInch() {
        QuantityMeasurement inch = new QuantityMeasurement(EnumConversion.Unit.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(EnumConversion.Unit.CENTIMETER, 2.5);
        double lengths = cm.addTwoLengths(cm, inch);
        Assert.assertEquals(3.0,lengths,0.0);
    }

    @Test
    public void given1GallonandLitreofWater_WhenCompared_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement volume = new QuantityMeasurement(EnumConversion.Unit.GALLON, 1.0);
        QuantityMeasurement volume1 = new QuantityMeasurement(EnumConversion.Unit.LITRE, 3.78);
        boolean check = volume.conversionComapareCheck(volume, volume1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1Litreand1000mlofWater_WhenCompared_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement volume = new QuantityMeasurement(EnumConversion.Unit.LITRE, 1.0);
        QuantityMeasurement volume1 = new QuantityMeasurement(EnumConversion.Unit.MILILITRE, 1000);
        boolean check = volume.conversionComapareCheck(volume, volume1);
        Assert.assertTrue(check);
    }

    @Test
    public void given1GallonAnd4litres_WhenAdded_ShouldReturnInLitres() {
        QuantityMeasurement volume = new QuantityMeasurement(EnumConversion.Unit.GALLON, 1.0);
        QuantityMeasurement volume1 = new QuantityMeasurement(EnumConversion.Unit.LITRE, 3.78);
        double toLitres = volume.addTwoLengths(volume, volume1);
        Assert.assertEquals(7.56, toLitres, 0.0);
    }

    @Test
    public void given1litreAnd1000Ml_WhenAdded_ShouldReturnInLitres() {
        QuantityMeasurement volume = new QuantityMeasurement(EnumConversion.Unit.LITRE, 1.0);
        QuantityMeasurement volume1 = new QuantityMeasurement(EnumConversion.Unit.MILILITRE, 1000.0);
        double toLitres = volume.addTwoLengths(volume, volume1);
        Assert.assertEquals(2, toLitres, 0.0);
    }

    @Test
    public void given1KiloGramAnd1000Gram_WhenCompared_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement weight = new QuantityMeasurement(EnumConversion.Unit.KILOGRAM, 1.0);
        QuantityMeasurement weight1 = new QuantityMeasurement(EnumConversion.Unit.GRAMS, 1000.0);
        boolean check = weight.conversionComapareCheck(weight, weight1);
        Assert.assertTrue(check);

    }

    @Test
    public void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement weight = new QuantityMeasurement(EnumConversion.Unit.TONNES, 1.0);
        QuantityMeasurement weight1 = new QuantityMeasurement(EnumConversion.Unit.KILOGRAM, 1000.0);
        boolean check = false;
        try {
            check = weight.conversionComapareCheck(weight, weight1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(check);
    }

    @Test
    public void given1TonneAnd1000Grams_WhenAdded_ShouldReturnEqualToGivenValue() {
        QuantityMeasurement weight = new QuantityMeasurement(EnumConversion.Unit.TONNES, 1.0);
        QuantityMeasurement weight1 = new QuantityMeasurement(EnumConversion.Unit.GRAMS, 1000.0);
        double kGrams = weight.addTwoLengths(weight,weight1);
        Assert.assertEquals(1001,kGrams,0.0);
    }

    @Test
    public void given212Fand100C_WhenCompared_ShouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement temperature = new QuantityMeasurement(EnumConversion.Unit.FAHRENHEIT, 212.0);
        QuantityMeasurement temperature1 = new QuantityMeasurement(EnumConversion.Unit.CELSIUS, 100.0);
        boolean check = temperature.conversionComapareCheck(temperature, temperature1);
        Assert.assertTrue(check);

    }
}