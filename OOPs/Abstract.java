package OOPs;
//Abstract Class Example

abstract class Noun{
    abstract void name();//Abstract method should be end with semicolon
    abstract void name1();//beacuse it has no body
}

abstract class Honesty extends Noun{
    void name(){
        System.out.println("Honesty is an abstract noun");//Here we are implementing the name method
    }
}

class Happiness extends Honesty{
    void name1(){//Here we are implementing the name1 method
        System.out.println("Happiness is also an abstract noun");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Happiness obj = new Happiness();//Subclass's object bz we can't create the object of an abstract class
        obj.name();
        obj.name1();
    }
}