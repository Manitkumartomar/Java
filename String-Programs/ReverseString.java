import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence here to reverse it: ");
        String sentence = scanner.nextLine();
        String newString = "";
        for(int i=sentence.length()-1;i>=0;i--){
            newString = newString+sentence.charAt(i);
        }
        System.out.println("Old sentence: "+sentence);
        System.out.println("=================================");
        System.out.println("Reverse sentence: "+newString);
        scanner.close();
    }
}
