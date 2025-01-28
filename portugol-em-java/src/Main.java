import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(idadeSuficiente(20));
        //System.out.println(limiteConta(2000));
        //System.out.println(emprestimo(2000, 800));

        System.out.println(mensalFixo());
//        System.out.println(mensalVariavel());
//        System.out.println(investimento());
    }

    //EXC 1
    public static String idadeSuficiente(int idade) {
        if (idade >= 18) {
            return "Tem idade suficiente";
        }
        return "Nao tem idade suficiente";
    }

    //EXC 2
    public static double limiteConta(int saldo) {
        if (saldo <= 0) {
            return 0;
        }
        return saldo * 0.2;
    }

    //EXC 3
    public static String emprestimo(int saldoMedia, int valorEmprestimo) {
        if (valorEmprestimo < (saldoMedia * 0.4)) {
            return "Emprestimo valido";
        } else if (saldoMedia <= 0) {
            return "saldo invalido para emprestimo";
        }
        return "Emprestimo invalido";
    }

    //EXC ESTRUTURA DE REPETICAO....
    //EXC 1
    public static double mensalFixo() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double total = 0;
        while (contador < 12) {
            System.out.println("Valor: ");
            double valor = scanner.nextDouble();
            total = total + valor;
            contador++;
        }
        return total;
    }

    //EXC 2
    public static double mensalVariavel() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double total = 0;
        while (contador < 12) {
            System.out.println("Valor variavel: ");
            double valor = scanner.nextDouble();
            total = total + valor;
            contador++;
        }
        return total;
    }

    //EXC 3
    public static double investimento() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double total = 1000;
        while (contador < 12) {
            System.out.println("Valor investido: ");
            double valor = scanner.nextDouble();
            total = total + (valor * 0.005);
        }
        return total;
    }
}