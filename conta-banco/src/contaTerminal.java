public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:cconhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
       String agencia = args [0];
       String usuario = args[1];
       String nome = args [2];
       String saldo = args [3];

       System.out.println("Digite sua conta " + agencia);
       System.out.println("digite seu numero de usuario " + usuario);
       System.out.println("digite seu nome " + nome);
       System.out.println("obrigado por criar sua conta, seu saldo é: " + saldo);

    }
}
