package com.amisild;

import org.mockito.Mock;

public class Main {
    public static void main(String[] args) {

    }

    interface Kuju {
        double ringiArea(double radius);
        double ringiPerimeter(double radius);
        double kolmnurgaArea(double height, double base);
        double kolmnurgaPerimeter(double base, double oneSide, double otherSide);
    }
}
