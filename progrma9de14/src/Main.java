import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));


        for (int i=0; i<cantidad; i++){
            if (numero > numero2) {
                JOptionPane.showMessageDialog(null , " " + numero + " es mayor que " + numero2 );
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero:"));
            }
            else {
                JOptionPane.showMessageDialog(null , " " + numero2 + " es mayor que " + numero );
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero:"));

            }


        }
        if (numero > numero2) {
            JOptionPane.showMessageDialog(null , " " + numero + " es mayor que " + numero2 );
        }
        else {
            JOptionPane.showMessageDialog(null , " " + numero2 + " es mayor que " + numero );

        }
    }
}