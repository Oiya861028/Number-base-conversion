import java.util.Scanner;
public class main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your numbers base:");
        String initialBase = sc.nextLine();
        boolean validBase=false; 
        while(!validBase){
            if(initialBase.equals("Decimal") || initialBase.equals("Binary")  || initialBase.equals("Hexadecimal")) validBase=true;
            else {
                System.out.println("Invalid base. Try again:");
                initialBase = sc.nextLine();
            }
        }
        System.out.println("Completed");

    }
}