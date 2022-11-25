import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a elevar"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Elevar a la: "));
        int  total=numero;

        for (int i=1; i<=cantidad; i++)
        {
            total *= numero;
        }

        JOptionPane.showMessageDialog(null,"El total es: " + total);

    }
}