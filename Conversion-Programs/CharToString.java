

public class CharToString {
    public static void main(String[] args) {
        // Java char to String Example: String.valueOf() method
        char character = 'S';
        String string = String.valueOf(character);
        System.out.println("String: "+string);
        System.out.println("================");

        // Java char to String Example: Character.toString() method
        String str = Character.toString(character);
        System.out.println("String-1: "+str);
    }
}
