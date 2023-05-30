import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Teste da classe Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 3000.0, "Java");
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário: " + desenvolvedor.getSalario());
        System.out.println("Linguagem: " + desenvolvedor.getLinguagem());

        // Teste da classe Estagiario
        Estagiario estagiario = new Estagiario("Maria", 1000.0, 6);
        System.out.println("Nome: " + estagiario.getNome());
        System.out.println("Salário: " + estagiario.getSalario());
        System.out.println("Duração do Estágio: " + estagiario.getDuracaoEstagio() + " meses");

        // Teste da classe Gerente
        Gerente gerente = new Gerente("Carlos", 5000.0, "TI");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());

        // Teste do método solicitarFerias() da classe Funcionario
        desenvolvedor.solicitarFerias();
        estagiario.solicitarFerias();
        gerente.solicitarFerias();

        // Teste do método aprovarFerias() da classe Gerente
        Gerente gerente2 = new Gerente("Ana", 4000.0, "RH");
        gerente.aprovarFerias(desenvolvedor);
        gerente2.aprovarFerias(estagiario);
    }
}
