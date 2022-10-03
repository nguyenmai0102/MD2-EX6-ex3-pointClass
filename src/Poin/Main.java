package Poin;

public class Main {
    public static void main(String[] args) {
      // check PointClass
        System.out.println("-------------pointClass------------ ");

        PointClass pointClass = new PointClass();
        System.out.println(pointClass);


        pointClass = new PointClass(5,7 );
        System.out.println(pointClass);

        // check MovaBlePoint
        System.out.println("--------------- MovablePoint--------------");

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(7,10);
        System.out.println(movablePoint);
    }
}

