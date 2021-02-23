package com.amisild;

import java.lang.Math.*;

public abstract class Kolmnurk implements App.Kuju {
    double radius;
    double lengthOfSide;
    double height;
    double base;
    double oneSide;
    double otherSide;
    String hexColor;

    public double kolmnurgaArea(double height, double base) { //pindala
        double kArea;
        kArea = (height * base) / 2;
        return kArea;
    }

    public double kolmnurgaPerimeter(double base, double oneSide, double otherSide) { //ymberm66t
        double kPerimeter;
        kPerimeter = base + oneSide + otherSide;
        return kPerimeter;
    }
}
