import javax.swing.*;

public class Main {
     static int boleto1 , boleto2, boleto3, boleto4, boleto5,vendidos1,vendidos2,vendidos3,vendidos4,vendidos5,total;

    public static void main(String[] args) {



        boleto1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del boleto 1"));
        boleto2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del boleto 2"));
        boleto3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del boleto 3"));
        boleto4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del boleto 4"));
        boleto5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del boleto 5"));


        menu();

    }
    static void menu() {


        byte opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU PRINCIPAL\n  1: Comprar boletos de " + boleto1 +
                "\n  2: Comprar boletos de " + boleto2 +
                "\n  3: Comprar boletos de " + boleto3 +
                "\n  4: Comprar boletos de " + boleto4 +
                "\n  5: Comprar boletos de " + boleto5 +
                "\n  6: TOTAL " +
                "\n ELIJA SU OPCION "));
            switch (opcion) {

                case 1:
                    vendidos1 += 1;
                    total += vendidos1;
                    menu();
                    break;
                case 2:
                    vendidos2 += 1;
                    total += vendidos2;
                    menu();

                    break;
                case 3:
                    vendidos3 += 1;
                    total += vendidos3;
                    menu();


                    break;
                case 4:
                    vendidos4 += 1;
                    total += vendidos4;
                    menu();

                    break;
                case 5:
                    vendidos5 += 1;
                    total += vendidos5;
                    menu();

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Los boletos del costo " +boleto1 + " se vendieron " + vendidos1 +"\n" +
                            "Los boletos del costo " +boleto2 + " se vendieron " + vendidos2 +"\n" +
                            "Los boletos del costo " +boleto3 + " se vendieron " + vendidos3 +"\n" +
                            "Los boletos del costo " +boleto4 + " se vendieron " + vendidos4 +"\n"+
                            "Los boletos del costo " +boleto5 + " se vendieron " + vendidos5 +"\n" +
                            "El total de boleto vendidos fue de : $" + total
                    );
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Entrada invalida");
                    menu();

                    break;
            }

    }


}