import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = 0;
        int percentual = 0;

        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salario * percentual / 100.0;
        double novoSalario = salario + reajuste;

        // Гаралт
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Main{");
        sb.append('}');
        return sb.toString();
    }
}