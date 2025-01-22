public class Main {
    public static void main(String[] args) {
        System.out.println(idadeSuficiente(20));
        System.out.println(limiteConta(2000));
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
        return saldo * 0.20;
    }

    //EXC 3
    public static String 
}