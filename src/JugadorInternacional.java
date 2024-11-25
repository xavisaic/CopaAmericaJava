public class JugadorInternacional extends Jugador {

    private String marca;    // Marca que representa el jugador (por ejemplo, Adidas)
    private float fichaje;   // Monto del fichaje del jugador

    // Constructor que incluye los atributos del jugador base y los atributos específicos de JugadorInternacional
    public JugadorInternacional(String nombre, int numCamiseta, String marca, float fichaje) {
        super(nombre, numCamiseta);  // Llama al constructor de la clase base
        this.marca = marca;
        this.fichaje = fichaje;
    }

    // Getters para marca y fichaje
    public String getMarca() {
        return marca;
    }

    public float getFichaje() {
        return fichaje;
    }

    // Método toString para JugadorInternacional
    @Override
    public String toString() {
        return super.toString() + ", Marca: " + marca + ", Fichaje: " + fichaje;
    }
}
