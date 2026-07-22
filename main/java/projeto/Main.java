package projeto;

import projeto.products.FactGeradorDeProdut;

public class Main {

    public static void main(String[] args) {
         FactGeradorDeProdut produto = new FactGeradorDeProdut();
         produto.geradorProduto("Creme de Leite", "12/05/2026", 3.5, "Higienico", "12343");


    }
}
