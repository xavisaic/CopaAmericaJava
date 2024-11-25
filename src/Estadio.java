public class Estadio {
    private int numEstadio;    // Número del estadio
    private String nomEstadio; // Nombre del estadio

    // Constructor para inicializar los valores
    public Estadio(int numEstadio, String nomEstadio) {
        this.numEstadio = numEstadio;   // Asigna directamente el número del estadio
        this.nomEstadio = nomEstadio;  // Asigna directamente el nombre del estadio
    }

    // Método para establecer el número del estadio
    public void setNumEstadio(int numEstadio) {
        this.numEstadio = numEstadio; // No requiere validación según el diagrama
    }

    // Método para obtener el número del estadio
    public int getNumEstadio() {
        return numEstadio;
    }

    // Método para establecer el nombre del estadio
    public void setNomEstadio(String nomEstadio) {
        this.nomEstadio = nomEstadio; // No requiere validación según el diagrama
    }

    // Método para obtener el nombre del estadio
    public String getNomEstadio() {
        return nomEstadio;
    }

    // Método para representar el estadio como texto
    @Override
    public String toString() {
        return "Estadio{" +
                "numEstadio=" + numEstadio +
                ", nomEstadio='" + nomEstadio + '\'' +
                '}';
    }

}
