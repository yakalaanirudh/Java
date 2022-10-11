import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    public int compareTo(Object o)  //CompareTo only takes object object as argument, so we give object and later typecast it to point
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}

public class ComparableInterface7 {

    public static void main(String[] args) {
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        
        System.out.println(ts);
    }
    
}


//A comparable interface is similar to TreeSet but in treeset where we comapre integers
//In a Comparable Interface we compare objects
//It is achieved by overwriting the compare to method of the comparable Interface
//Tree Set is a sorted set so it must implement comparable and we need to overwrite compare to method