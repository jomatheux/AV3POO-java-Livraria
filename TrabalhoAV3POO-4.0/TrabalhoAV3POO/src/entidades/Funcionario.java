package entidades;

import ClassesAbstratas.Pessoa;

public class Funcionario extends Pessoa {
    protected String matricula;
    protected String senha;   
    
    public Funcionario(String nome, String cpf, boolean eUmFuncionario, int idade, String senha) {
        super(nome, cpf, eUmFuncionario, idade);
        this.matricula = gerarIdentificacao();
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }

    public String getMatricula() {
        return matricula;
    }
    
    @Override
    public String gerarIdentificacao(){
        String str = "";
         for(int i = 0; i < 8; i++){
             int inteiro = (int)(Math.random()*10);
             str += inteiro;        
         }
             return str;
    }

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + "]";
    }

    
}