class Triangle {

    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        double max1 = Math.max(side1, Math.max(side2, side3));
        double max3 = Math.min(side1, Math.min(side2, side3));
        double max2 = (side1 + side2 + side3) - (max1 + max3);
        if ((max2 + max3) <= max1) {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        return ((side1 == side2) && (side2 == side3) && (side3 == side1));
    }

    boolean isIsosceles() {
        return ((side1 == side2) || (side2 == side3) || (side3 == side1));
    }

    boolean isScalene() {
        return ((side1 != side2) && (side2 != side3) &&( side3 != side1));
    }

    public static void main(String[] args) throws TriangleException {
        Triangle triangle = new Triangle(1, 3, 1);
        System.out.println(triangle.isIsosceles());
    }

}
