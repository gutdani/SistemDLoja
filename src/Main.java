import models.Carrinho;
import models.ListaDeDesejos;
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

        // declaracao da lista a ser usada a seguir
        ArrayList<Produtos> listaDeDesejos = new ArrayList<>();

        listaProdutos.add(new Produtos(111, "CUBO MÁGICO", "Cubo mágico profissional pra você brincar", 20, 70));
        listaProdutos.add(new Produtos(222, "FONE DE OUVIDO", "Fone de ouvido bluetooth original", 119.99, 55));
        listaProdutos.add(new Produtos(333, "CONTROLE DE VIDEO GAME", "Controle sem fio Xbox", 464.90, 123));
        listaProdutos.add(new Produtos(444, "MOUSEPAD FORTREK", "Mousepad gamer Fortrek original", 40.00, 35));
        listaProdutos.add(new Produtos(555, "HEADSET GAMER HAVIT", "Headset gamer Havit tri-mode", 355.90, 60));
        listaProdutos.add(new Produtos(666, "MOUSE REDRAGON", "Mouse gamer Redragon", 125.00, 66));

        listaDeDesejos.add(new Produtos(111, "CUBO MÁGICO", "Cubo mágico profissional pra você brincar", 20, 70));
        listaDeDesejos.add(new Produtos(222, "FONE DE OUVIDO", "Fone de ouvido bluetooth original", 119.99, 55));
        listaDeDesejos.add(new Produtos(333, "CONTROLE DE VIDEO GAME", "Controle sem fio Xbox", 464.90, 123));
        listaDeDesejos.add(new Produtos(444, "MOUSEPAD FORTREK", "Mousepad gamer Fortrek original", 40.00, 35));
        listaDeDesejos.add(new Produtos(555, "HEADSET GAMER HAVIT", "Headset gamer Havit tri-mode", 355.90, 60));
        listaDeDesejos.add(new Produtos(666, "MOUSE REDRAGON", "Mouse gamer Redragon", 125.00, 66));

        for (Produtos p : listaProdutos) {
            System.out.println("* " + p.getNome() + " - R$ " + p.getPreco());
        }

        Carrinho c = new Carrinho(listaProdutos);

        // objeto a manipular e usar listaDeDesejos
        ListaDeDesejos ld = new ListaDeDesejos(listaDeDesejos);

        while (true) {
            System.out.println("\nDigite o nome do produto para adicionar ao carrinho.");
            System.out.println("Digite 'remover' para retirar um produto.");
            System.out.println("Digite 'desejos' para adicionar um produto a lista de desejos.\n");
            System.out.println("Digite 'finalizar' quando terminar.\n");
            String modo = "Carrinho - ";
            System.out.print(modo + "Produto: ");
            String entrada = sc.nextLine();


            if (entrada.equalsIgnoreCase("finalizar")) {
                break;
            }

            if (entrada.equalsIgnoreCase("remover")) {
                modo = "Remover - ";
                System.out.print("Digite o nome do produto que deseja remover: \n");
                System.out.print(modo + "Produto: ");
                String nomeRemover = sc.nextLine();
                c.remover(nomeRemover);
                continue;
            }

            if (entrada.equalsIgnoreCase("desejos")) {
                modo = "Desejos - ";
                System.out.print("Digite os produtos que deseja adicionar na lista de desejos:\n");
                System.out.print(modo + "Produto: ");
                String nomeDesejo = sc.nextLine();
                ld.adicionarPorNome(nomeDesejo);
                continue;
            }

            c.adicionarPorNome(entrada);
        }

        Venda v = new Venda(c);
        v.totalPreco();

        sc.close();
    }
}




