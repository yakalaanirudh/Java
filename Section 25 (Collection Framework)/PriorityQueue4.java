import java.util.*;

class MyCom implements Comparator<Integer>  //A priority queue should implement comparator to compare elements
{
    public int compare(Integer o1,Integer o2)   //This comparator is for changing min heap to max heap
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityQueue4
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());

        p.forEach((x)->System.out.println(x));

        p.poll();

        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));

    }
}
//30
//30 15 20 5 10 3
//20 15 3 5 10              //After removing first element


/*THE ABOVE IS MAX HEAP


FOR MIN HEAP THE BELOW
public int compare(Integer o1,Integer o2)
    {
        if(o1>o2)return 1;
        if(o1<o2) return -1;
        return 0;
    }

 */