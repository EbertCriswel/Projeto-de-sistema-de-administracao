package products;

import java.util.Date;

public abstract class Produto{

    private String nomeDoProduto;
    private Date dataDeValidade;
    private double valorDoProduto;
    private String categoriaDoProduto;

    public Produto(String nome,final Date data, double valor, String categoria) {
        this.nomeDoProduto = nome;
        this.dataDeValidade = data;
        this.valorDoProduto = valor;
        this.categoriaDoProduto = categoria;
    }

    public Produto(String nome,final Date data, double valor) {
        this.nomeDoProduto = nome;
        this.dataDeValidade = data;
        this.valorDoProduto = valor;

    }


    public void setNome(String nome){

    }

    public String getNome(){
        return "Ebert";
    }

    public void setValor(double valor){

    }

    public double getValor  (){
        return 0;
    }


}
