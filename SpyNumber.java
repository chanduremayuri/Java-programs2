class SpyNumber {
    public static void main(String[] args) {
        int originalNum = 1412;
        int num = originalNum;
        int sum = 0;
        int product = 1;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }

        if (sum == product) {
            System.out.println(originalNum + " is a Spy number");
        } else {
            System.out.println(originalNum + " is not a Spy number");
        }
    }
}
