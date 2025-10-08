import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        //ejercicio1
        /*while (true) {
            System.out.println("Pon un numero");
            int numero = sp.nextInt();
            numeros1(numero);
        }

        //Ejercicio2
        System.out.println("pon un nuemro");
        int n = sp.nextInt();
        for(int i = 0; n > i; i++){
            System.out.println(i+1);
        }*/
        System.out.println("pon el año");
        int año = sp.nextInt();
        System.out.println("pone le mes");
        int[] mes = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("pon el mes");
        int dia = sp.nextInt();




    }
    public static boolean numeros1(int numero) {
        if ((numero % 2 == 0) && ((numero * 5) > 25)) {
            System.out.println(numero);
            return true;
        } else if ((numero % 2 != 0) && ((numero * 3) < 10)) {
            System.out.println(numero);
            return true;
        } else {
            System.out.println("NO VALIDO");
            return false;
        }
    }
}