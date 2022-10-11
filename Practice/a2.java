class House{
    static int price=2000;
    static int age=20;
    static int t;
    static int u;

     class MFunc{
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

        static int Resell(String City)
        {
            switch(City)
            {
                case "A":
                    return u=(price*1);
                case "B":
                    return u=(price*2);
                case "C":
                    return u=(price*3);
            }
            return u;
        }
    }

}

class a1{
    public static void main(String args[]){
        House.MFunc h=new House().new MFunc();
        //System.out.println(h.price);
        System.out.println(h.Total("A"));
        System.out.println(h.Resell("A"));
    }
}
