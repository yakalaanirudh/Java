class rectanglea{
    public int length;
    public int breadth;

   public  rectanglea(){
       length=1;
       breadth=1;
   }

    public  rectanglea(int l,int b){
        length=l;
        breadth=b;
    }
    public int area(){
        return (length*breadth);
    }

    public int perimetre(){
        return (2*(length+breadth));
    }
}

public class Practice2{
    public static void main(String args[]){
        rectanglea r=new rectanglea();
        System.out.println("Area " +r.area());
        System.out.println("Perimetre "+ r.perimetre());

        rectanglea r1=new rectanglea(7,10);
        System.out.println("Area " +r1.area());
        System.out.println("Perimetre "+ r1.perimetre());
    }
}