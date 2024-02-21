
//Java Program to demonstrate the conversion of String into int  
public class StringToInt {
    public static void main(String[] args) {
        // Declaring String variable
        String string = "200";
        // Converting String into int using Integer.parseInt()
        int i = Integer.parseInt(string);
        System.out.println(string + 500);// 200500, because "200"+500, here + is a string concatenation operator
        System.out.println(i + 1000);// 1200, because 200+1000, here + is a binary plus operator

        // using Integer.valueOf() method
        // converting String into Integer using Integer.valueOf() method
        Integer j = Integer.valueOf(string);
        System.out.println(j);

        // The case of NumberFormatException
        try {
            // Declaring String variable
            String s = "hello";
            int k = Integer.parseInt(s);
            System.out.println(k);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
