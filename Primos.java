import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        System.out.println("Digite un entero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("El número digitado " + isPrime(n));

    }

    static String isPrime(int n) {
        String rpta = "Es primo";
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                rpta = " No es Primo";

            }//fin if
        }//fin for
        return rpta;
    }//fin del método

}//fin class
