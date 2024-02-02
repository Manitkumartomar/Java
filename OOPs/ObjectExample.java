//We can create multiple objects and store information in them

class Students{
    int rollno;//Instance Variables
    String name;
    void insertRecord(int r,String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno+" : "+name);
    }
}

public class ObjectExample {

    public static void main(String[] args) {

        Students obj1 = new Students();
        Students obj2 = new Students();
        obj1.insertRecord(23, "John");
        obj2.insertRecord(79, "Amit");
        obj1.display();
        obj2.display();
        
    }
}