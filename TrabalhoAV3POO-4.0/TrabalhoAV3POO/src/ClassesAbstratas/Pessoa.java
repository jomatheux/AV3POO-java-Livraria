package ClassesAbstratas;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected boolean eUmFuncionario;
    protected int idade;

    public Pessoa(String nome, String cpf, boolean eUmFuncionario , int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.eUmFuncionario = eUmFuncionario;
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }  
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
    
    public boolean isFuncionario() {
        return eUmFuncionario;
    }
    
    public void setFuncionario(boolean clienteOuFuncionario) {
        this.eUmFuncionario = clienteOuFuncionario;
    }    
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", eUmFuncionario=" + eUmFuncionario + ", idade=" + idade
                + "]";
    }

    public abstract String gerarIdentificacao();
    
}
