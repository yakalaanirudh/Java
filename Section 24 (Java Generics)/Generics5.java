/*
1
ONLY EXTENDS IS ALLOWED IN GENERIC CLASS DEFINITION     

2
USE EXTENDS NOT IMPLEMENTS EVEN FOR INTERFACE

3
EXTENDS FROM ONLY ONE CLASS AND MULTIPLE INTERFACES
class MyArray<T extends A&B>{Here it is extending class A and implementing Class B}
in the above the first argumennt A must be class remaining can be interfaces
A cant be an interface even if one other class in {B,C,D,E} is a class


4
EXTENDS AND SUPER IS ALLOWED IN Wildcards that ie generic arguments

5
<?> WILL ACCEPT ALL TYPES BUT CANNOT ACCESS
public class GenericDemo{
    static void fun(MyArray<? extends String> obj){obj.append(null)}; //Here it wont allow anything except if we write that type in ?

    public static void main(String[] args){MyArray<String> ma1=new MyArray<>();
    fun(ma1);};
}

6
BASE TYPE OBJECT SHOULD BE SAME OR SHOULD BE A ?
MyArray<String> ma1=new MyArray<String>();          The datatype specified in obj and class should be same
MyArray<String> ma1=new MyArray<Obj>();             Not Allowed
 */

