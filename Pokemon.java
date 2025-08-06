public class Pokemon {
    public String nombre;
    private int ataque;
    private int defensa;
    private Habilidad habilidad;

    public Pokemon(String nombre, int ataque, int defensa, Habilidad habilidad) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }
}