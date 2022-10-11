class Recta{
    int l;
    int b;

    public Recta(){
        l=1;
        b=1;
    }

    public Recta(int l,int b){
        this.l=l;
        this.b=b;
    }

    void peri(){
        System.out.println("The perimetre is "+(l+b)*2);
    }

    void area(){
        System.out.println("The area is "+l*b);
    }
}


public class ani2{
    public static void main(String[] args){
        Recta a=new Recta(10,7);
        a.peri();
    }
}