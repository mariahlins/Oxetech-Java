public class Funcionario {
    private String nome;
    private String cpf;
    private int matricula;
    private Departamento departamento;


    public Funcionario(String nome, String cpf, int matricula, Departamento departamento){
        this.nome=nome;
        this.cpf=cpf;
        this.matricula=matricula;
        this.departamento=departamento;
        departamento.adicionarFuncionario(this);
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public int getMatricula(){
        return matricula;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public Double getSalario(){
        return departamento.getSalario();
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String toString() {
        return "Nome: " + nome +
                ", Cpf: " + cpf +
                ", Salário: " + getSalario() +
                ", Matrícula: " + matricula +
                ", Departamento: " + departamento.getNomeDep();
    }
}
