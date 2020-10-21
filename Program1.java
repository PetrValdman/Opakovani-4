import java.util.Scanner;
import java.lang.String;

public class Program1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("zadejte větu");
    String string1 = scan.nextLine();
    String string2 = scan.nextLine();
    System.out.println(string1.startsWith(string2));

}
}