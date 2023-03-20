public class OperadorTernario {
 
    public static void main(String[] args)  {
        int a, b;

        a = 5;
        b = 6;

        String resultadoIgual = a == b ? "verdadeiro" : "falso";

        System.out.println(resultadoIgual);

        String resultadoDiferente = a != b ? "verdadeiro" : "falso";

        System.out.println(resultadoDiferente);
}
}