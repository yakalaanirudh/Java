class rectangleb{
    private int length;
    private int breadth;

    public  rectangleb(){
        length=1;
        breadth=1;
    }

    public  rectangleb(int l,int b){
        length=l;
        breadth=b;
    }

    public int getlength(){
        return length;
    }

    public int getbreadth(){
        return breadth;
    }
    public int area(){
        return (length*breadth);
    }

    public int perimetre(){
        return (2*(length+breadth));
    }
}

public class Practice3{
    public static void main(String args[]){
        rectangleb r=new rectangleb();
        System.out.println("Length " +r.getlength());
        System.out.println("Braedth " +r.getbreadth());
        System.out.println("Area " +r.area());
        System.out.println("Perimetre "+ r.perimetre());

        rectangleb r1=new rectangleb(18,18);
        System.out.println("Length " +r.getlength());
        System.out.println("Braedth " +r.getbreadth());
        System.out.println("Area " +r1.area());
        System.out.println("Perimetre "+ r1.perimetre());
    }
}