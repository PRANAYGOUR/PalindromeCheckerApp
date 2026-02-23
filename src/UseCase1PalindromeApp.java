import java.util.*;

public class UseCase1PalindromeApp {

    public static void main(String args[]){

        //Use Case 1
        /*System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully");*/

/*
        //Use Case 2

        Scanner scanner = new Scanner(System.in);
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
        */

/*
        //Use Case 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }
        String rev = "";


        for(int i=inputString.length()-1;i>=0;i--){
            rev = rev + inputString.charAt(i);

        }

        System.out.println("Is it a palindrome: " + inputString.equals(rev));


*/
        /*
        //Use Case 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }
        char[] chars = inputString.toCharArray();
        int start = 0;
        int end = chars.length -1;
        boolean isPalindrome = true;

        while (start < end) {
            if(inputString.charAt(start) != inputString.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;

        }

        System.out.println("Is it a palindrome: " + isPalindrome);

*/
        /*
        //Use Case 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        Stack<Character> stack = new Stack<>();
        for(char c: inputString.toCharArray()){
            stack.push(c);
        }

        boolean isPalindrome = true;
        for(char c: inputString.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Is it a palindrome: " + isPalindrome);


*//*
        //Use Case 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }
        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
        for(char c: inputString.toCharArray()){
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            char cs = stack.pop();
            char cq = queue.remove();

            if(cs != cq){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a palindrome: " + isPalindrome);
*/

        /*
        //Use Case 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        Deque<Character> deque = new ArrayDeque<>();
        for(char c: inputString.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        while(deque.size() >1){
            char front = deque.removeFirst();
            char back = deque.removeLast();
            if(front!=back){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a palindrome: " + isPalindrome);

*/
        //Use Case8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();
        //System.out.println("Entered String: "+inputString);

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        LinkedList<Character> ll = new LinkedList<>();
        for(char c: inputString.toCharArray()){
            ll.addLast(c);
        }

        boolean isPalindrome = true;
        while(ll.size()>1){
            char front = ll.removeFirst();
            char back = ll.removeLast();
            if(front != back){
                isPalindrome = false;
            }
        }

        System.out.println("Is it a palindrome: " + isPalindrome);

    }
}
