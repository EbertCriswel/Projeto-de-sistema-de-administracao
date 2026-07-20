package projeto.products;

public class POutros extends Produto  {
    //Essa variável foi criada para sempre que um produto desse tipo for comprado ou sair eçe vai ser notificado aqui
    public static int quant = 0;
    public POutros(String nome, String data, double valor){
        super(nome, data,valor);
    }

}
