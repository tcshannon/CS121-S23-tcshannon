//WIP

public class Main {
    public static void main(String[] args) {
        // create two instances of MyClass
        MyClass obj1 = new MyClass(1, 2.0, "hello");
        MyClass obj2 = new MyClass(3, 4.0, "world");

        // call getCount() on each instance
        System.out.println("obj1 count: " + obj1.getCount());
        System.out.println("obj2 count: " + obj2.getCount());

        // call getCount() on the class itself
        System.out.println("MyClass count: " + MyClass.getCount());
    }
}
