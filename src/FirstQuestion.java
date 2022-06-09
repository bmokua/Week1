import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args){
//        Problem Statement
//        Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
//
//        Input
//        First line contains the number of triples, N.
//                The next N lines which follow each have three space separated integers.
//                Output
//        For each of the N triples, output one new line which contains the second-maximum integer among the three.
//
//        Constraints
//        1 ≤ N ≤ 6
//        1 ≤ every integer ≤ 10000
//        The three integers in a single triplet are all distinct. That is, no two of them are equal.
//                Sample Input
//        3
//        1 2 3
//        10 15 5
//        100 999 500
//        Sample Output
//        2
//        10
//        500


        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of triples: ");
        int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                System.out.print("Please enter three number: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int num3 = sc.nextInt();

                if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
                    System.out.println("The middle value is " +num1);
                else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
                    System.out.println("The middle value is " + num2);
                else
                    System.out.println("The middle value is " + num3);
            }
        sc.close();
    }
}
