package OOPs;

//Automatic promotion in overloading


public class Overloading1 {

    //Case : 1

    // public void m1(int i){
    //     System.out.println("in int args-method");
    // }
    // public void m1(float f){
    //     System.out.println("in float args-method");
    // }

    //Promotion hierarchy: byte->short->int->long->float->double; char->int

    //Case : 2

    // public void m1(String s){
    //     System.out.println("in String-agrs method");
    // }
    // public void m1(Object o){
    //     System.out.println("in Object-agrs method");
    // }
    //In overloading chhild class will always get high priority than Parent.

    //Case : 3

    // public void m1(String s){
    //     System.out.println("in String-agrs mehtod");
    // }
    // public void m1(StringBuffer sb){
    //     System.out.println("in StringBuffer-agrs mehtod");
    // }

    //Case : 4

    // public void m1(int i,float f){
    //   System.out.println("in int-float-args method");
    // }
    // public void m1(float f,int i){
    //   System.out.println("in float-int-args method");
    // }
    
    //Case : 5

    // public void m1(int i){
    //     System.out.println("in int-args method");
    // }
    // public void m1(int...i){
    //     System.out.println("in var-args method");
    // }


    public static void main(String[] args) {
        
        // Overloading1 obj = new Overloading1();
       
       
        // obj.m1('a');//char will promote to int
        // obj.m1(10l);//long will promote to float
        // obj.m1(10.9);//double is last so it will give compile time error.

        // obj.m1(obj);// in Object-agrs method
        // obj.m1("null");//in String-agrs method
        // obj.m1(null);//in String-agrs method

        // obj.m1("null");//in String-agrs mehtod
        // obj.m1(new StringBuffer());//in StringBuffer-agrs mehtod

        // obj.m1(1, 5.5f);//in int-float-args method
        // obj.m1(5.8f, 0);//in float-int-args method
        // obj.m1(10,12);//compile time error
        // obj.m1(1.2f, 2.3f);//compile time error

        // obj.m1(1);//in int-args method
        // obj.m1();//in var-args method
        // obj.m1(12,34);//in var-args method
        // obj.m1('j');//in int-args method

        

    }
}
