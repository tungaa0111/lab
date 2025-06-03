import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Борлуулагчийн нэр

        double salary = sc.nextDouble();     // Үндсэн цалин
        double sales = sc.nextDouble();      // Борлуулалт

        double total = salary + (sales * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}