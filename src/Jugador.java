public class Jugador {
    private String nombre;     // Nombre del jugador
    private int numCamiseta;   // Número de camiseta del jugador

    // Constructor que valida y asigna los atributos
    public Jugador(String nombre, int numCamiseta) {
        this.nombre = nombre; // Asigna el nombre del jugador
        setNumCamiseta(numCamiseta); // Valida y asigna el número de camiseta
    }

    // Valida y establece el número de camiseta (según los rangos permitidos)
    public void setNumCamiseta(int numCamiseta) {
        if ((numCamiseta >= 0 && numCamiseta <= 15) ||
                (numCamiseta >= 20 && numCamiseta <= 25) ||
                (numCamiseta >= 30 && numCamiseta <= 35) ||
                (numCamiseta >= 40 && numCamiseta <= 45) ||
                (numCamiseta >= 50 && numCamiseta <= 55)) {
            this.numCamiseta = numCamiseta;
        } else {
            throw new IllegalArgumentException("Número de camiseta inválido.");
        }
    }

    // Representa al jugador como "Nombre (#NúmeroCamiseta)"
    @Override
    public String toString() {
        return nombre + " (#" + numCamiseta + ")";
    }
}
