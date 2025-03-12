package com.sistemapago;

import com.sistemapago.model.Cliente;
import com.sistemapago.model.Pago;
import com.sistemapago.paymentmethods.TarjetaCredito;
import com.sistemapago.paymentmethods.PayPal;
import com.sistemapago.paymentmethods.MetodoNuevo;
import com.sistemapago.service.Service;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pepito", "Pérez", "pepito@example.com");
        Service service = new Service();

        // Pago con Tarjeta de Crédito
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", cliente.getNombre() + " " + cliente.getApellido(), 123, "12/27");
        Pago pagoTarjeta = new Pago(new Date(), 50000, "TarjetaCredito", cliente.getNombre(), cliente.getApellido(), tarjeta);
        System.out.println("Procesando pago con Tarjeta de Crédito...");
        service.aplicarPagoTC(pagoTarjeta);

        // Pago con PayPal
        PayPal paypal = new PayPal("pepito@paypal.com");
        Pago pagoPayPal = new Pago(new Date(), 60000, "PayPal", cliente.getNombre(), cliente.getApellido(), paypal);
        System.out.println("Procesando pago con PayPal...");
        service.aplicarPagoPayPal(pagoPayPal);

        // Pago con Metodo Nuevo
        MetodoNuevo metodoNuevo = new MetodoNuevo("Banco Nacional", "1234567890");
        Pago pagoMetodoNuevo = new Pago(new Date(), 70000, "MetodoNuevo", cliente.getNombre(), cliente.getApellido(), metodoNuevo);
        System.out.println("Procesando pago con Metodo Nuevo...");
        service.aplicarPagoNuevoMetodo(pagoMetodoNuevo);
    }
}