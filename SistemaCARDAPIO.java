/*
 * Desenvolvido por : Tiago Ribeiro Santos
email : tiago.programador@hotmail.com

Sistema de Lanchonete 

github : www.github.com/tiglinux
 */
package Lista_Exercicios6;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {
        boolean logico = true;
        int codigo = 0;
        int qtdCq = 0;
        int BauSim = 0;
        int BauOvo = 0;
        int hamburguer = 0;
        int qtd_suco = 0;
        int qtd_refri = 0;
        double total = 0;

        try {
            while (logico) {

                codigo = Integer.parseInt(JOptionPane.showInputDialog("" + "CARDÁPIO LANCHONETE:" + "\nESCOLHA O CÒDIGO DO SEU PEDIDO:" + "\n\nEspecificação:          Código:            Preço:"
                        + "\nCachorro Quente     100                   R$1.20" + "\nBauru Simples          101                   R$1.30"
                        + "\nBauru com Ovo         102                   R$1.50" + "\nHambúrguer             103                   R$1.20" + "\nSuco                          104                   R$1.30"
                        + "\nRefrigerante            105                   R$1.00" + "\n\n Digite 0 para Fechar Pedido",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (codigo) {
                    case 100:
                        qtdCq = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Cachorro Quente:"));
                        break;
                    case 101:
                        BauSim = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Bauru Simples:"));
                        break;
                    case 102:
                        BauOvo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Bauru com OVO:"));
                        break;
                    case 103:
                        hamburguer = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Hambúrguer:"));
                        break;
                    case 104:
                        qtd_suco = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Suco:"));
                        break;
                    case 105:
                        qtd_refri = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Refrigerante:"));
                        break;
                    case 0:
                        total = ((qtdCq * 1.2) + (BauSim * 1.3) + (BauOvo * 1.5) + (hamburguer * 1.2) + (qtd_suco * 1.3) + (qtd_refri * 1));
                        JOptionPane.showMessageDialog(null, "O total da Conta é de : R$" + total);
                        logico = false;
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no Programa!FIM do Programa!" + erro.toString(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
}
