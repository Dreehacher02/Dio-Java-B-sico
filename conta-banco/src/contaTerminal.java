import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();
        
        System.out.println("Digite seu numero de usuario");
        String usuario = scanner.next();

        System.out.println("digite seu nome");
        String nome = scanner.next();
        
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("minha agencia: " + agencia);
        System.out.println("numero de usuario " + usuario);
        System.out.println("meu nome é " + nome);
        
        System.out.println("sua conta foi criada");
    }
}