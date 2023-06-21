package Ex1_Carros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Escolha uma marcas de carro:\n ----- Renault / Fiat / Hyunday -----");
    String escolherMarcaCarro = entrada.next();

     informacoesMarca(escolherMarcaCarro);

  }

  private static void informacoesMarca(String escolherMarcaCarro){
       if(escolherMarcaCarro.equalsIgnoreCase("Renault")){

          Renalt marcaRenault = new Renalt("Renault", 2021, 54.000, "Cinza", 4, 0);
          marcaRenault.detalhesCarro();
          marcaRenault.iniciarMotor();
          marcaRenault.acelerar();
          marcaRenault.freiar();
      } else if (escolherMarcaCarro.equalsIgnoreCase("Fiat")){
          Fiat marcaFiat = new Fiat("Fiat", 2012, 22.000, "Vermelho", 2, 0);
          marcaFiat.detalhesCarro();
          marcaFiat.iniciarMotor();
          marcaFiat.acelerar();
          marcaFiat.freiar();
      } else if(escolherMarcaCarro.equalsIgnoreCase("Hyundai")){
          Hyundai marcaHyundai = new Hyundai("Hyundai", 2023, 134.740, "Branco", 4, 0);
          marcaHyundai.detalhesCarro();
          marcaHyundai.iniciarMotor();
          marcaHyundai.acelerar();
          marcaHyundai.freiar();
      } else {
          System.out.println("Opção inválida!");
      }
  }

}

