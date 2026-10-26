public class Main {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        // Agregando videos de prueba
        lista.agregarAlFinal(new Video("V1", "Java Básico", 300, "Programación", 100));
        lista.agregarAlFinal(new Video("V2", "POO Avanzado", 450, "Programación", 250));
        lista.agregarAlFinal(new Video("V3", "Bases de Datos", 600, "Bases de Datos", 80));
        lista.agregarAlFinal(new Video("V4", "Redes", 400, "Redes", 150));

        System.out.println("Lista original:");
        lista.imprimirLista(); // V1 <-> V2 <-> V3 <-> V4 <-> null

        // PRUEBA 1: Mover un video del medio al inicio
        System.out.println("\nMoviendo V3 al inicio...");
        boolean resultado1 = lista.reordenarVideoAlInicio("V3");
        System.out.println("Resultado: " + resultado1);
        lista.imprimirLista(); // V3 <-> V1 <-> V2 <-> V4 <-> null

        // PRUEBA 2: Mover el último video (tail) al inicio
        System.out.println("\nMoviendo V4 (el último) al inicio...");
        boolean resultado2 = lista.reordenarVideoAlInicio("V4");
        System.out.println("Resultado: " + resultado2);
        lista.imprimirLista(); // V4 <-> V3 <-> V1 <-> V2 <-> null

        // PRUEBA 3 (Caso Límite): Mover el que ya es head
        System.out.println("\nMoviendo V4 (ya es el primero)...");
        boolean resultado3 = lista.reordenarVideoAlInicio("V4");
        System.out.println("Resultado: " + resultado3); // Debe ser false

        // PRUEBA 4 (Caso Límite): ID que no existe
        System.out.println("\nMoviendo V99 (no existe)...");
        boolean resultado4 = lista.reordenarVideoAlInicio("V99");
        System.out.println("Resultado: " + resultado4); // Debe ser false

        // PRUEBA 5 (Caso Límite): Lista vacía
        System.out.println("\nProbando con lista vacía...");
        DoublyLinkedList listaVacia = new DoublyLinkedList();
        boolean resultado5 = listaVacia.reordenarVideoAlInicio("V1");
        System.out.println("Resultado: " + resultado5); // Debe ser false
    }
}