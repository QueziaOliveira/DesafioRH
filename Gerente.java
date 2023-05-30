import java.util.HashMap;
import java.util.Map;

public class Gerente extends Funcionario {
    private String departamento;
    private String contrato;
    private String distrato;
    private double promocao;

    public Gerente(String nome, double salario, String departamento) {
        super();
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDistrato() {
        return distrato;
    }

    public void setDistrato(String distrato) {
        this.distrato = distrato;
    }

    public double getPromocao() {
        return promocao;
    }

    public void setPromocao(double promocao) {
        this.promocao = promocao;
    }

    public void aprovarFerias(Funcionario funcionario) {
        System.out.println("Gerente " + getNome() + " aprovou as férias para o funcionário " + funcionario.getNome());
    }

    public void realizarContratacao(String nomeFuncionario) {
        System.out.println("Gerente " + getNome() + " realizou a contratação do funcionário " + nomeFuncionario);
    }

    public void realizarDemissao(String nomeFuncionario) {
        System.out.println("Gerente " + getNome() + " realizou a demissão do funcionário " + nomeFuncionario);
    }
}
