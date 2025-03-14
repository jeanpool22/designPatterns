package Ejercicio4.commands;

import Ejercicio4.memento.Caretaker;
import Ejercicio4.model.Tarea;

public class CompletarTareaCommand implements Command {

    private final Tarea tarea;
    private final Caretaker caretaker;

    public CompletarTareaCommand(Tarea tarea, Caretaker caretaker) {
        this.tarea = tarea;
        this.caretaker = caretaker;
    }

    @Override
    public void ejecutar() {
        caretaker.guardarEstado(tarea);
        tarea.completada();
        System.out.println("Tarea completada: " + tarea);
    }

    @Override
    public void deshacer() {
        caretaker.deshacer(tarea);
    }
}
