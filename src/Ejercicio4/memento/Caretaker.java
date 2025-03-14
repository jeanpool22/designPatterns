package Ejercicio4.memento;

import Ejercicio4.model.Tarea;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Caretaker {

    private final Map<Tarea, Stack<Memento>> historialTareas = new HashMap<>();

    public void guardarEstado(Tarea tarea) {
        historialTareas.computeIfAbsent(tarea, k -> new Stack<>()).push(tarea.salvarMemento());
    }

    public void deshacer(Tarea tarea) {
        if (historialTareas.containsKey(tarea) && !historialTareas.get(tarea).isEmpty()) {
            tarea.restablecerDesdeMemento(historialTareas.get(tarea).pop());
            System.out.println("Se ha revertido la tarea a su estado anterior");
        } else {
            System.out.println("No hay estados previos para revertir");
        }
    }
}
