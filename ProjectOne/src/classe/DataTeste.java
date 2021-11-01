package classe;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = 27;
    d1.mes = 10;
    d1.ano = 2021;

    var d2 = new Data();
    d2.dia = 13;
    d2.mes = 11;
    d2.ano = 1991;

    var d3 = d2.obterDataFormatada();
    var d4 = d1.obterDataFormatada();

    System.out.println(d3);
    System.out.printf("Eu nasci no dia %s\n", d3);
    System.out.printf("Hoje é dia %s\n", d4);
    
  }
}
