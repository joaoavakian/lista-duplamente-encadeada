public class Lista {
    private Node head;
    private Node tail;

    public Lista() {
        this.head = null;
        this.tail = null;
    }

    public void adicionar(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void imprimirDoInicioAoFim() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Nova linha após impressão
    }

    public void imprimirDoFimAoInicio() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println(); // Nova linha após impressão
    }
}
