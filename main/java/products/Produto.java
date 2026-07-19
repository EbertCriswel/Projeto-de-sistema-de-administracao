package products;

import java.util.Date;

public abstract class Produto{

    //Precisa colocar um hascode para diferenciar cada produto
    //Também é importante classificar por marca, mas ai é num método de consulta, mas precisa ter essa informarçao
    //ao gerar o produto

    private String nomeDoProduto;
    private String dataDeValidade;
    private double valorDoProduto;
    private String categoriaDoProduto;
    public Lote lote;

    public Produto(String nome,final String data, double valor, String categoria) {
        this.nomeDoProduto = nome;
        this.dataDeValidade = data;
        this.valorDoProduto = valor;
        this.categoriaDoProduto = categoria;
    }

    public Produto(String nome,final String data, double valor) {
        this.nomeDoProduto = nome;
        this.dataDeValidade = data;
        this.valorDoProduto = valor;

    }


    public void setNome(String nome){
        if(!nome.equals("") || nome != null ){
            this.nomeDoProduto = nome;
        }else{
            System.out.println("N foi possivel relaizar a operação");
        }

    }

    public String getNome(){
        return this.nomeDoProduto;
    }

    public void setValor(double valor){
        this.valorDoProduto = valor;

    }

    public double getValor (){
        return this.valorDoProduto;
    }

    public String getCategoria(){
        return this.categoriaDoProduto;
    }

    public String getData(){
        return this.dataDeValidade;
    }


}
