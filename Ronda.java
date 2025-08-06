public class Ronda {
    public String pokemon1;
    public String pokemon2;
    public String ganador;

    public Ronda(String pokemon1, String pokemon2, String ganador) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.ganador = ganador;
    }

    public String getPokemon() {
        return pokemon1 + " vs " + pokemon2;
    }

    public String getGanadorDeRonda() {
        return ganador;
    }
} 