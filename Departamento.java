import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDep;
    private Double salario;
    private List<Funcionario> funcionarios;

    public Departamento(String nomeDep, Double salario) {
        this.nomeDep=nomeDep;
        this.salario=salario;
        this.funcionarios=new ArrayList<>(); 
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int matricula) {
        funcionarios.removeIf(funcionario -> funcionario.getMatricula() == matricula);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public int getQuantidadeFuncionarios() {
        return funcionarios.size();
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public Double getSalario(){
        return salario;
    }

    public String toString() {
        return "Departamento: " + nomeDep + ", Número de Funcionários: " + getQuantidadeFuncionarios() + ", Salário padrão: " + salario;
    }
}
