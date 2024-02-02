//Java Program to illustrate the use of Rectangle class which  
//has length and width data members

class Rectangle {
    int length, width;
    String s;

   Rectangle(String s){
      System.out.println("We can create also an anonymous object with the help of new keyword");
    }

   Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    void area(){
        System.out.println("Area of the rectangle is : "+(length*width)+" SquareUnit");
    }
}

public class ObjectExample1 {
    public static void main(String[] args) {
        new Rectangle("s");//Anonymous Object

    //   Rectangle obj = new Rectangle(12, 23);
    //   Rectangle obj1 = new Rectangle(14, 27);
      //Another way
      Rectangle obj = new Rectangle(12, 23),obj1 = new Rectangle(14, 27);

      obj.area();
      obj1.area();
      
        
    }
}
