package classe;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = "27";
    d1.mes = "10";
    d1.ano = "2021";

    var d2 = new Data();
    d2.dia = "13";
    d2.mes = "11";
    d2.ano = "1991";

    var d3 = d2.obterDataFormatada(d2.dia, d2.mes, d2.ano);

    System.out.println(d3);
    System.out.printf("Eu nasci no dia %s/%s/%s\n", d2.dia, d2.mes, d2.ano);
    System.out.printf("Hoje é dia %s/%s/%s", d1.dia, d1.mes, d1.ano);
  }
}
