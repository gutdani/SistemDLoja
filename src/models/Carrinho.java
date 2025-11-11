package models;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produtos> produtosSelecionados;
    private ArrayList<Produtos> produtosDisponiveis;

    public Carrinho(ArrayList<Produtos> produtosDisponiveis) {
        this.produtosSelecionados = new ArrayList<>();
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public void adicionarPorNome(String nome) {
        Produtos produtoEncontrado = null;

        for (Produtos p : produtosDisponiveis) {  //esse é o loop de procurar o produto. ele vai olhar na lista
            if (p.getNome().equalsIgnoreCase(nome)) {  //equalsIgnoreCase serve pra ignorar se a letra é minuscula ou maiusculas
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado != null) {  // se o produto for encontrado ele vai adicionar no carrinho
            produtosSelecionados.add(produtoEncontrado);
            System.out.println(" O produto " + produtoEncontrado.getNome() + " foi adicionado ao carrinho!");
        } else { //se o produto n for encontrado ele vai dizer que não foi
            System.out.println(" Produto '" + nome + "' não encontrado na loja.");
        }
    }

    public void remover(String nome) {
        Produtos produtoRemovido = null;  //isso é so pra definir que ele começa como null

        for (Produtos p : produtosSelecionados) {  //mesma coisa de cima, o usuário vai digitar o produto que quer e o programa vai pesquisar, soq ao inves de ser na lista toda, vai ser so na lista do carrinho.
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) { //se for diferente de null ele vai remover do carrinho e printar que foi removido
            produtosSelecionados.remove(produtoRemovido);
            System.out.println(" O produto " + nome + " foi removido do carrinho.");
        } else { //se não encontrar
            System.out.println(" Produto " + nome + " não encontrado no carrinho.");
        }
    }

    public ArrayList<Produtos> getProdutos() {
        return produtosSelecionados;
    }
}
