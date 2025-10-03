import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pilha pilha = new Pilha();
        boolean aux;

        do {
            aux = pilha.receberValor(scan.nextInt());
        } while (aux);
    }
}