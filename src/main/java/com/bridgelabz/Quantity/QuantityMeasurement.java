package com.bridgelabz.Quantity;


public class QuantityMeasurement {

    private final double value;
    private final EnumConversion.Unit unit;

    public QuantityMeasurement(EnumConversion.Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
    public boolean conversionComapareCheck(QuantityMeasurement measurement, QuantityMeasurement measurement1) throws QuantityMeasurementException {
        return Double.compare(measurement.value* measurement.unit.convertToUnit(this.value), measurement1.value*measurement1.unit.convertToUnit(this.value))==0;
    }
   public double addTwoLengths(QuantityMeasurement measurement, QuantityMeasurement measurement1){
        return compareCheck(measurement) + compareCheck(measurement1);
   }

    private double compareCheck(QuantityMeasurement measurement) {
        return measurement.value* measurement.unit.value;
    }
}


