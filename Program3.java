import java.util.Scanner;
import java.lang.String;

public class Program3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    System.out.println("zadejte větu");
    String string = scan.nextLine();
    String finish = "";
    for(int i = 0;i+1 <= string.length();i++){
        char l = string.charAt(string.length()-i-1);
        String f=String.valueOf(l);
        finish = finish.concat(f);
}
System.out.println(finish.equalsIgnoreCase(string));
}
}