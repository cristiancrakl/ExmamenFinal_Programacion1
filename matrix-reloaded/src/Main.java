import management.*;
import utils.ConsoleUtils;

public class Main {
    
    public void menuPrincipal(){
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        System.out.println("3. Mostrar Estadisticas");
        
        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1 2 o 3): ");

        if (opcion == 1) {
            AgenteManager agenteManager = new AgenteManager();
            agenteManager.mostrarMenu();
        } else if (opcion == 2) {
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarMenu();
        } else if(opcion == 3) {
            @SuppressWarnings("unused")
            mostrarEstadisticas estadisticas=new mostrarEstadisticas();
            mostrarEstadisticas.mostrarEstadisticas(opcion, opcion);

        }else{
            System.out.println("Opción no válida");
        }
    }
    
    
    public static void main(String[] args) {
        
        Main run=new Main();
        run.menuPrincipal();
        
    }
}

