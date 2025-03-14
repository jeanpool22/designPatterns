package Ejercicio4.commands;

import Ejercicio4.memento.Caretaker;
import Ejercicio4.memento.Memento;
import Ejercicio4.model.Tarea;

import java.util.List;

public class EliminarTareaCommand implements Command {

    private Tarea tarea;
    private List<Tarea> tareaList;
    private Caretaker caretaker;
    private Memento previusState;

    public EliminarTareaCommand(List<Tarea> tareaList, Tarea tarea, Caretaker caretaker) {
        this.tarea = tarea;
        this.tareaList = tareaList;
        this.caretaker = caretaker;
        this.previusState = tarea.salvarMemento();
    }

    @Override
    public void ejecutar() {
        caretaker.guardarEstado(tarea);
        tareaList.remove(tarea);
        System.out.println("Tarea eliminada: " + tarea);
    }

    @Override
    public void deshacer() {
        tareaList.add(tarea);
        tarea.restablecerDesdeMemento(previusState);
        System.out.println("Tarea restaurada: " + tarea);
    }
}
