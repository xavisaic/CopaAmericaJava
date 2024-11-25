public class PrincipalCopaAmerica {
    public static void main(String[] args) {
        // Crear el estadio
        Estadio estadio = new Estadio(1, "Maracaná");

        // Crear los países
        Pais pais1 = new Pais(10, "Argentina");
        Pais pais2 = new Pais(20, "Brasil");

        // Crear los equipos
        Equipo equipo1 = new Equipo('A', 3, pais1); // Grupo A, ranking FIFA 3
        Equipo equipo2 = new Equipo('B', 1, pais2); // Grupo B, ranking FIFA 1

        // Crear la fecha del partido
        Fecha fecha = new Fecha(25, 11, 2024); // 25 de noviembre de 2024

        // Crear el partido
        Partido partido = new Partido("FINAL", equipo1, equipo2, estadio, fecha);

        // 1. Mostrar el nombre del estadio del partido
        System.out.println("Estadio del partido: " + partido.getEstadio().getNomEstadio());

        // 2. Mostrar el estado completo del partido
        System.out.println("Estado del partido: " + partido);

        // 3. Mostrar los grupos de ambos equipos
        System.out.println("Grupo del equipo 1: " + partido.getEquipo1().getGrupo());
        System.out.println("Grupo del equipo 2: " + partido.getEquipo2().getGrupo());

        // 4. Mostrar el código del país mejor ranqueado
        Equipo mejorEquipo = partido.getEquipo1().getRankingFifa() < partido.getEquipo2().getRankingFifa()
                ? partido.getEquipo1() : partido.getEquipo2();
        System.out.println("Código del país mejor ranqueado: " + mejorEquipo.getPais().getCodPais());
    }
}
