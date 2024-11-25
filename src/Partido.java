public class Partido {
    private String fase;
    private Equipo equipo1;
    private Equipo equipo2;
    private Estadio estadio;
    private Fecha fecha;

    // Constructor
    public Partido(String fase, Equipo equipo1, Equipo equipo2, Estadio estadio, Fecha fecha) {
        this.fase = fase;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.estadio = estadio;
        this.fecha = fecha;
    }

    // Método para obtener el estadio
    public Estadio getEstadio() {
        return this.estadio;
    }

    // Métodos para obtener los equipos
    public Equipo getEquipo1() {
        return this.equipo1;
    }

    public Equipo getEquipo2() {
        return this.equipo2;
    }

    // Sobrescribir toString() para mostrar toda la información del partido
    @Override
    public String toString() {
        return "Partido{" +
                "fase='" + fase + '\'' +
                ", equipo1=" + equipo1 +
                ", equipo2=" + equipo2 +
                ", estadio=" + estadio.getNomEstadio() +
                ", fecha=" + fecha +
                '}';
    }
}
