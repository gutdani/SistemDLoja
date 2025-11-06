import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO À STORE GAMER!");

        System.out.println("ESSES SÃO OS NOSSOS PRODUTOS: ");


        Produtos produto1 = new Produtos(111, "CUBO MÁGICO ", "cubo mágico profissional pra vc brincar" , 20, 70);
        Produtos produto2 = new Produtos(222, "FONE DDE OUVIDO ", "fone de ouvido bluetooth original", 119.99, 55);
        Produtos produto3 = new Produtos(333, "CONTROLE DE VIDEO GAME ", "controle sem fio xbox", 464.90, 123);
        Produtos produto4 = new Produtos(444, "MOUSEPAD FORTREK  ", "mousepad gamer fortrek original", 40.00, 35);
        Produtos produto5 = new Produtos(555, "HEADSET GAMER HAVIT ", "headset gamer havit tri-mode", 355.90, 60);
        Produtos produto6 = new Produtos(666, "MOUSE REDRAGON ", "mouse gamer redragon", 125.00, 66);

        System.out.println("* " + produto1.getNome() + "\n" + "* " + produto2.getNome() + "\n" +"* " + produto3.getNome() + "\n"+ "* " + produto4.getNome() + "\n" + "* " + produto5.getNome() + "\n" + "* " + produto6.getNome());


        Carrinho c = new Carrinho();
        System.out.println("\n" + "ESCOLHA OS ITENS QUE QUER ADICIONAR NO CARRINHO: ");
        String produtos = sc.nextLine();

//        c.adicionar(produto2);
//        c.adicionar(produto6);
//        c.remover(produto2.getNome());

        Venda v = new Venda(c);
        v.totalPreco();



    }
}
