package oo.composicao;

public class CompraTeste {
  public static void main(String[] args) {
    Compra c1 = new Compra();

    c1.cliente = "Clooney";

    c1.adicionarItem(new Item("Caneta", 20, 7.45));
    c1.adicionarItem(new Item("Borracha", 10, 3.45));
    c1.adicionarItem(new Item("Lápis", 30, 1.45));

    System.out.println(c1.itens.size());
    System.out.println(c1.getTotal());

    //Só para mostrar a relação bidirecional
    double total = c1.itens.get(0).compra.itens.get(1).compra.getTotal();
    System.out.println("O Total é: " + total);
  }
}
