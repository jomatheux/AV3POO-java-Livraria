package entidades;

import ClassesAbstratas.Produto;
import interfaces.Taxa;

public class Livro extends Produto implements Taxa {

    protected String nome;
    protected String genero;    

    public Livro(int id, Double precoDeCompra, String nome, String genero) {
        super(id, precoDeCompra);
        this.nome = nome;
        this.genero = genero;
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



    public String getGenero() {
        return genero;
    }



    public void setGenero(String genero) {
        this.genero = genero;
    }    
    

    @Override
    public double calcularTaxa() {
        return precoDeCompra * 0.07;
    }

    @Override
    public double calcularPrecoDeVenda() {
        return (precoDeCompra * 2) + taxa;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", genero=" + genero + "]";
    }
}