public class Main{
    public static void main(String []args) {
        System.out.println("BEM VINDO À STORE GAMER!");

        Produtos produto1 = new Produtos(111, "cubo mágico ", "cubo mágico profissional pra vc brincar" , 20, 70);
        Produtos produto2 = new Produtos(222, "fone de ouvido ", "fone de ouvido bluetooth original", 119.99, 55);
        Produtos produto3 = new Produtos(333, "controle de video game ", "controle sem fio xbox", 464.90, 123);
        Produtos produto4 = new Produtos(444, "mousepad fortrek ", "mousepad gamer fortrek original", 40.00, 35);
        Produtos produto5 = new Produtos(555, "headset gamer havit ", "headset gamer havit tri-mode", 355.90, 60);
        Produtos produto6 = new Produtos(666, "mouse redragon ", "mouse gamer redragon", 125.00, 66);

        Carrinho c = new Carrinho();
        c.adicionar(produto2);
        c.adicionar(produto6);
        c.remover(produto2.getNome());

        Venda v = new Venda(c);
        v.totalPreco();







    }
}
