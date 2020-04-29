package com.bridgelabz.Quantity;

public class EnumConversion {
    public enum Unit {
        FEET(12.0){
            @Override
            public double convertToUnit(double value){
                return value*12;
            }

        },
        INCH(1.0){
            @Override
            public double convertToUnit(double value) {
                return value; }
        },
        YARD(36.0){
            @Override
            public double convertToUnit(double value){
                return value*36.0;
            }

        },
          CENTIMETER(0.4){
              @Override
              public double convertToUnit(double value) {
                  return (value / 2.5);
              }
          },
          GALLON(3.78){
              @Override
              public double convertToUnit(double value) {
                  return (value * 3.78);
              }
          },
          LITRE(1.0){
              @Override
              public double convertToUnit(double value){
                  return value;
              }

          },
          MILILITRE(0.001){
              @Override
              public double convertToUnit(double value){
                  return (value/1000);
              }

          },
          KILOGRAM(1.0){
              @Override
              public double convertToUnit(double value){
                  return value;
              }

          },
          GRAMS(0.001){
              @Override
              public double convertToUnit(double value){
                  return value/1000;
              }

          },
          TONNES(1000){
              @Override
              public double convertToUnit(double value){
                  return (value*1000);
              }

          },
          FAHRENHEIT(212){
              @Override
              public double convertToUnit(double fValue){
                  double celsius = ((fValue - 32) * 5/9);
                  return celsius;
              }

          },
          CELSIUS(100){
              @Override
              public double convertToUnit(double value){
                  double fahrenheit = ((100 * 9/5 )+ 32);
                  return fahrenheit;
              }

          };
        public  double value;

        Unit(double value) {
            this.value = value;
        }

        public abstract double convertToUnit(double value);

    }

}

