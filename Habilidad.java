public class Habilidad {
    public String nombre;
    private String efecto;
    private int probabilidad;

    public Habilidad(String nombre, String efecto, int probabilidad) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.probabilidad = probabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public int getProbabilidad() {
        return probabilidad;
    }
}