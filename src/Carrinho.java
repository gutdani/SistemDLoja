import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produtos> produtosNoCarrinho;
    private ArrayList<Produtos> produtosDisponiveis;

    public Carrinho(ArrayList<Produtos> produtosDisponiveis) {
        this.produtosNoCarrinho = new ArrayList<>();
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public void adicionarPorNome(String nome) {
        Produtos produtoEncontrado = null;

        for (Produtos p : produtosDisponiveis) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado != null) {
            produtosNoCarrinho.add(produtoEncontrado);
            System.out.println(" O produto " + produtoEncontrado.getNome() + " foi adicionado ao carrinho!");
        } else {
            System.out.println(" Produto '" + nome + "' não encontrado na loja.");
        }
    }

    public void remover(String nome) {
        Produtos produtoRemovido = null;

        for (Produtos p : produtosNoCarrinho) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtosNoCarrinho.remove(produtoRemovido);
            System.out.println(" O produto " + nome + " foi removido do carrinho.");
        } else {
            System.out.println(" Produto " + nome + " não encontrado no carrinho.");
        }
    }

    public ArrayList<Produtos> getProdutos() {
        return produtosNoCarrinho;
    }
}
