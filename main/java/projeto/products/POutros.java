package projeto.products;

public class POutros extends Produto  {
    //Essa variável foi criada para sempre que um produto desse tipo for comprado ou sair eçe vai ser notificado aqui
    private int quant = 0;
    public POutros(String nome, String data, double valor, String lote){
        super(nome, data,valor, lote);
        setAdd();
    }

    public void setAdd(){
        quant++;
    }

    public int getQuant(){
        return this.quant;
    }



}
