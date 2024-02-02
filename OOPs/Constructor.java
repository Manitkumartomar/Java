//Constructor Example

class Directions {
    // Default Constructor
    Directions() {
        System.out.println("Names of four directions are...");
    }

    // Parameterized Constructor
    Directions(int n) {
        System.out.println("Number of Directions is: " + n);
    }

    void display() {
        System.out.println("East, West, North, South");
    }
}

public class Constructor {
    public static void main(String[] args) {
        new Directions(4);//Anonymous Object
        Directions obj = new Directions();
        obj.display();

    }
}
