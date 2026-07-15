package products;

import java.util.Date;

public class PLimpeza extends Produto  {
    //String nome = getNome();
    public PLimpeza(String nome, Date data, double valor){
        super(nome, data,valor);
    }

    @Override
    public void setNome(String novoNome) {
        if(getNome() != null || !getNome().equals(" ")){
            this.nome = novoNome;
        }
        System.out.println("Impossível realizar troca de nomes!");

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setValor(double valor) {


    }

    @Override
    public double getValor() {
        return valor;
    }
}
