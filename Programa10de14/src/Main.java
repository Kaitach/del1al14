import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    int costo = Integer.parseInt(JOptionPane.showInputDialog("Inrese el costo de su producto"));

    if (costo <= 500 ){
        JOptionPane.showMessageDialog(null, "El costo del producto es de $" + costo);
    }
    else if (costo>501 && costo <= 1000){
        JOptionPane.showMessageDialog(null, "El costo del producto es de $" + (costo*0.95));

    }
    else if (costo>1001 && costo <= 7000){
        JOptionPane.showMessageDialog(null, "El costo del producto es de $" + (costo*0.89));
    }
    else if (costo>7001 && costo <= 15000){
        JOptionPane.showMessageDialog(null, "El costo del producto es de $" + (costo*0.82);
    }
    else {
        JOptionPane.showMessageDialog(null, "El costo del producto es de $" + (costo*0.75);

    }

    }
}
