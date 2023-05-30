import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RHTeste {
    public static void main(String[] args) {

        System.out.println("Qual a sua função? (Escreva tudo com letras minúsculas)");
        Scanner entrada = new Scanner(System.in);
        String cargo = entrada.nextLine();


        if (cargo.equals("gerente")){
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();
            //Map<Integer, Funcionario> gerente = new HashMap<>();
            //System.out.println(gerente.put(1, new Funcionario("João", "Gerente")));  TÁ DANDO ERRO...
        }
        else if (cargo.equals("desenvolvedor")){
            System.out.println("Funciona");
        }
        else if (cargo.equals("estagiario")){
            System.out.println("Funciona legal");
        }
            else{
            System.out.println("Função inválida");
        }

        /*Map<Funcionario, String> funcionarios = new HashMap<>();
        funcionarios.put();

        for(String funcionario: funcionarios.keySet());
        System.out.println(funcionario);*/




    }
}
