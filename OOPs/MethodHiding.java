//Method Hiding...
//Both Parent and Child class must be static...

class Parent{
    public static void m1(){
        System.out.println("in static method of Parent");
    }
}

class Child extends Parent{
    public static void m1(){
        System.out.println("in static method of Child");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Child.m1();
    }
}
