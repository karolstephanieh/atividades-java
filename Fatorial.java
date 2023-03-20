import java.util.Scanner;

class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int mult = 1;
        
        for (int i = 1; i <= fatorial; i++) {
            mult *=i;
        }

        System.out.println(fatorial + "! = " + mult);

        scan.close();
    }
}