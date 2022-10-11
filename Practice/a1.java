class House{
    static int price=2000;
    static int age=20;
    static int t;

    static int Total(String City)
    {
        switch(City)
        {
            case "A":
                return t=(price*10);
            case "B":
                return t=(price*18);
            case "C":
                return t=(price*7);
        }
        return t;
    }
}

class a1{
    public static void main(String args[]){
        House h=new House();
        System.out.println(h.price);
        System.out.println(h.Total("A"));
    }
}