package oo.composicao.desafio;

public class Sistema {
  public static void main(String[] args) {

    Compra compra1 = new Compra();
    compra1.adicionarItem("Caneta", 1.5, 5);
    compra1.adicionarItem(new Produto("Notebook", 2000), 5);

    Compra compra2 = new Compra();
    compra2.adicionarItem("Caderno", 10, 7);
    compra2.adicionarItem(new Produto("TV", 3000), 2);

    Cliente cliente = new Cliente("Bruno Martins");
    cliente.adicionarCompra(compra1);
    cliente.compras.add(compra2);
    
    System.out.println(cliente.obterValorTotal());

  }
}
