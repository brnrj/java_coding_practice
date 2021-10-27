package classe;

public class Data {
  String dia;
  String mes;
  String ano;

  String obterDataFormatada(String a, String b, String c) {
    return String.format("Meu aniversário é dia %s/%s/%s", a, b, c);
  }
}
