package lan.zold;

public class Romb {
    private double side;
    private double a;

    public Romb(double side, double a){
        this.side = side;
        this.a = a;
    }

public double calcPerimeter() {

    return 4* side;
}

public double calcArea() {
    double aRad = Math.toRadians(a);
    return Math.pow(side, 2) * Math.sin(aRad);
}
}
