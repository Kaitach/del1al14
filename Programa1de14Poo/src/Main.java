import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, pares=0, sumaImpares=0;
        Scanner numeros = new Scanner(System.in);
        for  (int i=0; i<270; i++){
            System.out.print("ingrese un numero, actualmente estamos en " +(i+1)+ " de 270: ");
            numero=numeros.nextInt();
            if(numero % 2 == 0){
                pares = pares+1;
            }
            else {
                sumaImpares = sumaImpares + numero;
            }

        }
        System.out.println("El total de numeros pares ingresados es: " +pares);
        System.out.println("El total de la suma de los impares ingresados es: " +sumaImpares);
}
}