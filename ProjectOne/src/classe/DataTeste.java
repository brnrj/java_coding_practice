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

    var d4 = new Data();
    var d5 = new Data("27","11","2021");

    System.out.println(d3);
    System.out.printf("Eu nasci no dia %s/%s/%s\n", d2.dia, d2.mes, d2.ano);
    System.out.printf("Hoje é dia %s/%s/%s\n", d1.dia, d1.mes, d1.ano);
    System.out.println(d4.obterDataFormatada(d4.dia, d4.mes, d4.ano));
    System.out.println(d5.obterDataFormatada(d5.dia, d5.mes, d5.ano));
  }
}
