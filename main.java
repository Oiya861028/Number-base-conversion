import java.util.Scanner;
public class main{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Takes in base from user and checks if it's valid
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

        //Take in a value of the user and check if it matches the base
        System.out.println("Enter the value you want to convert:");
        String value = sc.nextLine();
        System.out.println(validValue(initialBase,value));

    }

    public static boolean validValue(String base, String value){
        if(base.equals("Decimal")){
            try {
                int num = Integer.parseInt(value);
            } catch (Exception e) {
                return false;
            }
            return true;
        } 
        else if (base.equals("Binary")){        
            for(int i=0;i<value.length();i++) {
                switch (value.charAt(i)) {
                    case '0':
                        break;
                    case '1':
                        break;
                    default:
                        return false;
                }
            }
        }
        else {

        }
        return false;
    }
}