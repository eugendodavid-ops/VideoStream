public class DoublyLinkedList {
    private NodoVideo head;
    private NodoVideo tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Método auxiliar para agregar videos y hacer pruebas
    public void agregarAlFinal(Video video) {
        NodoVideo nuevoNodo = new NodoVideo(video);
        if (head == null) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            nuevoNodo.prev = tail;
            tail = nuevoNodo;
        }
    }

    // =======================================================
    // TU MÉTODO A IMPLEMENTAR
    // =======================================================
    public boolean reordenarVideoAlInicio(String idVideo) {
        // 1. Caso límite: Lista vacía
        if (head == null) {
            return false;
        }

        NodoVideo actual = head;

        // 2. Buscar el nodo
        while (actual != null && !actual.video.getIdVideo().equals(idVideo)) {
            actual = actual.next;
        }

        // 3. Si no se encontró el video
        if (actual == null) {
            return false;
        }

        // 4. Si el video ya es la cabeza (head)
        if (actual == head) {
            return false; 
        }

        // 5. Desvincular el nodo de su posición actual
        // Conectamos el anterior con el siguiente
        if (actual.prev != null) {
            actual.prev.next = actual.next;
        }
        
        // Si el nodo a mover es el último (tail), actualizamos el tail
        if (actual.next != null) {
            actual.next.prev = actual.prev;
        } else {
            tail = actual.prev;
        }

        // 6. Insertar el nodo al inicio
        actual.prev = null;
        actual.next = head;
        head.prev = actual;
        head = actual;

        return true;
    }
    
    // Método auxiliar para imprimir la lista y comprobar en el Main
    public void imprimirLista() {
        NodoVideo actual = head;
        while (actual != null) {
            System.out.print(actual.video.getIdVideo() + " <-> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}