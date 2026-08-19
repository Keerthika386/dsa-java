package Sprint2.GeometryAndAppliedMath;

import java.util.Scanner;

public class AreaAndPerimeterOfBasicShapes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        if(shape.equals("circle")){
            int r = sc.nextInt();

            double area = 3.14159 * (r*r);
            double perimeter = 2*(3.14159 * r);
            System.out.print("Area= " + area);
            System.out.print(" Perimeter= " + perimeter);

        }else if(shape.equals("rectangle")){

            int l = sc.nextInt();
            int w = sc.nextInt();

            int  area = l*w;
            int perimeter = 2*(l+w);
            System.out.print("Area= " + area);
            System.out.print(" Perimeter= " + perimeter);

        }else if(shape.equals("triangle")){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            double s = (double) (a+b+c)/2;
            double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
            int perimeter = a+b+c;
            System.out.print("Area= " + area);
            System.out.print(" Perimeter= " + perimeter);
        }



    }
}
