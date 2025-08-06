public class Entrenador {
    public String nombre;
    public Pokemon[] pokemones;
    private int rondasGanadas;

    public Entrenador(String nombre, Pokemon[] pokemones) {
        this.nombre = nombre;
        this.pokemones = pokemones;
        this.rondasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonEntrenado(int indice) {
        return pokemones[indice];
    }

    public int getRondasGanadas() {
        return rondasGanadas;
    }

    public void ganarRonda() {
        rondasGanadas++;
    }
}