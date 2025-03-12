package SistemaPago3.src.com.sistemapago.model;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private Date fechaCompra;
    private String correo;

    public Cliente(String nombrep, String apellidop, String mail) {
        this.nombre = nombrep;
        this.apellido = apellidop;
        this.fechaCompra = new Date();
        this.correo = mail;

    }

    public boolean realizarPago(Pago pago) {
        // Lógica de pago
        return true;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
}
