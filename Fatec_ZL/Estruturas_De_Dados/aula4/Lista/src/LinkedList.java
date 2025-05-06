public class LinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    // Adiciona elemento no início da lista
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Limpa a lista (remove todas as referências)
    public void clean() {
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.data = null;   // ajuda o GC
            current.next = null;
            current = next;
        }
        head = null;
    }

    // Exibe todos os elementos (para teste)
    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Exemplo de uso
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Lista antes do clean:");
        list.print();

        list.clean();

        System.out.println("Lista depois do clean:");
        list.print(); // não imprime nada
    }
}

