package lan.zold;

import java.util.InputMismatchException;

public class Romb {


public double calcPerimeter(double side) {
    if (side <=0) {
        throw new InputMismatchException();
    }
    return 4* side;
}

public double calcArea(double side, double a) {
    if (side <= 0 || a <= 0) {
        throw new InputMismatchException();
    }
    double aRad = Math.toRadians(a);
    return Math.pow(side, 2) * Math.sin(aRad);
}

}
