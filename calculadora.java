package ExercicioCalc;
import java.util.Scanner;
/** 
 * <h1>Calculadora</h1>
 *A Calculadora realiza operações matemáticas entre números inteiros
 *   <p>
 *   <b>Note:</b> Leia atentamente a documentação desta classes
 *  para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Pedro
 * @version 1.5
 * @since 22/03/2023
*/

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multiplicacao = multiplicacao(a,b);
        int divisao= divisao(a,b);

        System.out.println("Resultados:");
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }

        /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public static int soma(int a, int b){
        return a + b;
    }
            /**
   * Este método é utilizado para subtrair dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public static int subtracao(int a, int b){
        return a - b;
    }
                /**
   * Este método é utilizado para multiplicar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public static int multiplicacao(int a, int b){
        return a * b;
    }
                /**
   * Este método é utilizado para dividir dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public static int divisao(int a, int b){
        return a / b;
    }   
}
