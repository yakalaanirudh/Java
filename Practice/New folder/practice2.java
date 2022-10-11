class rectangle{
    int length;
    int breadth;

    rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void display(){
        System.out.println("The rectangle has a length and breadth "+length+" and "+breadth+" respectively");
    }
}

class calculations{
    rectangle r;
    public void area(rectangle r){
        System.out.println("The rectangle has an area"+r.length*r.breadth);
    }

    public void perimetre(rectangle r){
        System.out.println("The rectangle has a perimetre"+2*(r.length+r.breadth));
    }

}

public class practice2{
    public static void main(String[] args){
        rectangle a=new rectangle(10,20);
        calculations c=new calculations();
        a.display();
        c.area(a);
        c.perimetre(a);s
    }
}