import java.time.Year; // Importamos para obtener el año actual

public class JugadorNacional extends Jugador {

    private int anioEntradaClub; // Año de entrada al club actual

    // Constructor que incluye los atributos del jugador base y el atributo específico de JugadorNacional
    public JugadorNacional(String nombre, int numCamiseta, int anioEntradaClub) {
        super(nombre, numCamiseta);  // Llama al constructor de la clase base
        this.anioEntradaClub = anioEntradaClub;
    }

    // Getter para anioEntradaClub
    public int getAnioEntradaClub() {
        return anioEntradaClub;
    }

    // Método que retorna los datos del jugador si lleva más de 2 años en el club
    public String obtenerDatosSiMasDe2Anos() {
        int añoActual = Year.now().getValue(); // Obtiene el año actual
        if ((añoActual - anioEntradaClub) > 2) {
            return this.toString(); // Llama al método toString() para retornar todos los datos del jugador
        } else {
            return "El jugador no lleva más de 2 años en el club.";
        }
    }

    // Método toString para JugadorNacional
    @Override
    public String toString() {
        return super.toString() + ", Año Entrada al Club: " + anioEntradaClub;
    }
}
