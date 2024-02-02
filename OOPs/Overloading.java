//Overloading Examples
//In overloading: All methods should be with same name but different argument types.

class Generator{
    public void overload(String s){
      System.out.println("So many appliances are used");
    }

    public void overload(int n){
        System.out.println("Appliances used: "+n);
    }

    public void overload(){
       System.out.println("So generator is overloaded.");
    }
}

public class Overloading {
    public static void main(String[] args) {

        Generator obj = new Generator();//Object of Generator class
        obj.overload("s");
        obj.overload(50);
        obj.overload();
        
    }
}
