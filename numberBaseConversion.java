import java.util.Scanner;
public class numberBaseConversion {
    public static final Scanner sc = new Scanner(System.in);
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
                value = value.toLowerCase();
                boolean validValue = validValue(initialBase, value);
                //Checking for validity of value
                while(!validValue){
                    switch(initialBase){
                        case "Decimal":
                            System.out.println(initialBase+ " can only contain 0-9. Try again:");
                            value = sc.next();
                            validValue = validValue(initialBase, value);
                            break;
                        case "Binary":
                            System.out.println(initialBase+ " can only contain 0 or 1. Try again:");
                            value = sc.next();
                            validValue = validValue(initialBase, value);
                            break;
                        case "Hexadecimal":
                            System.out.println(initialBase+" can only contain a-f or 0-9. Try again:");
                            value = sc.next();
                            validValue = validValue(initialBase, value);
                            break;
                        default:
                            System.out.println("What have you inputted???");
                            break;
                    }
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
                    case 1, 5:
                        System.out.println("The decimal value is: "+decimalValue);
                        break;
                    case 2, 4:
                        System.out.println("The binary value is: "+ toBase(finalBase,decimalValue));
                        break;
                    case 3, 6:
                        System.out.println("The hexadecimal value is: " +toBase(finalBase, decimalValue));
                        break;
                    default:
                        break;
                }
                System.out.println();
            }
            
        }
    }
    
    public static boolean validValue(String base, String value){
        if(base.equals("Decimal")){
            try {
                Integer.parseInt(value);
            } catch (Exception e) {
                return false;
            }
            return true;
        } 
        else if (base.equals("Binary")){        
            for(int i=0;i<value.length();i++) {
                switch (value.charAt(i)) {
                    case '0', '1':
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
                    case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f':
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
        //converts binary to decimal
        if(base.equals("Binary")) {
            for (int i=0;i<value.length();i++) {
                if (value.charAt(value.length()-i-1) == '1') {
                    sum += (int) Math.pow(2, i);
                }
            }
        }
        //converts hexadecimal to decimal
        else if(base.equals("Hexadecimal")){
            for (int i=0;i<value.length();i++) {
                char x = value.charAt(value.length()-i-1);
                int num = switch (x) {
                    case 'a' -> 10;
                    case 'b' -> 11;
                    case 'c' -> 12;
                    case 'd' -> 13;
                    case 'e' -> 14;
                    case 'f' -> 15;
                    default -> Integer.parseInt(String.valueOf(x));
                };
                sum += (int) (num *Math.pow(16,i));
            }
        }
        return sum;
    }
    public static String toBase(String resultBase, int num) {
        String result ="";
        if(resultBase.equals("Binary")) {
            for(int quotient=num;quotient!=0;quotient/=2){
                result += quotient%2;
            }

        }
        else{
            for(int quotient=num;quotient!=0;quotient/=16){
                switch(quotient%16){
                    case 10 -> result+="a";
                    case 11 -> result+="b";
                    case 12 -> result+="c";
                    case 13 -> result+="d";
                    case 14 -> result+="e";
                    case 15 -> result+="f";
                    default -> result+=quotient%16;
                }
            }
        }
        String reverseResult = "";
        for(int i=result.length()-1;i>=0;i--) reverseResult += result.charAt(i);
        return reverseResult;
    }
    
    
}

