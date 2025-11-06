import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produtos> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }  //cria a lista de produtos no carrinho

    public void adicionar(Produtos p) {
        System.out.println("O produto "+ p.getNome() + "foi adicionado no carrinho!");
        produtos.add(p);
    }


    public void remover(String nome) {
        Produtos produtoRemovido = null;

        for (Produtos p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {  //equalsIgnoreCase serve pra ignorar letras maiusculas e minusculas
                produtoRemovido = p;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("O produto " + nome + " foi removido do carrinho.");
        } else {
            System.out.println("Produto " + nome + " não encontrado no carrinho.");
        }
    }


    public ArrayList<Produtos> getProdutos(){
        return produtos;
    }
}
