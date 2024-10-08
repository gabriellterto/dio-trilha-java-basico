import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Parametro 1: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Parametro 2: ");
        int parametroDois = scanner.nextInt();


        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem + 1; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}