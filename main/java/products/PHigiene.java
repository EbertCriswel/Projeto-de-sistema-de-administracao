package products;

import java.util.Date;

public class PHigiene extends Produto {
    public PHigiene(String nome, Date data, double valor){
        super(nome, data,valor);
    }

    @Override
    public void setNome(String nome) {

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
