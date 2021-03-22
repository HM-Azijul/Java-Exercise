import java.util.Scanner;

class Pyramid_1 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows:");
        n = sc.nextInt();

        // star pyramid
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // for nex line
        }

        // ----------------------------
        // 1
        // 22
        // 333
        // 4444
        // 55555
        // 666666
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i); // just give i here
            }

            System.out.println(); // for nex line
        }

        // ----------------------------
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j); // just give j here
            }

            System.out.println(); // for nex line
        }

        // ----------------------------
        // 2
        // 34
        // 456
        // 5678
        // 678910
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + j); // just give i+j here
            }

            System.out.println(); // for nex line
        }

    }
}