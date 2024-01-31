package OOPs;
//Interface Example

interface Valuable{//By default in any interface all method inside it is public and abstract
    void concept();
    void thing1();
    void thing2();
}

abstract class Concept implements Valuable {
    public void concept(){
        System.out.println("Valuable is a concept that doesn't exist physically.");
    }
}

abstract class Time extends Concept{
    public void thing1(){
        System.out.println("Time is valuable.");
    }
}

class Health extends Time{
    public void thing2(){
        System.out.println("Health is also valuable.");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        Health obj = new Health();//Creating object of child class...
        obj.concept();//Calling all the methods...
        obj.thing1();
        obj.thing2();
    }
}
