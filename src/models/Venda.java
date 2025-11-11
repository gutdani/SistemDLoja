package models;

import java.util.ArrayList;

public class Venda {
    Carrinho carrinho;

    public Venda(Carrinho carrinho){
        this.carrinho = carrinho;
    }

    public void totalPreco(){

        ArrayList<Produtos> p = carrinho.getProdutos();
        double total = 0;

        for (int i= 0; i<p.size(); i++){
            total += p.get(i).getPreco();
        }

        System.out.println("O valor da sua compra foi: R$"+total);

    }
}
