import java.util.Scanner;
public class numberBaseConversion {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean exit = false;
        while(!exit){
            //Choose the conversion option
            System.out.println("Choose your conversion:");
            System.out.println("1. Convert Binary to Decimal");
            System.out.println("2. Convert Decimal to Binary");
            System.out.println("3. Convert Binary to Hexadecimal");
            System.out.println("4. Convert Hexadecimal to Binary");
            System.out.println("5. Convert Hexadecimal to Decimal");
            System.out.println("6. Convert Decimal to Hexadecimal");
            System.out.println("7. Exit");
            //Check for valid input
            int option = sc.nextInt();
            while(!(option>0 && option<8)){
                System.out.println("Invalid option. Try again: ");
                option = sc.nextInt();
            }
            //Assigning bases
            String initialBase="";
            int finalBase=10;
            switch(option){
                case 1:
                    initialBase = "Binary";
                    finalBase = 10;
                    break;
                case 2:
                    initialBase = "Decimal";
                    finalBase = 2;
                    break;
                case 3:
                    initialBase = "Binary";
                    finalBase = 16;
                    break;
                case 4:
                    initialBase = "Hexadecimal";
                    finalBase = 2;
                    break;
                case 5:
                    initialBase = "Hexadecimal";
                    finalBase = 10;
                    break;
                case 6:
                    initialBase = "Decimal";
                    finalBase = 16;
                    break;
                default:
                    exit = true;
                    break;
            }
            //Taking input value and testing them
            System.out.println("What value would you like to convert:");
            String value = sc.next();
            boolean validValue = validValue(initialBase, value);
            while(!validValue){
                switch(initialBase){
                    case "Decimal":
                        System.out.println(initialBase+ " can only contain 0-9. Try again:");
                        value = sc.nextLine();
                        break;
                    case "Binary":
                        System.out.println(initialBase+ " can only contain 0 or 1. Try again:");
                        value = sc.nextLine();
                        break;
                    case "Hexadecimal":
                        System.out.println(initialBase+" can only contain A-E or 0-9. Try again:");
                        value = sc.nextLine();
                        break;
                    default:
                        System.out.println("What have you inputted???");
                        break;
                }
                System.out.println("This value does not fit the base " +initialBase+". Try again:");
                value = sc.nextLine();
            }
            //Convert everything to decimal
            int decimalValue;
            if(initialBase.equals("Binary") || initialBase.equals("Hexadecimal")){
                decimalValue = toDecimal(value, initialBase);
            } else { //convert decimal string into decimal int
                decimalValue = Integer.parseInt(value);
            }
            //Final conversion and print out answers
            switch (options) {
                case 1:
                    System.out.println("The decimal value is: "+decimalValue);
                    break;
                case 2:

                case 3:
                case 4:
                    System.out.println("The decimal value is: "+decimalValue);
                    break;
                case 5:
                case 6:

                default:
                    break;
            }
            System.out.println(decimalValue);
            System.out.println("Finished");
        }

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
            return true;
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
            return true;
        }
         
    }
    
    public static int toDecimal(String value, String base){
        if(base.equals("Binary")){
            int sum = 0;
            for(int i=1;i<=value.length();i++){
                sum += Integer.parseInt(value.substring(value.length()-i,value.length()-i+1)) * Math.pow(2, i-1);
            }
            return sum;
        }
        return 0;
    }
    public static String toBase(String base, int decimalValue){
        if()
        return null;
    }
    
    
}

