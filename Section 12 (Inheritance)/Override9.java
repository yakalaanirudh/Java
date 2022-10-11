class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}

}

class LuxaryCar extends Car
{
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}

}

public class Override9
{

    public static void main(String[] args)
    {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof();
    }

}
/*
When we try to execute
Car Started
Car is Accelerated
Automatic Gea

c.openRoof(); CAnt be executed
we cannot call SUBCLASS FUNCTIONS FROM A SUPERCLASS REFERENCE

1)WHEN WE HAVE A REFERENCE OF A CLASS WITH OBJECT OF ANOTHER CLASS OUTPUT DEPENDS ON OBJECT CLASS

2)WE CANNOT CALL A SUBCLASS FUNCTIONS FROM A SUPERCLASS REFERENCE
S