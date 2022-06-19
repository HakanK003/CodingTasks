package randomTasks;



//public interface Movable{
//
//    void move (int i);
//
//}
//
//
//class DistanceMover {
//
//
//    class implements Movable {
//
//        @Override
//        public void move ( int mile){
//
//        System.out.println(mile + " asdfdsf ");
//
//    }
//
//    }
//
//
//
//}
//
//
//interface AnonymousInnerClass {
//
//
//
//}


// Java Program to Demonstrate Anonymous inner class

// Interface
interface Age {
    int x = 21;
    void getAge();
}


// Class 1
// Helper class implementing methods of Age Interface
class MyClass implements Age {

    // Overriding getAge() method
    @Override public void getAge()
    {
        // Print statement
        System.out.print("Age is " + x);
    }
}

// Class 2
// Main class
// AnonymousDemo
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Class 1 is implementation class of Age interface
        MyClass obj = new MyClass();

        // calling getage() method implemented at Class1
        // inside main() method
        obj.getAge();
    }
}

// Main class
class AnonymousDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {

            @Override public void getAge()
            {
                // printing  age
                System.out.print("Age is " + x);
            }
        };

        oj1.getAge();
    }
}
