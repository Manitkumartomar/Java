//Overriding with respect to var-arg method
//If we want to override the var-arg method then both Parent and Child method must be with var-arg...

class Parent{
    public void m(int...i){
     System.out.println("in Parent class");
    }
}
class Child extends Parent{
    public void m(int...i){
        System.out.println("in Child class");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m(null);
        Child obj1 = new Child();
        obj1.m(1);
        Parent obj2 = new Child();
        obj2.m(null);
    }
}
