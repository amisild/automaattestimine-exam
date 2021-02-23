package com.amisild;

public abstract class Ring implements App.Kuju {

    double radius;
    double lengthOfSide;
    String hexColor;

    public double ringiArea(double radius) { //pindala
        double rArea;
        rArea = Math.PI * radius * radius;
        return rArea;
    }

    public double ringiPerimeter(double radius) { //ymberm66t
        double rPerimeter;
        rPerimeter = (radius * 2) * Math.PI;
        return rPerimeter;
    }

    public void setHexColor(String hexColor){
        this.hexColor = hexColor;
    }


}
