package SistemaPago3.src.com.sistemapago.paymentmethods;

public class MetodoNuevo {
    private String apiKey;
    private String identificadorUsuario;

    public MetodoNuevo(String apiKey, String identificadorUsuario) {
        this.apiKey = apiKey;
        this.identificadorUsuario = identificadorUsuario;
    }

    public boolean ejecutarPago() {
        return true;
    }
}
