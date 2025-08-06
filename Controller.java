import java.util.*;

public class Controlador {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Random rand;

    public Controlador(Entrenador e1, Entrenador e2) {
        this.entrenador1 = e1;
        this.entrenador2 = e2;
        this.rand = new Random();
    }

    public void jugarTorneo() {
        int ronda = 1;
        Set<Integer> usados1 = new HashSet<>();
        Set<Integer> usados2 = new HashSet<>();

        while (ronda <= 4) {
            System.out.println("=== Ronda " + ronda + " ===");

            int idx1 = elegirPokemonNoRepetido(usados1);
            int idx2 = elegirPokemonNoRepetido(usados2);

            Pokemon p1 = entrenador1.getPokemonEntrenado(idx1);
            Pokemon p2 = entrenador2.getPokemonEntrenado(idx2);

            int ataque1 = calcularAtaqueConHabilidad(p1);
            int ataque2 = calcularAtaqueConHabilidad(p2);

            System.out.println(entrenador1.getNombre() + " eligió " + p1.getNombre() + " con ataque total: " + ataque1);
            System.out.println(entrenador2.getNombre() + " eligió " + p2.getNombre() + " con ataque total: " + ataque2);

            String ganador;
            if (ataque1 > ataque2) {
                ganador = entrenador1.getNombre();
                entrenador1.ganarRonda();
            } else if (ataque2 > ataque1) {
                ganador = entrenador2.getNombre();
                entrenador2.ganarRonda();
            } else {
                ganador = "Empate";
            }

            System.out.println("Ganador de la ronda: " + ganador);
            System.out.println();
            ronda++;
        }

        mostrarResultadosFinales();
    }

    private int elegirPokemonNoRepetido(Set<Integer> usados) {
        int idx;
        do {
            idx = rand.nextInt(4);
        } while (usados.contains(idx));
        usados.add(idx);
        return idx;
    }

    private int calcularAtaqueConHabilidad(Pokemon p) {
        int ataqueBase = p.getAtaque();
        int chance = rand.nextInt(100);

        if (chance < p.getHabilidad().getProbabilidad()) {
            System.out.println(">> " + p.getNombre() + " usó su habilidad " + p.getHabilidad().getNombre() + " (" + p.getHabilidad().getEfecto() + ")");
            return ataqueBase + 10;
        }
        return ataqueBase;
    }

    private void mostrarResultadosFinales() {
        System.out.println("=== RESULTADOS ===");
        System.out.println(entrenador1.getNombre() + " ganó " + entrenador1.getRondasGanadas() + " rondas.");
        System.out.println(entrenador2.getNombre() + " ganó " + entrenador2.getRondasGanadas() + " rondas.");

        if (entrenador1.getRondasGanadas() > entrenador2.getRondasGanadas()) {
            System.out.println("Ganador del torneo: " + entrenador1.getNombre());
        } else if (entrenador2.getRondasGanadas() > entrenador1.getRondasGanadas()) {
            System.out.println("Ganador del torneo: " + entrenador2.getNombre());
        } else {
            System.out.println("El torneo terminó en empate.");
        }
    }
}