import java.util.HashMap;
import java.util.Map;

public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private String nivel;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super();
        this.linguagem = linguagem;
        this.nivel = "Junior"; // Define o nível inicial como Júnior
    }

    public String getLinguagem() {
        return linguagem;
    }

    public String getNivel() {
        return nivel;
    }

    public void promoverParaPleno() {
        nivel = "Pleno";
        // Adicione qualquer comportamento adicional para a promoção para Pleno
    }

    public void promoverParaSenior() {
        nivel = "Senior";
        // Adicione qualquer comportamento adicional para a promoção para Sênior
    }
}
