package Ejercicio2;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

interface Dispositivo {
    void actualizar(Mensaje mensaje);
    UUID getId();
}

class Movil implements Dispositivo {
    private UUID id;
    private String nombreUsuario;

    public Movil(String nombreUsuario) {
        this.id = UUID.randomUUID();
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void actualizar(Mensaje mensaje) {
        System.out.println("[Móvil] Mensaje recibido por " + nombreUsuario + ": " + mensaje.getContenido());
    }

    @Override
    public UUID getId() {
        return id;
    }
}

class Computador implements Dispositivo {
    private UUID id;
    private String nombreUsuario;

    public Computador(String nombreUsuario) {
        this.id = UUID.randomUUID();
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void actualizar(Mensaje mensaje) {
        System.out.println("[Computador] Mensaje recibido por " + nombreUsuario + ": " + mensaje.getContenido());
    }

    @Override
    public UUID getId() {
        return id;
    }
}

class Mensaje {
    private String contenido;
    private String remitente;

    public Mensaje(String remitente, String contenido) {
        this.remitente = remitente;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public String getRemitente() {
        return remitente;
    }
}

class ServidorMensajeria {
    private List<Dispositivo> dispositivos = new ArrayList<>();

    public void agregarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public void eliminarDispositivo(Dispositivo d) {
        dispositivos.removeIf(dispositivo -> dispositivo.getId().equals(d.getId()));
    }

    public void notificarDispositivo(Mensaje mensaje) {
        for (Dispositivo d : dispositivos) {
            d.actualizar(mensaje);
        }
    }
}

class Usuario {
    private String nombre;
    private ServidorMensajeria servidor;

    public Usuario(String nombre, ServidorMensajeria servidor) {
        this.nombre = nombre;
        this.servidor = servidor;
    }

    public void enviarMensaje(String contenido) {
        Mensaje mensaje = new Mensaje(nombre, contenido);
        servidor.notificarDispositivo(mensaje);
    }
}


