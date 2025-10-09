import java.util.Random;
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
        }
        //Ejercicio 3
        System.out.println("pon el año");
        int año = sp.nextInt();
        System.out.println("pone el mes");
        int mesnum = sp.nextInt();
        System.out.println("pon el dia");
        int dia = sp.nextInt();
        System.out.println(validarFecha(año, dia, mesnum));

        //Ejercicio4
        System.out.println("pon un numero y veremos si es primo o no!");
        int numeroprimo = sp.nextInt();
        if (validarPrimo(numeroprimo)) {
            System.out.println("primo");
        } else {
            System.out.println("no es primo");
        }*/

        //Ejercicio5
        Random sj = new Random();
        System.out.println("pon un numero");
        int n1 = sp.nextInt();
        int intentos = 3;
        int ramdon1 = sj.nextInt(108-56 +1) + 56;
        adivinarNumero(n1, ramdon1,intentos);
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

    public static boolean validarFecha(int año, int dia, int num) {
        if (año < 2025 && num >= 1 && num <= 12) {

            if ((num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) && dia <= 31) {
                return true;
            } else if ((num == 4 || num == 6 || num == 9 || num == 11) && dia <= 30) {
                return true;
            } else if (num == 2 && dia <= 28) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean validarPrimo(int numero) {
        for (int i = numero - 1; i >= 2; i--) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void adivinarNumero(int n1, int random1,int intentos) {
        Scanner sp = new Scanner(System.in);
        if((n1 % 2 != 0) && n1 > 50){
            System.out.println("numero multiplicado por el numero ramdon" + (n1*random1));
            for (int i = 1; i <= intentos; i++) {
                System.out.println("adivina el numero");
                int n2 = sp.nextInt();
                if (n2 == random1) {
                    System.out.println("numero acertado");
                    //i = intentos + 1;
                } else if (n2 > random1) {
                    System.out.println("El numero es mas pequeño");
                } else {
                    System.out.println("El numero es mas grande");
                }

            }
        }else{
            System.out.println("NO VALIDO");
            }
        System.out.println("Te has quedado sin intentos");
        }
    }
