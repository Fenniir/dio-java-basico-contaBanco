import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {
    
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

      System.out.println("Por favor, digite o Número da Conta !");
      int numero = scanner.nextInt();

      System.out.println("Por favor, digite o número da Agência !");
      String agencia = scanner.next();

      System.out.println("Por favor, digite o Nome do Cliente !");
      String nome = scanner.next();

      System.out.println("Por favor, digite o Saldo da Conta !");
      //limpando cache.
      scanner.nextLine();
      //Prosseguindo.
      double saldo = scanner.nextDouble();

      scanner.close();


      //resultado dos dados inseridos   

      System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");






    }
}
