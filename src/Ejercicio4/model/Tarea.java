package Ejercicio4.model;

import Ejercicio4.memento.Memento;

public class Tarea {

    private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void actualizar(String newTitle, String newDescription) {
        this.titulo = newTitle;
        this.descripcion = newDescription;
    }

    public void completada() {
        this.completada = true;
    }

    public void restablecerDesdeMemento(Memento memento) {
        this.titulo = memento.getTitulo();
        this.descripcion = memento.getDescripcion();
        this.completada = memento.getCompletado();
    }

    public Memento salvarMemento() {
        return new Memento(titulo, descripcion, completada);
    }

    @Override
    public String toString() {
        return "título:" + titulo + ", descripción:" + descripcion + ", completada:" + completada;
    }
}
