import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide source radix (base):");
        int sourceRadix = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Provide number to be converted:");
        String numberString = scanner.nextLine();

        System.out.println("Provide target radix (base):");
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

