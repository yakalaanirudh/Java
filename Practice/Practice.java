class rectangle{
    public int length;
    public int breadth;

    public void setlength(int l){
        length=l;
    }

    public void setbreadth(int b){
        breadth=b;
    }

    public int area(){
        return (length*breadth);
    }

    public int perimetre(){
        return (2*(length+breadth));
    }
}

public class Practice{
    public static void main(String args[]){
        rectangle r=new rectangle();
        r.setlength(7);
        r.setbreadth(10);
        System.out.println("Area " +r.area());
        System.out.println("Perimetre "+ r.perimetre());
    }
}