import java.util.Scanner;
public class UseCase1PalindromeApp {

    public static void main(String args[]){
        /*System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully");*/
        Scanner scanner = new Scanner(System.in); //
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }


        boolean Isplaindrome = true;
        for(int i=0;i<inputString.length()/2;i++){
            if(inputString.charAt(i) != inputString.charAt((inputString.length())-i-1)) {
                Isplaindrome = false;
            }
        }
        if(Isplaindrome){
            System.out.println("Is it a palindrome: " + Isplaindrome);
        }
        else{
            System.out.println("Is it a palindrome: " + Isplaindrome);

        }




    }
}
