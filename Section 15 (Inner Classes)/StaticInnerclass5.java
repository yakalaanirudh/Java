/*
Static inner classes are the members of the static outer classes
An object of a static inner class can be created anywhere
and we dont have to create a object of outer class
 */

class Outer{
    static int x=10;
    int y=20;

    static class Inner{
        void display()
        {
            System.out.println(x);
            System.out.println(y);      //Wont because static members cannot access non-static members
        }
    }
}

class Test{
    public static void main()
    {
        Outer.Inner oi=new Outer.Inner();   //Here we are not using new Outer().Inner()
        oi.display();
    }
}