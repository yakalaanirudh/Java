// Java program to demonstrate initializing
// an array of objects using constructor

class DSA2 {

    public static void main(String args[])
    {

        // Declaring an array of student
        Student2[] arr;

        // Allocating memory for 2 objects
        // of type student
        arr = new Student2[2];

        // Initializing the first element
        // of the array
        arr[0] = new Student2(1701289270, "Satyabrata");

        // Initializing the second element
        // of the array
        arr[1] = new Student2(1701289219, "Omm Prasad");

        // Displaying the student data
        System.out.println(
                "Student data in student arr 0: ");
        arr[0].display();

        System.out.println(
                "Student data in student arr 1: ");
        arr[1].display();
    }
}

// Creating a student class with
// id and name as a attributes
class Student2 {

    public int id;
    public String name;

    // Student class constructor
    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // display() method to display
    // the student data
    public void display() {
        System.out.println("Student id is: " + id + " "
                + "and Student name is: "
                + name);
        System.out.println();
    }
}
