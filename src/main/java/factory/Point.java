package factory;

public class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    private Point(double a, double b, CoordinateSystem cs) {
//        switch (cs) {
//            case POLAR:
//                x = a * Math.cos(b);
//                y = a * Math.sin(b);
//                break;
//            case CARTESIAN:
//                this.x = a;
//                this.y = b;
//                break;
//        }
//    }

    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }

}
