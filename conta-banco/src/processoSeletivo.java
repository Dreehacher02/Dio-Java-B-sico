
import java.util.concurrent.ThreadLocalRandom;
public class processoSeletivo { 
    public static void main(String[] args) {
        selecaoDeCandidatos();
    }
        static void selecaoDeCandidatos() {
         String [] candidatos = {"Adriano", "Mikael", "Adriel", "Andreza", "Adriele", "Angelica", "Andrei", "Everaldo", "Rafa", "Roberto"};

         int  candidatosSelecionados = 0;
         int candidatoAtual = 0;
         double salarioBase = 2000.0;
         while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual ++;
         }
    }
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
        static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para Candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para Candidato");
        }else{
            System.out.println("Aguardar resultado dos demais candidatos");
        }
        }
}
