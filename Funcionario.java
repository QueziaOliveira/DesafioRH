import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private String email;
    private int cpf;
    private int idade;
    private String telefone;
    private double salario;

    private String cargo;

    public Funcionario() {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void solicitarFerias() {
        System.out.println("Funcionário " + getNome() + " solicitou férias!!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Equals e Hashcode para uso do if após o scanner na classe RHTeste.
    @Override
    public boolean equals(Object cargos) {
        if (cargos instanceof Funcionario) {
            Funcionario outro = (Funcionario) cargos;
            boolean cargoIgual = outro.cargo.equals(this.cargo);
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, cpf, idade, telefone, salario);
    }
}

