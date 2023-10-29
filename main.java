import java.util.Scanner;
public class main{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Takes in base from user and checks if it's valid
        System.out.println("Enter your numbers base:");
        String initialBase = sc.nextLine();
        boolean validIniBase=validBase(initialBase); 
        while(!validIniBase){
            System.out.println("Invalid Base. Try again:");
            validIniBase=validBase(initialBase);
        }

        //Take in a value of the user and check if it matches the base
        System.out.println("Enter the value you want to convert:");
        String value = sc.nextLine();
        boolean validValue = validValue(initialBase,value);
        while(validValue==false){
            System.out.println("This value does not work. Try again:");
            value = sc.nextLine();
            validValue = validValue(initialBase, value);
        }

        //Take in base user want to convert and checks it
        System.out.println("What do you want to convert to?");
        String finalBase = sc.nextLine();
        boolean validFinalBase = validBase(finalBase);
        while(!validFinalBase){
            System.out.println("Invalid Base. Try again:");
            validFinalBase=validBase(finalBase);
        }
        
        //convert
        if(initialBase.equals(finalBase)){
            System.out.println("");
        }
    }
    public static boolean validBase(String base) {
        if(base.equals("Decimal") || base.equals("Binary")  || base.equals("Hexadecimal")) return true;
        return false;
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
            for(int i=0;i<value.length();i++) {
                switch (value.charAt(i)) {
                    case '0':
                        break;
                    case '1':
                        break;
                    case '2':
                        break;   
                    case '3':
                        break;   
                    case '4':
                        break;   
                    case '5':
                        break;   
                    case '6':
                        break;   
                    case '7':
                        break;
                    case '8':
                        break;
                    case '9':
                        break;
                    case 'A':
                        break;
                    case 'B':
                        break;
                    case 'C':
                        break;
                    case 'D':
                        break;
                    case 'E':
                        break;   
                    default:
                        return false;
                }
            }
        }
        return true;   
    }
}