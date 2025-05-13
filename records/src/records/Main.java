package records;


public class Main {
    public static void main(String[] args) {

        Point p = new Point (2, 4);
        System.out.println(p);
        System.out.println(p.getX()+ " " + p.getY());
        System.out.println(p.equals(new Point(2, 4)));

        Point2 p2 = new Point2(5, 10);
        System.out.println(p2);
        System.out.println(p2.x() + " " + p2.y());
        System.out.println(p2.equals(new Point2(5, 10)));
    }
}