import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);       //5 will be inserted at 0 and 10 will be pushed to next index
        //al1.addAll(al2);               //Adds elements of al2 to al1
        //5,10,50,60,70,80,90


        al1.addAll(1,al2);              //5,50,60,70,80,90,10
        al1.add(5,70);          //5,50,60,70,80,70,90,10
        al1.set(6,100);                         //5,50,60,70,80,70,100,10
        
        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
        
        //System.out.println(al1.contains(25));         //false
        //System.out.println(al1.get(5));               //Element at 5th index
        //System.out.println(al1.indexOf(70));          //First Index of 70
        //System.out.println(al1.lastIndexOf(70));      //Last Index of 70
        
        //System.out.println(al1);
        
        /*for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));*/
        
        /*for(Integer x:al1)
            System.out.println(x);*/
        
        /*for(Iterator<Integer> it= al1.iterator(); it.hasNext();)      //If it has next element it will print
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/
        
        /*al1.forEach((x)->{
            System.out.println(x);
        });*/
        
        /*for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
        
        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}

/*
Iterator we can only move forwards
List iterator we can move forwards and backwards
 */