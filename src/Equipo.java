import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Equipo {

    private char grupo;      // Grupo al que pertenece el equipo (A, B, C o D)
    private int rankingFifa; // Posición en el ranking FIFA
    private Pais pais;       // País del equipo
    private List<Jugador> jugadores; // Lista de jugadores del equipo


    // Constructor que valida y asigna los atributos
    public Equipo(char grupo, int rankingFifa, Pais pais) {
        setGrupo(grupo);             // Valida el grupo
        setRankingFifa(rankingFifa); // Valida el ranking FIFA
        this.pais = pais;            // Asigna el país
        this.jugadores = new ArrayList<>(); // Inicializa la lista de jugadores

    }

    // Valida y establece el grupo (debe ser 'A', 'B', 'C' o 'D')
    public void setGrupo(char grupo) {
        if (grupo == 'A' || grupo == 'B' || grupo == 'C' || grupo == 'D') {
            this.grupo = grupo;
        } else {
            throw new IllegalArgumentException("Grupo inválido. Debe ser A, B, C o D.");
        }
    }

    // Valida y establece el ranking FIFA (debe estar en el rango 1-99)
    public void setRankingFifa(int rankingFifa) {
        if (rankingFifa > 0 && rankingFifa < 100) {
            this.rankingFifa = rankingFifa;
        } else {
            throw new IllegalArgumentException("Ranking FIFA fuera de rango.");
        }
    }

    // Método para obtener el grupo
    public char getGrupo() {
        return this.grupo;
    }

    // Método para obtener el país
    public Pais getPais() {
        return this.pais;
    }

    // Método para obtener el ranking FIFA
    public int getRankingFifa() {
        return this.rankingFifa;
    }

    // Representación del equipo (incluyendo jugadores)
    @Override
    public String toString() {
        return "Equipo{" +
                "grupo=" + grupo +
                ", rankingFifa=" + rankingFifa +
                ", pais=" + pais.getNomPais() +
                ", jugadores=" + jugadores +
                '}';
    }


    public List<Jugador> getJugadores() {
        return jugadores;
    }


    public String ingresarJugador(Jugador jugador) {
        // Validamos si el jugador ya existe en la nómina del equipo
        for (Jugador j : jugadores) {
            if (j.toString().equals(jugador.toString())) {
                return "El jugador ya está en la nómina del equipo.";
            }
        }

        // Asignamos aleatoriamente el número de camiseta y la posición
        Random random = new Random();

        // Asignación aleatoria del número de camiseta
        int numCamiseta = asignarNumeroCamisetaAleatorio();
        jugador.setNumCamiseta(numCamiseta);

        // Asignación aleatoria de la posición
        String[] posiciones = {"Delantero", "Defensa", "Centrocampista", "Portero"};
        String posicion = posiciones[random.nextInt(posiciones.length)];

        // Aquí puedes personalizar más, asignando la posición al jugador si lo necesitas
        // En este ejemplo, solo estamos mostrando que se asignó una posición aleatoria

        // Agregar el jugador a la lista
        jugadores.add(jugador);

        return "Jugador ingresado correctamente: " + jugador.toString() + ", Posición: " + posicion;
    }


    // Método para eliminar un jugador
    public String eliminarJugador(Jugador jugador) {
        // Buscar al jugador en la lista
        for (Jugador j : jugadores) {
            if (j.toString().equals(jugador.toString())) {
                jugadores.remove(j); // Elimina el jugador de la lista
                return "Jugador " + jugador.toString() + " eliminado correctamente.";
            }
        }

        // Si el jugador no se encuentra
        return "El jugador " + jugador.toString() + " no se encuentra en la nómina del equipo.";
    }


    // Método para asignar un número de camiseta aleatorio dentro de los rangos permitidos
    private int asignarNumeroCamisetaAleatorio() {
        Random random = new Random();
        int[] rangos = {0, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        int num = rangos[random.nextInt(rangos.length)];

        // Si el número generado es 0 o 15, asignamos aleatoriamente otro número dentro del rango
        if (num == 0 || num == 15 || num == 20 || num == 25 || num == 30 || num == 35 || num == 40 || num == 45 || num == 50 || num == 55) {
            return num;
        } else {
            // Si no es un número válido, intentamos de nuevo
            return asignarNumeroCamisetaAleatorio();
        }
    }

}
