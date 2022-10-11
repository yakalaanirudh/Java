
class Rectangle{
    static int x;
    static int y;

    public Rectangle(){
        x=1;
        y=1;
    }

    public  Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static int area(){
        return x*y;
    }
};

class costarea{
    public static void calculate(Rectangle r){
        System.out.println(r.x*r.y*300);
    }
}

class costfence{
    public static void calculate(Rectangle r){
        System.out.println(r.x*r.y*3);
    }
}





public class p {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,20);
        costarea c = new costarea();
        costfence f=new costfence();
        c.calculate(r);
        f.calculate(r);

    }
}