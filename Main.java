public class Main {
    public static void main(String[] args) {
        // Crear habilidades
        Habilidad fuego = new Habilidad("Llama", "Aumenta ataque", 70);
        Habilidad agua = new Habilidad("Tsunami", "Duplica ataque", 50);
        Habilidad planta = new Habilidad("Enredadera", "Paraliza enemigo", 30);
        Habilidad electrico = new Habilidad("Rayo", "Daño crítico", 40);

        // Crear Pokemones
        Pokemon[] pokemones1 = {
            new Pokemon("Charmander", 30, 20, fuego),
            new Pokemon("Squirtle", 25, 30, agua),
            new Pokemon("Bulbasaur", 20, 25, planta),
            new Pokemon("Pikachu", 35, 15, electrico)
        };

        Pokemon[] pokemones2 = {
            new Pokemon("Vulpix", 28, 22, fuego),
            new Pokemon("Psyduck", 26, 28, agua),
            new Pokemon("Oddish", 21, 24, planta),
            new Pokemon("Magnemite", 33, 17, electrico)
        };

        Entrenador Luke = new Entrenador("Luke", pokemones1);
        Entrenador Johnny = new Johnny("Johnny", pokemones2);

        Controlador juego = new Controlador(Luke, Johnny);
        juego.jugarTorneo();
    }
}