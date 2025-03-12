package SistemaPago3.src.com.sistemapago.paymentmethods;

public class TarjetaCredito {
    private String numeroTarjeta;
    private String titular;
    private int cvv;
    private String fechaExpiracion;

    public TarjetaCredito(String number, String s, int i, String s1) {
        this.numeroTarjeta = number;
        this.titular = s;
        this.cvv = i;
        this.fechaExpiracion = s1;
    }

    public boolean procesarPago() {
        return true;
    }
}
