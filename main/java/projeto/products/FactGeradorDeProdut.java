package projeto.products;

import java.util.ArrayList;
import projeto.Estoque;
import projeto.ReceberNotificacao;

public class FactGeradorDeProdut {

    ArrayList<ReceberNotificacao> observadores = new ArrayList<>();

    private void adicionarObservers(){
        Estoque estoque = new Estoque();
        observadores.add(estoque);
    }

    //Aqui estou fazendo unm factory
    // OBS: É necessário fazer um tratamento de exceções para caso não se tenha os valores necessérios para a criação
    public Produto geradorProduto(String nome,final String data, double valor, String categoria){

        if(categoria != null){
            switch(categoria.toUpperCase()){
                case"HIGIENICO":
                    Produto criar = new PHigiene(nome, data, valor);

                    return criar;
                case "LIMPEZA":
                    Produto criarL = new PLimpeza(nome, data, valor);
                    return criarL;
                case "ALIMENTICIO":
                    Produto criarA = new PAlimenticio(nome, data, valor);
                    return criarA;
                default:
                    Produto criarO = new POutros(nome, data, valor);
                    return criarO;
            }
        }
        System.out.println("Impossível adicionar produto");
        return null;
    }

    private void notificar(){
        //Quando um produto for criado, vou colocar pra enviar uma notificação pra classe de estoque
        //Após essa notificação, uma classe dentro de estoque vai ser responsável por colocar ese produto dentro do estoque


    }
    //Criar métodos para conseguir pegar o produto criado e retorna informações pedidas;
    //Tbm é possível criar um numero específico de produto.





}
