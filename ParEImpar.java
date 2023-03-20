import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Quantidade de Numeros: ");
        int quantNumeros = scan.nextInt();
        int quantPar = 0;
        int quantImpar = 0;
        int count = 0;
        do{
            System.out.println("Numero: ");
            int numero = scan.nextInt();
            count++;
            if (numero % 2 == 0){
                quantPar++;
            } else {
                quantImpar++;
            }


        }while (count < quantNumeros);
                
        System.out.println("Quantidade de Pares: " + quantPar);
        System.out.println("Quantidade de Impares: " + quantImpar);

        scan.close();
    }
}
