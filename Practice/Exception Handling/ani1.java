class Rect{
    int l;
    int b;

    public Rect(){
        l=1;
        b=1;
    }

    public Rect(int l,int b){
        this.l=l;
        this.b=b;
    }
}

class methods{

    void peri(Rect a){
        System.out.println("The perimetre is "+(a.l+a.b)*2);
    }

    void area(Rect a){
        System.out.println("The area is "+a.l*a.b);
    }
}

public class ani1{
    public static void main(String[] args){
        Rect a=new Rect();
        methods m=new methods();
        m.peri(a);
        m.area(a);
    }
}