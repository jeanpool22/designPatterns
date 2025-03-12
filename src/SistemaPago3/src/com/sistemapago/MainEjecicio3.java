package SistemaPago3.src.com.sistemapago;

import SistemaPago3.src.com.sistemapago.model.Cliente;
import SistemaPago3.src.com.sistemapago.model.Pago;
import SistemaPago3.src.com.sistemapago.service.Service;
import SistemaPago3.src.com.sistemapago.paymentmethods.TarjetaCredito;
import SistemaPago3.src.com.sistemapago.paymentmethods.PayPal;
import SistemaPago3.src.com.sistemapago.paymentmethods.MetodoNuevo;

import java.util.Date;

public class MainEjecicio3 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pepito", "Pérez", "pepito@example.com");
        Service service = new Service();

        // Pago con Tarjeta de Crédito
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", cliente.getNombre() + " " + cliente.getApellido(), 123, "12/27");
        if (tarjeta != null) {
            Pago pagoTarjeta = new Pago(new Date(), 50000, "TarjetaCredito", cliente.getNombre(), cliente.getApellido(), tarjeta);
            System.out.println("Procesando pago con Tarjeta de Crédito...");
            service.aplicarPagoTC(pagoTarjeta);
            System.out.println("Resultado: Pago exitoso - Tipo: " + pagoTarjeta.getTipoPago() + ", Fecha: " + pagoTarjeta.getFechaPago() + ", Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        } else {
            System.out.println("Error: Tarjeta de Crédito no inicializada.");
        }

        // Pago con PayPal
        PayPal paypal = new PayPal("pepito@paypal.com");
        if (paypal != null) {
            Pago pagoPayPal = new Pago(new Date(), 60000, "PayPal", cliente.getNombre(), cliente.getApellido(), paypal);
            System.out.println("Procesando pago con PayPal...");
            service.aplicarPagoPayPal(pagoPayPal);
            System.out.println("Resultado: Pago exitoso - Tipo: " + pagoPayPal.getTipoPago() + ", Fecha: " + pagoPayPal.getFechaPago() + ", Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        } else {
            System.out.println("Error: Cuenta de PayPal no inicializada.");
        }

        // Pago con Metodo Nuevo
        MetodoNuevo metodoNuevo = new MetodoNuevo("Banco Nacional", "1234567890");
        if (metodoNuevo != null) {
            Pago pagoMetodoNuevo = new Pago(new Date(), 70000, "Metodo Nuevo", cliente.getNombre(), cliente.getApellido(), metodoNuevo);
            System.out.println("Procesando pago con Metodo Nuevo...");
            service.aplicarPagoNuevoMetodo(pagoMetodoNuevo);
            System.out.println("Resultado: Pago exitoso - Tipo: " + pagoMetodoNuevo.getTipoPago() + ", Fecha: " + pagoMetodoNuevo.getFechaPago() + ", Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        } else {
            System.out.println("Error: Metodo Nuevo no inicializada.");
        }
    }
}
