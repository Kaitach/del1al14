import javax.swing.*;

public class Main {
    public static void main(String[] args)

    {

        int trabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores: "));

        int salarios[] = new int [trabajadores];
        int salariosNuevos[] = new  int[trabajadores];

        for (int i=0; i<trabajadores; i++) {
            salarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del trabajador: "));
            if (salarios[i]< 1000){
                salariosNuevos[i] = (int) (salarios[i] * 1.15);
            }
            else {
                salariosNuevos[i] = (int) (salarios[i] * 1.12);
            }
        }

        for(int i=0; i<trabajadores; i++){
            JOptionPane.showMessageDialog(null,"El salario del empleado " + i + " es de " + salariosNuevos[i]);;
        }

    }
}