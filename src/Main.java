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
        System.out.println("pon el año");
        int año = sp.nextInt();
        System.out.println("pone el mes");
        int mesnum = sp.nextInt();
        String[] mes =  {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("pon el dia");
        int dia = sp.nextInt();
        pedirFecha(año,mes,dia,mesnum);*/

        System.out.println("pon un numero y veremos si es primo o no!");
        int numeroprimo = sp.nextInt();
        numeroPrimo(numeroprimo);

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
    public static void pedirFecha(int año, String[] mes, int dia, int num) {
        if(año < 2025 && num >=1 && num <=12 ) {
            if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12 && dia <= 31){
                System.out.println("La fecha seria " + dia + mes[num-1] + año);
            } else if (num == 4 || num == 6 || num == 9 || num == 11 && dia <= 30) {
                System.out.println("La fecha seria " + dia +  " " + mes[num-1] + " " + año);
            } else if (num == 2 && dia <= 28) {
                System.out.println("La fecha seria " + dia + " " + mes[num-1] + " " + año);
            }else{
                System.out.println("NO VALIDO: mes o dia incorrecto");
            }
        }else{
            System.out.println("NO VALIDO: Año incorrecto");
        }

    }


    public static boolean numeroPrimo(int numero) {
        if((numero % 1) == numero && numer{
            System.out.println("numero primo");
        }
    }
}
