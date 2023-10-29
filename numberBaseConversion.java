import java.util.Scanner
public class numberBaseConversion {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean exit = false;
        while(!exit){
            System.out.println("Choose your conversion:");
            System.out.println(
                "1. Convert Binary to Decimal\n
                2. Convert Decimal to Binary\n
                3. Convert Binary to Hexadecimal\n
                4. Convert Hexadecimal to Binary\n
                5. Convert Hexadecimal to Decimal\n
                6. Convert Decimal to Hexadecimal\n
                7. Exit\n
            ")
            int option = sc.nextInt();
            switch(option){
                case 1:
                    
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    exit = true;
                default:
                    System.out.println("Invalid option:");
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
