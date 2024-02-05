package OOPs;

//Java Program to demonstrate the use of static variable and static method..

class Employees{
    int id;
    String name;
    static String comp_name = "Alpha-Gold Pvt Ltd.";//It will print same value for all Employee

    static void show(){
        System.out.println("There is no need to create an object for static method.");
    }
    void insert(int n,String s){
        id = n;
        name = s;
    }
    void display(){
        System.out.println(id+" : "+name+" : "+comp_name);
    }
}

public class Static {
    public static void main(String[] args) {
        Employees obj = new Employees();
        Employees obj1 = new Employees();
        Employees obj2 = new Employees();
        Employees obj3 = new Employees();
        obj.insert(121, "Ramesh");
        obj1.insert(321, "Kamal");
        obj2.insert(231, "Ravi");
        obj3.insert(122, "Hitesh");
        System.out.println("Employees details...");
       // Employees.comp_name="Square-Yard Ltd.";//We can also change the Company name.
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();

        Employees.show();//Here we are calling static method...
    }
}
