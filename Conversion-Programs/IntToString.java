
//Java int to String Example
public class IntToString {
    public static void main(String[] args) {
        int i = 200;
        String string = String.valueOf(i);
        // Example using String.valueOf()
        System.out.println(i + 20);// 220 because + is binary plus operator
        System.out.println(string + 20);// 20020 because + is string concatenation operator

        // Example using Integer.toString()
        String str = Integer.toString(i);
        System.out.println(i+100);// 300 because + is binary plus operator
        System.out.println(str+100);// 200100 because + is string concatenation operator

        // Example using String.format()
        String str1 = String.format("%d", i);
        System.out.println(i+200);// 400 because + is binary plus operator
        System.out.println(str1+200);// 200200 because + is string concatenation operator

    }
}
