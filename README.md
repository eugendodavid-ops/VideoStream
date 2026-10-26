# Examen Parcial - Estructuras de Datos (VideoStream)

**Estudiante:** Iriarte Sánchez, Eugendo David
**Estructura:** Lista Doblemente Enlazada (DoublyLinkedList)
**Dominio:** Plataforma de Contenidos Multimedia 'VideoStream'

## Descripción del Algoritmo
El método `reordenarVideoAlInicio(String idVideo)` busca un nodo en la lista doblemente enlazada. Si lo encuentra y no es la cabeza (`head`), procede a desvincularlo ajustando los punteros `prev` y `next` de sus nodos adyacentes. 

Se manejan tres casos críticos al desvincular:
1. Si el nodo está en el medio, se conecta el `prev` con el `next`.
2. Si el nodo es el último (`tail`), se actualiza la referencia `tail` al nodo anterior.
3. Finalmente, se inserta el nodo al inicio: su `prev` se vuelve `null`, su `next` apunta al antiguo `head`, el `prev` del antiguo `head` apunta al nodo movido, y se actualiza el `head`.

## Declaración Explícita sobre el Uso de Inteligencia Artificial
En cumplimiento con las normas éticas de la asignatura, declaro que se utilizó asistencia de Inteligencia Artificial para la estructuración inicial del código base, la generación de los casos de prueba en la clase `Main` y la redacción de este documento README. El código fue revisado y comprendido por el estudiante para garantizar el dominio técnico de la estructura de datos durante la defensa oral.