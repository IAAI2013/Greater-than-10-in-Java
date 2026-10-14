import java.util.Scanner;

class Greater10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 10) {
            System.out.println("I am greater than 10.");
        } else {
            System.out.println("I am not greater than 10.");
        }

        sc.close();
    }
}