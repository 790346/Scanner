import java.util.Scanner;
public class ScannerLabRunner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        while(!input.equals("quit"))
        {
            if(input.indexOf("awesome") > -1) {
                System.out.println("This is an \"awesome\" string: " + input.indexOf("awesome"));
            }
            else {
                System.out.println("This is not an \"awesome\" string.");
            }
            
            while(input.indexOf(" ") > -1) {
                System.out.println(input.substring(0, input.indexOf(" ")));
                input = input.substring(input.indexOf(" ") + 1);
            }
            System.out.println(input);
   
            System.out.println("Enter a string: ");
            input = sc.nextLine();
            }

        }
    }
