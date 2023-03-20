public class OperadorRelacional {
 
    public static void main(String[] args)  {
        int numero1 = 1;
        int numero2 = 2;

        boolean Igual = numero1 == numero2;
        System.out.println("O numero1 é igual a numero2? " + Igual);

        boolean Diferente = numero1 != numero2;
        System.out.println("O numero1 é diferente do numero2? " + Diferente);

        boolean MaiorIgual = numero1 >= numero2;
        System.out.println("O numero1 é maior que o numero2? " + MaiorIgual);

        boolean MenorIgual = numero1 <= numero2;
        System.out.println("O numero1 é menor do numero2? " + MenorIgual);



    }
}