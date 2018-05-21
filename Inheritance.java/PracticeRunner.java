public class PracticeRunner
{
    public static void main(String[] args)
    {
        TrianglePractice triangle = new TrianglePractice(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println(triangle);
        triangle.howToColor();
    }
}