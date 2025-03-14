package Ejercicio4.commands;

import Ejercicio4.model.Tarea;

import java.util.List;

public class CrearTareaCommand implements Command {

    private Tarea tarea;
    private List<Tarea> tareaList;

    public CrearTareaCommand(List<Tarea> tareaList, String title, String description) {
        this.tareaList = tareaList;
        this.tarea = new Tarea(title, description);
    }

    @Override
    public void ejecutar() {
        tareaList.add(tarea);
        System.out.println("Tarea creada: " + tarea);
    }

    @Override
    public void deshacer() {
        tareaList.remove(tarea);
        System.out.println("Tarea eliminada: " + tarea);
    }
}
