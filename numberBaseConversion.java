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
            String finalBase="";
            switch(option){
                case 1:
                    initialBase = "Binary";
                    finalBase = "Decimal";
                    break;
                case 2:
                    initialBase = "Decimal";
                    finalBase = "Binary";
                    break;
                case 3:
                    initialBase = "Binary";
                    finalBase = "Hexadecimal";
                    break;
                case 4:
                    initialBase = "Hexadecimal";
                    finalBase = "Binary";
                    break;
                case 5:
                    initialBase = "Hexadecimal";
                    finalBase = "Decimal";
                    break;
                case 6:
                    initialBase = "Decimal";
                    finalBase = "Hexadecimal";
                    break;
                default:
                    exit = true;
                    break;
            }
        
            if(option!=7){
                //Taking input value 
                System.out.println("What value would you like to convert:");
                String value = sc.next();
                boolean validValue = validValue(initialBase, value);
                //Checking for validity of value
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
                switch (option) {
                    case 1:
                        System.out.println("The decimal value is: "+decimalValue);
                        break;
                    case 2:
                        System.out.println("The binary value is: "+ toBase(finalBase,decimalValue));
                        break;
                    case 3:
                        System.out.println("The hexadecimal value is: " +toBase(finalBase, decimalValue));
                        break;
                    case 4:
                        System.out.println("The decimal value is: "+decimalValue);
                        break;
                    case 5:
                        System.out.println("The decimal value is: "+decimalValue);
                    case 6:
                        System.out.println("The hexadecimal value is: "+toBase(finalBase, decimalValue) );
                    default:
                        break;
                }
            }
            
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
                    case 'F':
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }    
    }
    
    public static int toDecimal(String value, String base){
        int sum = 0;
        if(base.equals("Binary")){
            return Integer.parseInt(value, 2);
        } else{
            return Integer.parseInt(value, 16);   
        }
        
    }
    public static String toBase(String resultBase, int num){
        if(resultBase.equals("Binary")) return Integer.toBinaryString(num);
        else{
            return Integer.toHexString(num);
        }        
    }
    
    
}

