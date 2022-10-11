class LowDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be less than 10";
    }
}

class square{
    int s;

    public square(int s) throws LowDimensionException{
       if(s<10) throw new LowDimensionException();
       this.s=s;
    }

    void area(){
        System.out.println("The area of the square is "+s*s);
    }
}

public class a{
    public static void main(String[] args){
        try{
            square s=new square(7);
            s.area();
        }
        catch(LowDimensionException e){
            System.out.println(e);
        }

    }
}
//The throw keyword is used to throw an exception explicitly.
// It can throw only one exception at a time.
// The throws keyword can be used to declare multiple exceptions, separated by a comma.

/*
class LowDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be less than 10";
    }
}

First we define the exception in a toString Method
 */

/*
class square{
    int s;

    public square(int s) throws LowDimensionException{
       if(s<10) throw new LowDimensionException();
       this.s=s;
    }

    void area(){
        System.out.println("The area of the square is "+s*s);
    }
}

public class a{
    public static void main(String[] args){
            square s=new square(7);
            s.area();

    }
}

When we write an exception like this we are the thows method will throw the exception when called
but java will show an error that it is not caught

    public square(int s) throws LowDimensionException{ //Throws means this method might cause an excption and need to be caught
       if(s<10) throw new LowDimensionException();      //This throw means it happens here
       this.s=s;
    }

 */