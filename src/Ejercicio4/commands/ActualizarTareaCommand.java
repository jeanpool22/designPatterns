package Ejercicio4.commands;

import Ejercicio4.memento.Caretaker;
import Ejercicio4.model.Tarea;

public class ActualizarTareaCommand implements Command {

    private final Tarea tarea;
    private final String tituloNuevo;
    private final String descripcionNueva;
    private final Caretaker caretaker;

    public ActualizarTareaCommand(Tarea tarea, String tituloNuevo, String descripcionNueva, Caretaker caretaker) {
        this.tarea = tarea;
        this.tituloNuevo = tituloNuevo;
        this.descripcionNueva = descripcionNueva;
        this.caretaker = caretaker;
    }

    @Override
    public void ejecutar() {
        caretaker.guardarEstado(tarea);
        tarea.actualizar(tituloNuevo, descripcionNueva);
        System.out.println("Tarea actualizada: " + tarea);
    }

    @Override
    public void deshacer() {
        caretaker.deshacer(tarea);
    }
}
