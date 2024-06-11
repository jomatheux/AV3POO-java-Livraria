package ClassesAbstratas;

public abstract class Produto {
    protected int id;
    protected String codigoDeBarra;
    protected Double precoDeCompra;
    protected Double precoDeVenda;
    protected double taxa;

    public Produto(int id, Double precoDeCompra) {
        this.id = id;
        this.precoDeCompra = precoDeCompra;        
    }   
    
    public int getId() {
        return id;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public Double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }
    
    public double getTaxa() {
        return taxa;
    }       

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public void setPrecoDeCompra(Double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }    
        
    @Override
    public String toString() {
        return "Produto [id=" + id + ", codigoDeBarra=" + codigoDeBarra + ", preco=" + precoDeCompra + ", taxa=" + taxa + "]";
    }
    
    public String gerarCodigoDeBarra(){
        String str = "";
        for(int i = 0; i < 12; i++){
            int inteiro = (int)(Math.random()*10);
            str += inteiro;        
        }
            return str;
    }
    
    public abstract double calcularPrecoDeVenda();   

}
        