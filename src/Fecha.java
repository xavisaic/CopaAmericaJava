public class Fecha {

    private int dia;  // Día del mes
    private int mes;  // Mes del año
    private int año;  // Año específico

    // Constructor que valida y establece los valores de día, mes y año
    public Fecha(int dia, int mes, int año) {
        setDia(dia, mes, año); // Valida y asigna el día
        setMes(mes);           // Valida y asigna el mes
        this.año = año;        // Asigna directamente el año (no tiene validación)
    }

    // Valida y establece el día considerando el mes y si es un año bisiesto
    public void setDia(int dia, int mes, int año) {
        if (dia >= 1 && dia <= diasEnMes(mes, año)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Día inválido para el mes y año especificados.");
        }
    }

    // Valida y establece el mes (debe estar en el rango de 1 a 12)
    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mes inválido.");
        }
    }

    // Calcula la cantidad de días en un mes específico
    private int diasEnMes(int mes, int año) {
        switch (mes) {
            case 2: // Febrero: considera si es año bisiesto
                return (esBisiesto(año)) ? 29 : 28;
            case 4: case 6: case 9: case 11: // Meses con 30 días
                return 30;
            default: // Meses con 31 días
                return 31;
        }
    }

    // Determina si un año es bisiesto
    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Representa la fecha en formato día/mes/año
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

}
