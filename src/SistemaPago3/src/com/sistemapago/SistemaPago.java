package SistemaPago3.src.com.sistemapago;

import SistemaPago3.src.com.sistemapago.model.Pago;

public interface SistemaPago {
    boolean procesarPago(Pago pago);
    boolean procesarPagoNew(Pago pago);
}
