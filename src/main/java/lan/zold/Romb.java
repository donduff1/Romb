package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    private double side;
    private double a;
    private double b;

    public Romb(double side, double a, double b){
        this.side = side;
        this.a = a;
        this.b = b;
    }

public double calcPerimeter(double side) {
    if (side <=0) {
        throw new InputMismatchException();
    }
    return 4* side;
}

public double calcArea(double side, double a, double b) {
    if (side <= 0 || a <= 0) {
        throw new InputMismatchException();
    }
    double aRad = Math.toRadians(a);
    double bRad = Math.toRadians(b);
    return Math.pow(side, 2) * Math.sin(aRad) * Math.sin(bRad);
}

}
