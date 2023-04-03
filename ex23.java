import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler.nextInt();

        if (numero > 80){
            System.out.println(numero+" É maior que 80");
        }else
        if (numero == 40){
            System.out.println(numero+" É igual 40");
        }else
        if (numero < 25){
            System.out.println(numero+ " É menor que 25");
        }
    }
}
