package Ejercicio1;

import java.util.List;

public class MainEjercicio1 {
    public static void main(String[] args) {
        // Crear un héroe original
        HeroPrototype originalHero = new Hero("Arthas", "Guerrero", List.of("Espadazo", "Bloqueo"), 10, 1500, "Armadura dorada");

        // Clonar el héroe con un nuevo nombre
        HeroPrototype clonedHero = originalHero.cloneHero("Leonidas", "Armadura plateada");

        // Mostrar la información de ambos héroes
        System.out.println("Héroe Original:");
        System.out.println(originalHero);

        System.out.println("Héroe Clonado:");
        System.out.println(clonedHero);

    }
}
