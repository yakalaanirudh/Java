import java.util.*;

public class ArrayDeque3
{
    public static void main(String[] args)
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();

         dq.offerLast(10);          //Instead of add last
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);

         dq.pollFirst();                //Removing from first
         dq.pollLast();                //Removing from last

         dq.offerFirst(1);
         dq.offerFirst(2);
         dq.offerFirst(3);
         dq.offerFirst(4);

         dq.forEach((x)->System.out.println(x));

    }
}
//4 3 2 1 10 20 30 40
//Deque means we can enter and remove elements from both the beginning and ending
//If we insert and delete from one end then it is stack
//If we insert from one end and delete from another end then it is queue
//We assume insertion happens from middle as java doc says insertion is always constant time