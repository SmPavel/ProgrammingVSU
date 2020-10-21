package vsu.pustoslov.figures;

public class Rectangle {
    private final double leftCornerPointX0;
    private final double leftCornerPointY0;
    private final double lengthX;
    private final double widthY;

    public Rectangle(double leftCornerPointX0, double leftCornerPointY0, double lengthX, double widthY) {
        this.leftCornerPointX0 = leftCornerPointX0;
        this.leftCornerPointY0 = leftCornerPointY0;
        this.lengthX = lengthX;
        this.widthY = widthY;
    }

    public boolean isPointInsideRectangle(double x, double y) {
        return (x >= leftCornerPointX0) && (x <= leftCornerPointX0 + lengthX)
                && (y >= leftCornerPointY0) && (y <= leftCornerPointY0 + widthY);
    }
}