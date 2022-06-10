import java.util.Scanner;

public class SecondQuestion {

    public static void main(String[] args){
//        Problem statement
//        Given an alphanumeric string made up of digits and lower case Latin characters only,
//        find the sum of all the digit characters in the string.
//
//        Input
//        The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
//                Each test case is described with a single line containing a string S, the alphanumeric string.
//        Output
//        For each test case, output a single line containing the sum of all the digit characters in that string.
//                Constraints
//        1 ≤ T ≤ 1000
//        1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
//        Example
//        Input:
//        1
//        ab1231da
//        Output:
//        7
//
//        Explanation
//        The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.

        Scanner sc = new Scanner(System.in);

        boolean valid = false;
        int T = 0;
        while(!valid){
            System.out.print("Please enter the number of test cases; " +
                    "the number has to be greater or equal to 1 and less than or equal to 1000: ");
            T = sc.nextInt();
            if(T >= 1 && T <= 1000){
                valid = true;
            }else{
                System.out.println("Invalid input");
            }

        }

        for (int i = 0; i < T; i++) {
            boolean valid1 = false;
            while(!valid1) {
                System.out.print("Please enter a alphanumeric string: ");
                String s = sc.next();

                if((s.length() >= 1)&&(s.length() <= 1000)) {
                    int total = 0;
                    for (int j = 0; j < s.length(); j++) {
                        valid1 = true;
                        char ch = s.charAt(j);
                        if ('0' <= ch && ch <= '9') {
                            total += ch - '0';
                        }
                    }
                    System.out.println("Your total is " +total);
                }else{
                    System.out.println("Invalid input");
                }
            }
        }
    }

}
