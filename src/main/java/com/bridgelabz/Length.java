package com.bridgelabz;

public class Length {
    public enum Unit { FEET, INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}
