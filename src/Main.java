import models.Carrinho;
import models.Produtos;
import models.Venda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM-VINDO À STORE GAMER!");
        System.out.println("\nESSES SÃO OS NOSSOS PRODUTOS:\n");

        ArrayList<Produtos> listaProdutos = new ArrayList<>(); //adicionar produtos nessa lista

        listaProdutos.add(new Produtos(111, "CUBO MÁGICO", "Cubo mágico profissional pra você brincar", 20, 70));
        listaProdutos.add(new Produtos(222, "FONE DE OUVIDO", "Fone de ouvido bluetooth original", 119.99, 55));
        listaProdutos.add(new Produtos(333, "CONTROLE DE VIDEO GAME", "Controle sem fio Xbox", 464.90, 123));
        listaProdutos.add(new Produtos(444, "MOUSEPAD FORTREK", "Mousepad gamer Fortrek original", 40.00, 35));
        listaProdutos.add(new Produtos(555, "HEADSET GAMER HAVIT", "Headset gamer Havit tri-mode", 355.90, 60));
        listaProdutos.add(new Produtos(666, "MOUSE REDRAGON", "Mouse gamer Redragon", 125.00, 66));


        for (Produtos p : listaProdutos) { //para a lista de produtos, mostre print nome e preço
            System.out.println("* " + p.getNome() + " - R$ " +p.getPreco());
        }

        Carrinho c = new Carrinho(listaProdutos); //cria o objeto carrinho e coloca a lista de produtos nele

        System.out.println("\nDigite o nome do produto para adicionar ao carrinho.");
        System.out.println("Digite 'finalizar' quando terminar.\n");

        while (true) { //é so o loop que pede pro usuário digitar os carrinhos ou pergunta se ele quer finalizar a compra
            System.out.print("Produto: ");
            String nomeDigitado = sc.nextLine();

            if (nomeDigitado.equalsIgnoreCase("finalizar")) {
                break;
            }


            c.adicionarPorNome(nomeDigitado); //agr ele manda pro carrinho pra continuar
        }

        Venda v = new Venda(c);
        v.totalPreco();

        sc.close();
    }
}




