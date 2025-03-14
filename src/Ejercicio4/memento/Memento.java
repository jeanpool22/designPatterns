package Ejercicio4.memento;

public class Memento {

    private final String titulo;
    private final String descripcion;
    private final boolean completado;

    public Memento(String titulo, String descripcion, boolean completado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completado = completado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getCompletado() {
        return completado;
    }
}
