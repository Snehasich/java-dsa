package placement.VTP_technical;

interface Inter {
    double rad(int r);
    double rad(int base, int height);
}

class Circle implements Inter {

    @Override
    public double rad(int r) {
        double area = Math.PI * r * r;
        System.out.println("Area of circle with radius " + r + " is: " + area);
        return area;
    }

    // unused method (mandatory)
    @Override
    public double rad(int base, int height) {
        return 0;
    }
}

class Triangle implements Inter {

    // unused method (mandatory)
    @Override
    public double rad(int r) {
        return 0;
    }

    @Override
    public double rad(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle with base " + base +
                " and height " + height + " is: " + area);
        return area;
    }
}

class q2 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Triangle t = new Triangle();

        c.rad(8);
        t.rad(2, 3);
    }
}
