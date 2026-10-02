import java.util.Scanner;

public class Leitor {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        IO.println(mensagem);
        return scanner.nextLine();
    }

    public static int lerInteiro(String mensagem) {
        IO.println(mensagem);
        while (!scanner.hasNextInt()) {
            IO.println(" Digite um número válido!");
            scanner.next();
            IO.println(mensagem);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static void aguardarEnter(String mensagem) {
        IO.println(mensagem);
        scanner.nextLine();
    }
}
