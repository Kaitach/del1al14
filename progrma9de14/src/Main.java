import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        int numero3 = 800000000 ;

        for (int i=0; i<(cantidad); i++){
            if (numero > numero2) {
                if (numero3 > numero2) {
                    numero3 = numero2;
                }
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero:"));
            }
            else {
                if (numero3 >  numero) {
                    numero3 = numero;
                }
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero:"));
            }

        }
        if (numero > numero2) {
            if (numero3 > numero2) {
                numero3 = numero2;
            }

        }
        else {
            if (numero3 >  numero) {
                numero3 = numero;
            }

        }
            JOptionPane.showMessageDialog(null , " De los numeros ingresados el mayor es:  " + numero + " y el menor:  " + numero3 );
        }

    }
