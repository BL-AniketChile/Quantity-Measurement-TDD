package com.bridgelabz;

public class Length {
    private static final double FEET_TO_INCH = 12.0;

    public enum Unit {FEET, INCH}

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length length) {
        if (length.unit.equals(this.unit))
            return Double.compare(length.value, this.value) == 0;
        if (this.unit.equals(Unit.FEET) && length.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,length.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return compare(length);
    }
}
