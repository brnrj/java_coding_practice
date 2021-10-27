package classe;

public class Data {
  String dia;
  String mes;
  String ano;

  Data(String d, String m, String a) {
    dia = d;
    mes = m;
    ano = a;
  }

  Data() {
    dia = "01";
    mes = "01";
    ano = "1970";
  }

  String obterDataFormatada(String a, String b, String c) {
    return String.format("Meu aniversário é dia %s/%s/%s", a, b, c);
  }
}
