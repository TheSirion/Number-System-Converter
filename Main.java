import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        scanner.nextLine();
        String numberString = scanner.nextLine();
        int targetRadix = scanner.nextInt();
        long num;

        if (sourceRadix == 1) {
            num = numberString.length();
        } else {
            num = Long.parseLong(numberString, sourceRadix);
        }

        if (targetRadix == 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(1);
            }
        } else {
            String numTarget = Long.toString(num, targetRadix);
            System.out.println(numTarget);
        }
    }
}
