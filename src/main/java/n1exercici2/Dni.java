package n1exercici2;

import java.util.Scanner;

public class Dni {

    private int numDni;



    public int askDniNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu número de DNI: ");
        int numDNI = sc.nextInt();

        return numDNI;
    }

    public static char calcularLetra(int numDni){

        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto;
        resto = numDni % 23;

        return caracteres.charAt(resto);

    }
}
