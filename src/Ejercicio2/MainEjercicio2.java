package Ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args) {
        ServidorMensajeria servidor = new ServidorMensajeria();

        Usuario usuario = new Usuario("Santiago", servidor);

        Movil movil1 = new Movil("Santiago");
        Computador pc1 = new Computador("Santiago");

        servidor.agregarDispositivo(movil1);
        servidor.agregarDispositivo(pc1);

        usuario.enviarMensaje("Hola, este es un mensaje en tiempo real!");
    }
}