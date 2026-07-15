package products;

import java.util.Date;

public class PAlimenticio extends Produto {
    //Posso criar mais variávis e adicionaar no construtor;
    public PAlimenticio(String nome, Date data, int valor){
        super(nome, data, valor);
    }

    @Override
    public void setNome(String nome) {

    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public void setValor(double valor) {

    }

    @Override
    public double getValor() {
        return 0;
    }
}
