import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Pilha pilha = new Pilha();
        int aux;

        do {
            aux = scan.nextInt();
            pilha.receberValor(aux);
        } while (aux != -1);
    }
}