public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt( (a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY()) *
       (a.getY() - b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println(p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    Point p4 = new Point(2, 3);
    Point p5 = new Point(4, 5);
    Point p6 = new Point(1, 1);
    System.out.println(p4);
    System.out.println(p5);
    System.out.println(p6);
    System.out.println(Point.distance(p4, p5));
    System.out.println(p5.distanceTo(p6));
  }
}