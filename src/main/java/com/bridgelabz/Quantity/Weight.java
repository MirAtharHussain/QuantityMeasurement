package com.bridgelabz.Quantity;

import java.util.Objects;

public class Weight {
    private static final double KG_TO_GRAMS = 1000;
    private static final double TONNE_TO_KG = 1000;
    private static final double GRAMS_TO_KG = 0.001;
    private final double value;
    private final Unit unit;
    
    enum Unit{KG, GRAM, TONNE}

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    public double convertInToGrams(Unit unit, double value) {
        return unit.equals(Unit.KG)?value*KG_TO_GRAMS:value;
    }

    public double convertInToKG(Unit unit, double value) {
        return unit.equals(Unit.TONNE)?value*TONNE_TO_KG:unit.equals(Unit.GRAM)?value*GRAMS_TO_KG:value ;
    }

    public double addInToKG(Unit unit, double value1, Unit unit1, double value2) {
        return convertInToKG(unit, value1) + convertInToKG(unit1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}
