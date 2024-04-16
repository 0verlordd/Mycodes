/*
moeda de:
- 1 real
grande
borda dourada e centro prateado
fina
- 50 centavos
média
prateada
grossa
- 5 centavos
pequena
cor de cobre
fina

 propriedades:
 valor
 tamanho
 cor
 grossura

 comportamentos:
 podem pagar
 podem acumular com as demais moedas
 */
import java.util.Scanner;
//import javax.swing.JOptionPane;


class Moedas {
    public String nome = "";
    public Double valor = 0.0;
    public String tamanho = "";
    public String cor = "";
    public String grossura = "";
}

public class Difmoedas {
    public static void main(String[] args) {
       
        
        Moedas moeda1 = new Moedas();
        moeda1.nome = "1 real";
        moeda1.valor = 1.00;
        moeda1.tamanho = "grande";
        moeda1.cor = "prateada e dourada";
        moeda1.grossura = "fina";

        Moedas moeda2 = new Moedas();
        moeda2.nome = "50 centavos";
        moeda2.valor = 0.50;
        moeda2.tamanho = "média";
        moeda2.cor = "prateada";
        moeda2.grossura = "grossa";

        Moedas moeda3 = new Moedas();
        moeda3.nome = "5 centavos";
        moeda3.valor = 0.05;
        moeda3.tamanho = "pequena";
        moeda3.cor = "cor de cobre";
        moeda3.grossura = "fina";


        Scanner input = new Scanner(System.in);
        int escolha = 0;
        double valorTotal = 0;

        
    do {
        System.out.println("Moedas disponíveis:");
        System.out.println("1 - 1 real");
        System.out.println("2 - 50 centavos");
        System.out.println("3 - 5 centavos");
        System.out.println("0 - finalizar deposito\n");
        System.out.print("Digite o numero correspondente a moeda que deseja inserir: ");

         escolha = input.nextInt();

        

        if (escolha == 1) { 
            System.out.println("Moeda escolhida: " + moeda1.nome);
            System.out.println("Valor: " + moeda1.valor);
            System.out.println("Tamanho: " + moeda1.tamanho);
            System.out.println("Cor: " + moeda1.cor);
            System.out.println("Grossura: " + moeda1.grossura);
            valorTotal += moeda1.valor;
            System.out.printf("Subtotal: %.2f\n", valorTotal);
            System.out.println("-----------------------------------");
            
        } else if (escolha == 2) {
            System.out.println("Moeda escolhida: " + moeda2.nome);
            System.out.println("Valor: " + moeda2.valor);
            System.out.println("Tamanho: " + moeda2.tamanho);
            System.out.println("Cor: " + moeda2.cor);
            System.out.println("Grossura: " + moeda2.grossura);
            valorTotal += moeda2.valor;
            System.out.printf("Subtotal: %.2f\n", valorTotal);
            System.out.println("-----------------------------------");
            
        } else if (escolha == 3) {
            System.out.println("Moeda escolhida: " + moeda3.nome);
            System.out.println("Valor: " + moeda3.valor);
            System.out.println("Tamanho: " + moeda3.tamanho);
            System.out.println("Cor: " + moeda3.cor);
            System.out.println("Grossura: " + moeda3.grossura);
            valorTotal += moeda3.valor;
            System.out.printf("Subtotal: %.2f\n", valorTotal);
            System.out.println("-----------------------------------");
            
        } else if (escolha == 0) {
            System.out.println("Deposito finalizado");
            System.out.printf("Valor total depositado: %.2f\n", valorTotal);
        } else {
            System.out.println("Opção inválida");
            
        }
        
    } while (escolha != 0);
    
    /*
    do {
        String escolhaStr = JOptionPane.showInputDialog("Moedas disponíveis:\n" +
                                                        "1 - 1 real\n" +
                                                        "2 - 50 centavos\n" +
                                                        "3 - 5 centavos\n" +
                                                        "0 - finalizar deposito\n\n" +
                                                        "Digite o numero correspondente a moeda que deseja inserir:" );
        escolha = Integer.parseInt(escolhaStr);
    
        if (escolha == 1) { 
            valorTotal += moeda1.valor;
            String message = "Moeda escolhida: " + moeda1.nome +
                             "\nValor: " + moeda1.valor +
                             "\nTamanho: " + moeda1.tamanho +
                             "\nCor: " + moeda1.cor +
                             "\nGrossura: " + moeda1.grossura +
                             "\nSubtotal: " + String.format("%.2f", valorTotal);
            JOptionPane.showMessageDialog(null, message);

        } else if (escolha == 2) {
            valorTotal += moeda2.valor;
            String message = "Moeda escolhida: " + moeda2.nome +
                             "\nValor: " + moeda2.valor +
                             "\nTamanho: " + moeda2.tamanho +
                             "\nCor: " + moeda2.cor +
                             "\nGrossura: " + moeda2.grossura +
                             "\nSubtotal: " + String.format("%.2f", valorTotal);
            JOptionPane.showMessageDialog(null, message);
            

        } else if (escolha == 3) {
            valorTotal += moeda3.valor;
            String message = "Moeda escolhida: " + moeda3.nome +
                             "\nValor: " + moeda3.valor +
                             "\nTamanho: " + moeda3.tamanho +
                             "\nCor: " + moeda3.cor +
                             "\nGrossura: " + moeda3.grossura +
                             "\nSubtotal: " + String.format("%.2f", valorTotal);
            JOptionPane.showMessageDialog(null, message);
            

        } else if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "Deposito finalizado\nValor total depositado: " + String.format("%.2f", valorTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    } while (escolha != 0);
    */

    input.close();


    }
}