public class Pilha {

    private final int SIZE = 30;
    private int topo;
    private int pilha[];
    // private int num;

    Pilha() {
        this.pilha = new int[SIZE];
        this.topo = 0;
    }

    public boolean receberValor(int num) {
        switch (num) {
            case 1, 2, 3:
                inserirPilha(num);
                return true;
            case 0:
                removerPilhar();
                return true;
            case -1:
                imprimirPilha();
                return false;
            default:
                System.out.println("Num inválido");
                return true;
        }
    }

    private void inserirPilha(int num) {
        if (this.topo < SIZE) {
            this.pilha[topo] = num;
            this.topo++;
        } else {
            System.out.println("Pilha de louças cheia, crl!");
        }
    }
    
    private void removerPilhar() {
        if (this.topo > 0) {
            this.topo--;
        }
    }

    private void imprimirPilha() {
        if (this.topo > 0) {
            System.out.println("Pilha de louça:");
            for (int i = 0; i < topo; i++) {
                System.out.println(this.pilha[i]);
            }
        }

    }

}