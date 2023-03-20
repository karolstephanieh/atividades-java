import java.util.Scanner;

public class ImprimindoPositivosEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int positivo = 0;
        System.out.println("Numeros: ");
        int num = scan.nextInt();

        for (int i = 0; i < 6; i++){
            if (num > 0){
                soma += num;
                positivo++;
            }
        }

        System.out.println("Numeros positivos" + positivo);
        System.out.println("Media: " + (soma/positivo));
        
        scan.close();
    }
}
