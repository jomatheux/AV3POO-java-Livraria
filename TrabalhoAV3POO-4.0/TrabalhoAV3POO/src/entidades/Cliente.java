package entidades;

import ClassesAbstratas.Pessoa;

public class Cliente extends Pessoa {
    protected String numeroDeCadastro;

    public Cliente(String nome, String cpf, boolean eUmFuncionario, int idade) {
        super(nome, cpf, eUmFuncionario,idade);
        this.numeroDeCadastro = gerarIdentificacao();
    }

    public String getNumeroDeCadastro() {
        return numeroDeCadastro;
    }    

    @Override
    public String toString() {
        return "Cliente [numeroDeCadastro=" + numeroDeCadastro + "]";
    }

    @Override
    public String gerarIdentificacao(){
        String str = "";
         for(int i = 0; i < 10; i++){
             int inteiro = (int)(Math.random()*10);
             str += inteiro;        
         }
             return str;
    }   



    
}