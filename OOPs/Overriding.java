//Overriding Example

class Explanation{
    public void m1(){
        System.out.println("Overrided explanation");
    }
}

class Explanatoin1 extends Explanation{
    public void m1(){
        System.out.println("For overriding any method,method signatures must be same.");
    } 
}

// Rules Practice
//Return type must be same but co-variant return types are allowed.

// class Parent{
//     public Object m1(){
//         return null;
//     }
// }
// class Child extends Parent{
//     public String m1(){
//         return "String";
//     }
// }

//For abstraction we can irreversible overriding.

//  abstract class Parent{
//     public abstract void m1();
// }
// class Child extends Parent{
//     public void m1(){
//         System.out.println("in non-final method");
//     }
// }

//We can't reduce the scope of modifiers.

// class Parent{
//     public void m1(){
//         System.out.println("in Parent");
//     }
// }
// class Child extends Parent{
//     protected void m1(){
//         System.out.println("in Child");
//     }
// }

public class Overriding {
    public static void main(String[] args) {
        Explanatoin1 obj = new Explanatoin1();
        obj.m1();

        // Child obj = new Child();
        // String res = obj.m1();
        // System.out.println(res);
    }
}
