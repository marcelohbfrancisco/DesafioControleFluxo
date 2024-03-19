import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite o primeiro parametro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametroDois = scanner.nextInt();

            if (parametroUm >= parametroDois){
                throw new ParametrosInvalidosException("O segundo argumento deve ser maior que o primeiro");
            } contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException ime) {
            System.out.println(ime.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas numeros inteiros");
        } finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int totalIteracoes = parametroDois - parametroUm;
        for (int i = 1; i < totalIteracoes; i++){
            System.out.println("Imprimindo iteração numero:  " + i);
        }
    }

}
