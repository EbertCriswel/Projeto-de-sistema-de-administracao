package projeto;

import projeto.products.Produto;

import java.util.HashMap;

public class Estoque implements ReceberNotificacao{

    HashMap<String,HashMap<String, Produto>> estoque = new HashMap();

    public void adicionarAoEstoque(Produto p, String nomeP){
        //Temos que colocar a quantidade do produto

    }
    //Fazer um observer para comunicar outra classe e add em BD e em folha de estoque
    public void adicionado(){

    }


}
