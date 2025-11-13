public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube(); // default side is 1 due to the default constructor of Cube
        this.color = "black"; // default color is black
    }

    public Cube2(int side) {
        this(); // calls the previous constructor
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        basicCube = new Cube(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + color + "\"}";
    }

    public Cube2 add(Cube2 otherCube) {
        int num1 = this.getSide() * this.getSide();
        int num2 = otherCube.getSide() * otherCube.getSide();
        int num3 = num1 + num2;
        if (Math.sqrt(num3) != (int) Math.sqrt(num3)) {
            throw new IllegalArgumentException("The two sides and their sum must form a Pythagorean triple.");
        }
        return new Cube2((int) Math.sqrt(num3));
    }

    public Cube2 minus(Cube2 otherCube) {
        int num1 = this.getSide() * this.getSide();
        int num2 = otherCube.getSide() * otherCube.getSide();
        int num3 = Math.abs(num1 - num2);
        if (Math.sqrt(num3) != (int) Math.sqrt(num3)) {
            throw new IllegalArgumentException("The two sides and their difference must form a Pythagorean triple.");
        }
        return new Cube2((int) Math.sqrt(num3));
    }

    public boolean equals(Cube2 otherCube) {
        if (this.getSide() == otherCube.getSide() && this.getColor().equals(otherCube.getColor())) {
            return true;
        }
        return false;
    }
}
