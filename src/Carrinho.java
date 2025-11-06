import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produtos> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produtos p) {
        System.out.println("O produto "+ p.getNome() + "foi adicionado no carrinho!");;
        produtos.add(p);
    }

    public String remover(int idProduto) {
        Produtos produtoRemovido = null;

        for (Produtos p : produtos) {
            if (p.getIdProduto() == idProduto) { // compara o id corretamente
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            return "O produto de ID " + idProduto + " foi removido do carrinho.";
        } else {
            return "Produto com ID " + idProduto + " não encontrado no carrinho.";
        }
    }

    public ArrayList<Produtos> getProdutos(){
        return produtos;
    }
}
