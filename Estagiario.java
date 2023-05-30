import java.util.HashMap;
import java.util.Map;

public class Estagiario extends Funcionario {
    private double duracaoEstagio;
    private String instituicao;
    private String curso;


    public Estagiario(String nome, double salario, double duracaoEstagio) {
        super();
        this.duracaoEstagio = duracaoEstagio;
    }

    public double getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDuracaoEstagio(double duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }

    public void realizarTarefa(String tarefa) {
        System.out.println("Realizando tarefa: " + tarefa);
        //O método realizarTarefa() recebe uma String representando uma tarefa e imprime uma mensagem indicando que o estagiário está realizando essa tarefa.
    }

    public void solicitarAvaliacao() {
        System.out.println("Solicitando avaliação");
        //O método solicitarAvaliacao() imprime uma mensagem indicando que o estagiário está solicitando uma avaliação.
    }
}
