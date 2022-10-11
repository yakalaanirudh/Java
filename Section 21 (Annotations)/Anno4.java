import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)
@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}
/*
When we give parametrs to an annotation all parameters should be present when we use that annotation
Otherwise it will lead to an error
The only exception is if we have a default value specified
 */
//@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo1
{
    int data;
    //@MyAnno(name="Ajay",project="Bank")


    //@MyAnno(name="Ajay")
    public static void main(String[] args)
    {
        //@MyAnno(name="Ajay")
        int x;
    }

}