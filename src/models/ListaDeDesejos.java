package models;

import java.util.ArrayList;

public class ListaDeDesejos extends Carrinho{
    ArrayList<Produtos> produtosDisponiveis;
    ArrayList<Produtos> produtosSelecionados = new ArrayList<>();
    public ListaDeDesejos(ArrayList<Produtos> produtosDisponiveis) {
        super(produtosDisponiveis);
        this.produtosDisponiveis = produtosDisponiveis;
    }

@Override
    public void adicionarPorNome(String nome) {

        Produtos produtoEncontrado = null;

    for(
        Produtos p :produtosDisponiveis)

        {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = p;
                break;
            }
        }

    if(produtoEncontrado !=null)

        {
            produtosSelecionados.add(produtoEncontrado);
            System.out.println(" O produto " + produtoEncontrado.getNome() + " foi adicionado sua lista de desejos!");
        } else

        { //se o produto n for encontrado ele vai dizer que não foi
            System.out.println(" Produto '" + nome + "' não encontrado na loja.");
        }
    }

    public void remover(String nome) {
        Produtos produtoRemovido = null;

        for (Produtos p : produtosSelecionados) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtosSelecionados.remove(produtoRemovido);
            System.out.println(" O produto " + nome + " foi removido da Lista de Desejos.");
        } else {
            System.out.println(" Produto " + nome + " não encontrado na Lista de desejos.");
        }
    }
}
