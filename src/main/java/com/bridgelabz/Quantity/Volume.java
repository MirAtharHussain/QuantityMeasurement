package com.bridgelabz.Quantity;

import java.util.Objects;

public class Volume {

    private static final double GALLON_TO_LITRES = 3.78;
    private static final double LITRES_TO_GALLON = 1.0 / 3.78;
    private static final double LITRES_TO_ML = 1000;
    private static final double ML_TO_LITRE = 0.001;

    private final Unit unit;
    private final double value;


    enum Unit{GALLON, LITRE, ML}

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return false;
    }

    public double convertInTOLitres(Unit unit, double value) {
        return unit.equals(Unit.GALLON)?value*GALLON_TO_LITRES:unit.equals(Unit.ML)?value*ML_TO_LITRE:value;
    }
    public double convertInTOMl(Unit unit, double value) {
        return unit.equals(Unit.LITRE)?value*LITRES_TO_ML:value;
    }
    public double addInToLitres(Unit unit1, double value1, Unit unit2, double value2) {
        return convertInTOLitres(unit1, value1) + convertInTOLitres(unit2, value2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
