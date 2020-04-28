package com.bridgelabz.Quantity;

import java.util.Objects;

public class Length{

    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_FEET = 1.0/12.0;
    private static final double FEET_TO_YARD = 1.0/3.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    private static final double INCH_TO_YARD = 1.0/36.0 ;
    private static final double INCH_TO_CENTIMETER = 2.5;

    enum Unit{FEET,INCH,YARD,CENTIMETER};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return false;
    }

    public double covertInToInch(Unit unit, double value) {
        return unit.equals(Unit.FEET)?value*FEET_TO_INCH:unit.equals(Unit.YARD)?value*YARD_TO_INCH:value;
    }
    public double covertInToFeet(Unit unit, double value) {
        return unit.equals(Unit.INCH)?value*INCH_TO_FEET:unit.equals(Unit.YARD)?value*YARD_TO_FEET:value;
    }
    public double covertInToYard(Unit unit, double value) {
        return unit.equals(Unit.FEET)?value*FEET_TO_YARD:unit.equals(Unit.INCH)?value*INCH_TO_YARD:value;
    }
    public double covertInToCentiMeter(Unit unit, double value) {
        return unit.equals(Unit.INCH)?value*INCH_TO_CENTIMETER:value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
