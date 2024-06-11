package entidades;

import ClassesAbstratas.Produto;

public class Dvd extends Produto implements Taxa{

    protected String nome;
    protected int classificacao;

    public Dvd(int id, Double precoDeCompra, String nome, int classificacao) {
        super(id, precoDeCompra);
        this.nome = nome;
        this.classificacao = classificacao;
        codigoDeBarra = gerarCodigoDeBarra();
        taxa = calcularTaxa();
        precoDeVenda = calcularPrecoDeVenda();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public double calcularTaxa() {
        return precoDeCompra * 0.05;
    }
        
    @Override
    public double calcularPrecoDeVenda() {
        return (precoDeCompra * 2) + taxa;
    } 

    @Override
    public String toString() {
        return "Dvd [nome=" + nome + ", classificacao=" + classificacao + "]";
    }   

}