/*
We observed in print stream that the we need to convert the data type from outstream to input stream
as the data type of printed objects is string and we need to convert them to int by parsing

we do this in 3 different solution types
1   PrintStream     9a and 9b
2   DataStream      10
3   Serialization   11


In print stream we need to parse data to get the data in the required data Type

In Datastream we can write data in its datatype and retrieve it

But in both the above methods we write every property of the class individually
i.e we write roll no seperately,name seperately and department sepearetly 
in serialization we directly write the complete object
 */


//SERIALZATION IS THE STATE OF STORING A=THE OBJECT AND RETRIEVING THE OBJECT
//THE RETRIEVING THE OBJECT IS CALLED DESERIALZATION