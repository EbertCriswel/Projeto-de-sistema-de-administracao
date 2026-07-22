package projeto;

import projeto.products.Produto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Estoque implements ReceberNotificacao{
    /*
    OBS: muito complexo, pode ser simplificado esse hashmaps
     */


    Set<String> categorias = new HashSet<>();

    public void adicionarAoEstoque(boolean b, Produto p){
        if(b){
            addEstoque(p);

        }
        System.out.println("Impossivel adicionar ao estoque");
        //Temos que colocar a quantidade do produto

    }

    public void addEstoque(Produto produto){
        
    }

    //Fazer um observer para comunicar outra classe e add em BD e em folha de estoque
    public void adicionado(){

    }


}
