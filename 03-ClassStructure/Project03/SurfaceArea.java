public class SurfaceArea
{    
    public static double circleArea(int r)
    {
        return 3.14*(r*r);
    }
    public static double rectangleArea(int a, int b)
    {
        return a*b;
    }
    public static double triangleArea(int b, int h)
    {
        return 0.5*b*h;
    }

    public static void main (String[] args){
        double cicrle = circleArea(3);
        double rectangle = rectangleArea(4, 5);
        double triangle = triangleArea(3, 4);

        System.out.println(cicrle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
