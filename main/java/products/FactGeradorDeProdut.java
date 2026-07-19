package products;

public class FactGeradorDeProdut {

    //Aqui estou fazendo unm factory
    // OBS: É necessário fazer um tratamento de exceções para caso não se tenha os valores necessérios para a criação
    public Produto geradorProduto(String nome,final String data, double valor, String categoria){

        if(categoria != null){
            switch(categoria.toUpperCase()){
                case"HIGIENICO":
                    return new PHigiene(nome, data, valor);
                case "LIMPEZA":
                    return new PLimpeza(nome, data, valor);
                case "ALIMENTICIO":
                    return new PAlimenticio(nome, data, valor);
                default:
                    return new POutros(nome, data, valor);
            }
        }
        System.out.println("Impossível adicionar produto");
        return null;
    }

    //Criar métodos para conseguir pegar o produto criado e retorna informações pedidas;
    //Tbm é possível criar um numero específico de produto.





}
