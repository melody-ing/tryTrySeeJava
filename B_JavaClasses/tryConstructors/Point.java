package B_JavaClasses.tryConstructors;

public class Point {
    // 類別的屬性和方法(static)
    public static int ORIGIN_X = 0;
    public static int ORIGIN_Y = 0;

    public static void renderOrigin() {
        System.out.println(Point.ORIGIN_X + ',' + Point.ORIGIN_Y);
    }

    // 物件的屬性、方法和建構式(non-static)
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render() {
        System.out.println(this.x + "," + this.y);
    }

}
