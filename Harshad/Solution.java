import java.util.Scanner;

public class Solution {

    public static int sumOfTheDigitsOfHarshadNumber(int x) {

        int sum = 0, temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (x % sum == 0)
            return sum;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}