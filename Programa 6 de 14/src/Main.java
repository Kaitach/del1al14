import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla que desea ver"));
        for (int i=1; i<=10; i++ ){

            System.out.println( tabla+  " * "+ i +" = " + (tabla*i));


        }

    }


}