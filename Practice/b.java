class car{
    static String name="BMW";
    static String model="X3";
}

class b{
    public static void main(String args[]){
        car a1=new car();
        car a2=new car();
        a1.model="X7";
        a1.price="3232";
        System.out.println(a1.model);
        System.out.println(a1.price);           //We cant add new properties to class object
    }
}