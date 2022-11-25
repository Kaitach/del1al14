import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a elevar"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Elevar a la: "));
        int vueltas = 1;
        int  total=numero;

       while (vueltas < cantidad){
           vueltas +=1;
            total *=numero;
       }

        JOptionPane.showMessageDialog(null, "total = " + total);


    }

}