package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    private double side;
    private double a;

    public Romb(double side, double a){
        this.side = side;
        this.a = a;
    }

public double calcPerimeter() {
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

public double CalcPerimeter(int i) {
    return 0;
}
}
