public class Posicion {
    private int codPos;    // Código único de la posición
    private String nomPos; // Nombre de la posición

    // Constructor para inicializar los valores
    public Posicion(int codPos, String nomPos) {
        setCodPos(codPos);       // Valida y asigna el código de la posición
        this.nomPos = nomPos;    // Asigna directamente el nombre de la posición
    }

    // Método para establecer el código de la posición (con validación)
    public void setCodPos(int codPos) {
        if (codPos > 0) { // Validamos que sea positivo (puedes agregar más reglas si las necesitas)
            this.codPos = codPos;
        } else {
            throw new IllegalArgumentException("El código de la posición debe ser positivo.");
        }
    }

    // Método para obtener el código de la posición
    public int getCodPos() {
        return codPos;
    }

    // Método para establecer el nombre de la posición
    public void setNomPos(String nomPos) {
        this.nomPos = nomPos; // No se especificaron reglas de negocio para este atributo
    }

    // Método para obtener el nombre de la posición
    public String getNomPos() {
        return nomPos;
    }

    // Método para representar la posición como texto
    @Override
    public String toString() {
        return "Posición: " + nomPos + " (Código: " + codPos + ")";
    }
}
