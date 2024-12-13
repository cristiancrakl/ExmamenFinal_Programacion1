package management;

public class mostrarEstadisticas {

    public static void mostrarEstadisticas(int totalAgentes, int totalAnomalias) {
        System.out.println("Estadísticas del sistema:");
        System.out.println("Total de agentes registrados: " + totalAgentes);
        System.out.println("Total de anomalías registradas: " + totalAnomalias);
    }

    public static void main(String[] args) {
        
        int totalAgentes = 0;
        int totalAnomalias = 0;
        mostrarEstadisticas(totalAgentes, totalAnomalias);
    }
}
