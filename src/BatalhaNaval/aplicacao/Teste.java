package BatalhaNaval.aplicacao;

import BatalhaNaval.Entidades.Tabuleiro;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tentativas = 0;
        int acertos = 0;

        int[] tiro = new int[2];
        int[][] tabuleiro = new int[5][5];
        int[][] navios = new int[3][2];

        Tabuleiro tab = new Tabuleiro(tabuleiro,navios);
        tab.iniciaTabuleiro(tabuleiro);

        do {
            tab.exibeTabuleiro(tabuleiro);



            tab.darTiro(tiro);
            tentativas++;
        }while(acertos !=3);


        tab.exibeTabuleiro(tabuleiro);

        input.close();
    }
}
