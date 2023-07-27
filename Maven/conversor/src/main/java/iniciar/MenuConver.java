
package iniciar;

import javax.swing.JOptionPane;
import converMoneda.Conversor;

public class MenuConver {
    public void eligeMenu() {
        String[] opciones = {"Convertir Monedas", "Nueva Opción", "Otra Opcion", "Salir"};
        boolean continuar = true;
	  
        while (continuar) {
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
                    "Menú de opciones", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            // Comprobar la opción seleccionada
            if (opcionSeleccionada == null) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    continuar = false;
                }
            } else if (opcionSeleccionada.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!", "Salir",
                        JOptionPane.INFORMATION_MESSAGE);
                continuar = false;
            } else {
                // Realizar acciones según la opción seleccionada
                switch (opcionSeleccionada) {
                    case "Convertir Monedas":
                        JOptionPane.showMessageDialog(null, "Seleccionaste Convertir Monedas", "Convertir Monedas",
                                JOptionPane.INFORMATION_MESSAGE);
                        Conversor cmoneda = new Conversor();
                        cmoneda.seleccionaMoneda();
                        break;
                    case "Nueva Opción":
                    case "Otra Opcion":
                        JOptionPane.showMessageDialog(null, "Seleccionaste " + opcionSeleccionada, opcionSeleccionada,
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        }
    }
}