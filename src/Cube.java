public class Cube {
    private int side;

    public Cube() {
        this.side = 1; // Set side length to 1 by default if no argument is passed when calling the
                       // constructor
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("Side length must be greater than 1.");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 1.");
        }
        this.side = side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    public String toString() {
        return "Cube {side=" + side + "}";
    }
}