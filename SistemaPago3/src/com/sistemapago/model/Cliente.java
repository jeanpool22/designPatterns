package com.sistemapago.model;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private Date fechaCompra;
    private int valorCompra;
    private Pago tipoDePago;
    private String correo;

    public Cliente(String pepito, String pérez, String mail) {
    }

    public boolean realizarPago(Pago pago) {
        // Lógica de pago
        return true;
    }

    public Object getNombre() {
        return null;
    }

    public Object getApellido() {
        return null;
    }
}
