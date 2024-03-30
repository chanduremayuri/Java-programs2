
import java.util.Scanner;

class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int newnum = num + 1;
        boolean flag = false;
        int sqrt = (int) Math.sqrt(newnum); // Calculate square root once

        if (sqrt * sqrt == newnum) {
            flag = true;
        }

        if (flag) {
            System.out.println(newnum + " is a Sunny Number");
        } else {
            System.out.println(newnum + " is not a Sunny Number");
        }
    }
}
