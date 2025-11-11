import models.Carrinho;
import models.Produtos;
import models.Venda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBEM-VINDO À STORE GAMER!");
        System.out.println("\nESSES SÃO OS NOSSOS PRODUTOS:\n");

        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produtos(111, "CUBO MÁGICO", "Cubo mágico profissional pra você brincar", 20, 70));
        listaProdutos.add(new Produtos(222, "FONE DE OUVIDO", "Fone de ouvido bluetooth original", 119.99, 55));
        listaProdutos.add(new Produtos(333, "CONTROLE DE VIDEO GAME", "Controle sem fio Xbox", 464.90, 123));
        listaProdutos.add(new Produtos(444, "MOUSEPAD FORTREK", "Mousepad gamer Fortrek original", 40.00, 35));
        listaProdutos.add(new Produtos(555, "HEADSET GAMER HAVIT", "Headset gamer Havit tri-mode", 355.90, 60));
        listaProdutos.add(new Produtos(666, "MOUSE REDRAGON", "Mouse gamer Redragon", 125.00, 66));

        for (Produtos p : listaProdutos) {
            System.out.println("* " + p.getNome() + " - R$ " + p.getPreco());
        }

        Carrinho c = new Carrinho(listaProdutos);

        System.out.println("\nDigite o nome do produto para adicionar ao carrinho.");
        System.out.println("Digite 'remover' para retirar um produto.");
        System.out.println("Digite 'finalizar' quando terminar.\n");

        while (true) {
            System.out.print("Produto: ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("finalizar")) {
                break;
            }

            if (entrada.equalsIgnoreCase("remover")) {
                System.out.print("Digite o nome do produto que deseja remover: ");
                String nomeRemover = sc.nextLine();
                c.remover(nomeRemover);
                continue;
            }

            c.adicionarPorNome(entrada);
        }

        Venda v = new Venda(c);
        v.totalPreco();

        sc.close();
    }
}




