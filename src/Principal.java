public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        for (int i = 1; i <= 10; i++) {
            lista.adicionar(i);
        }

        System.out.println("Imprimindo do início ao fim:");
        lista.imprimirDoInicioAoFim();

        System.out.println("Imprimindo do fim ao início:");
        lista.imprimirDoFimAoInicio();
    }
}
