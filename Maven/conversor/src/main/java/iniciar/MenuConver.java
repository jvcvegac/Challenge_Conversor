/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciar;

import javax.swing.JOptionPane;
import nrgocios.Conversor;

/**
 *
 * @author pepevega
 */
public class MenuConver {
    public void eligeMenu() {
        String[] opciones = {"Convertir Monedas", "Convertir Medidas", "Convertir Temperaturas", "Salir"};

        while (true) {
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:",
                    "Menú de opciones", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            // Comprobar la opción seleccionada
            if (opcionSeleccionada == null || opcionSeleccionada.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!", "Salir",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                // Realizar acciones según la opción seleccionada
                switch (opcionSeleccionada) {
                    case "Convertir Monedas":
                        JOptionPane.showMessageDialog(null, "Seleccionaste Convertir Monedas", "Convertir Monedas",
                                JOptionPane.INFORMATION_MESSAGE);
                        Conversor cmoneda = new Conversor();
                        cmoneda.seleccionaMoneda();
                        break;
                    case "Convertir Medidas":
                        JOptionPane.showMessageDialog(null, "Seleccionaste Convertir Medidas", "Convertir Medidas",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Convertir Temperaturas":
                        JOptionPane.showMessageDialog(null, "Seleccionaste Convertir Temperaturas", "Convertir Temperaturas",
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
