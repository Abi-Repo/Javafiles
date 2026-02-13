
//import java.util.Scanner;
//public class exercise_4_1 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the number : ");
//        int number = input.nextInt();
//        System.out.println("enter the digit : ");
//        int digit = input.nextInt();
//
//        String numst = String.valueOf(number);
//        char digitchar = Character.forDigit(digit, 10);
//
//        int count = 0;
//        for(int i = 0; i< numst.length() ; i++){
//            if(numst.charAt(i) == digitchar){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}



////Task: Take a number and print the sum of all its digits.
//public class exercise_4_1 {
//    static void main() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter the number : ");
//        int number = input.nextInt();
//
//        String num = String.valueOf(number);
//        int prev = 0;
//
//        for(int i=0; i<num.length(); i++){
//            int total = (num.charAt(i)) - '0';
//            prev = prev + total;
//        }
//        System.out.println(prev);
//    }
//}




//Task: Take a number and print it reversed.
//public class exercise_4_1 {
//    static void main() {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        String numstr = String.valueOf(num);
//        String reverse = "";
//
//        for(int i=0; i < numstr.length() ; i++){
//            char reminder = numstr.charAt(i);
//            reverse = reminder + reverse  ;
//        }
//        System.out.println(reverse);
//    }
//}



//palindrome
//public class exercise_4_1 {
//    static void main() {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("enter the number : ");
//        int number = input.nextInt();
//
//        int original = number, reverse = 0;
//
//        while(number > 0){
//            reverse = reverse * 10 + (number%10);
//            number /= 10;
//        }
//        System.out.println(reverse);
//        if(original == reverse){
//            System.out.println("it is palindrome");
//        }else {
//            System.out.println("it is not palindrome");
//        }
//    }
//}



