package Ejercicio1;

import java.util.List;

// Interfaz Prototype
interface HeroPrototype {
    HeroPrototype cloneHero(String newName, String newAppearance);
}

// Clase Hero implementando Prototype
class Hero implements HeroPrototype {
    private String name;
    private String heroClass;
    private List<String> abilities;
    private int level;
    private int experience;
    private String appearance;

    public Hero(String name, String heroClass, List<String> abilities, int level, int experience, String appearance) {
        this.name = name;
        this.heroClass = heroClass;
        this.abilities = abilities;
        this.level = level;
        this.experience = experience;
        this.appearance = appearance;
    }

    // Método para clonar el héroe con un nuevo nombre
    @Override
    public HeroPrototype cloneHero(String newName, String newAppearance) {
        return new Hero(newName, this.heroClass, this.abilities, this.level, this.experience, newAppearance);
    }

    // Método para mostrar la información del héroe
    @Override
    public String toString() {
        return "Nombre: " + name + "\n" +
                "Clase: " + heroClass + "\n" +
                "Habilidades: " + abilities + "\n" +
                "Nivel: " + level + "\n" +
                "Experiencia: " + experience + "\n" +
                "Aspecto Visual: " + appearance + "\n" +
                "-----------------------------";
    }
}
