package Ejercicio4;

import Ejercicio4.commands.*;
import Ejercicio4.memento.Caretaker;
import Ejercicio4.model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        List<Tarea> listaTareas = new ArrayList<>();

        // Crear tareas
        Command tareaUno = new CrearTareaCommand(listaTareas, "Pagar recibo", "Pagar el recibo del servicio de la luz");
        tareaUno.ejecutar();

        Command tareaDos = new CrearTareaCommand(listaTareas, "Llamar a mamá", "Hablar con mamá 20 minutos");
        tareaDos.ejecutar();

        // Editar tarea
        Tarea tarea = listaTareas.get(0);
        Command actualizarTarea = new ActualizarTareaCommand(tarea, "Pagar recibo y tarjeta", "Pagar el recibo del servicio de la luz y pagar tarjeta de crédito", caretaker);
        actualizarTarea.ejecutar();

        // Completar tarea
        Command completarTarea = new CompletarTareaCommand(tarea, caretaker);
        completarTarea.ejecutar();

        // Eliminar tarea
        Command eliminarTarea = new EliminarTareaCommand(listaTareas, listaTareas.get(1), caretaker);
        eliminarTarea.ejecutar();

        // Deshacer acciones
        eliminarTarea.deshacer();
        completarTarea.deshacer();
        actualizarTarea.deshacer();
        tareaUno.deshacer();
    }
}
