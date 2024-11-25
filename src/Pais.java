public class Pais {
    private int codPais;    // Código único del país
    private String nomPais; // Nombre del país

    // Constructor que valida y asigna los atributos
    public Pais(int codPais, String nomPais) {
        setCodPais(codPais); // Valida el código del país
        this.nomPais = nomPais; // Asigna directamente el nombre del país
    }

    // Valida y establece el código del país (rango permitido: 4 a 887)
    public void setCodPais(int codPais) {
        if (codPais >= 4 && codPais <= 887) {
            this.codPais = codPais;
        } else {
            throw new IllegalArgumentException("Código de país fuera de rango.");
        }
    }

    // Método para obtener el código del país
    public int getCodPais() {
        return this.codPais;
    }

    // Método para obtener el nombre del país
    public String getNomPais() {
        return this.nomPais;
    }

    // Representa el país como "Nombre (Código)"
    @Override
    public String toString() {
        return "Pais{" +
                "codPais=" + codPais +
                ", nomPais='" + nomPais + '\'' +
                '}';
    }
}
