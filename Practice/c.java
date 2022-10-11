class Bike{
    static int cost=200;
    int mileage=3000;
}

class c{
    public static void main(String args[]){
        System.out.println(Bike.cost);
        //System.out.println(Bike.mileage);         //It is not static so can tbe outputted

        Bike b=new Bike();
        System.out.println(b.cost);
        System.out.println(b.mileage);
    }
}
