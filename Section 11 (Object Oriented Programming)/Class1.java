//In this session we create objects using classes

class Circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }


}
//The below is the creation of an object based on the above class
//Circle c1=new Circle();
//Class Reference=New Object

public class Class1 {

    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println("Area:"+c1.area());
        System.out.println("Perimeter:"+c1.perimeter());
        System.out.println("Circumference:"+c1.circumference());
    }

}

/*
The output is
Area:153.93804002589985
Perimeter:43.982297150257104
Circumference:43.982297150257104
 */