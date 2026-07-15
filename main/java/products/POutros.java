package products;

import java.util.Date;

public class POutros extends Produto  {
    public POutros(String nome, Date data, double valor){
        super(nome, data,valor);
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
