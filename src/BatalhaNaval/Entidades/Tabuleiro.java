package BatalhaNaval.Entidades;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
    private int[][] tabuleiro;
    private int[][] navios;

    Random gerador = new Random();
    Scanner input = new Scanner(System.in);

    public Tabuleiro() {

    }
    public Tabuleiro(int[][] tabuleiro, int[][]navios){
        this.tabuleiro = tabuleiro;
        this.navios = navios;
    }
    public void iniciaTabuleiro(int[][] tabuleiro){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = -1;
            }
        }
    }

    public void exibeTabuleiro(int[][] tabuleiro){
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        for (int i = 0; i < tabuleiro.length ; i++) {
            System.out.print((i+1)+"");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j] == -1){
                    System.out.print("\t"+"~");
                }
                else if(tabuleiro[i][j] == 0){
                    System.out.print("\t"+"*");
                }
                else if(tabuleiro[i][j] == 1){
                    System.out.print("\t"+"X");
                }
            }

            System.out.println();
        }
    }

    public void iniciaNavios(int[][] navios,int[][] tabuleiro){

        for (int i = 0;  i < navios.length;  i++) {
            navios[i][0] = gerador.nextInt(5);
            navios[i][1] = gerador.nextInt(5);
            for (int j = 0; j < i; j++) {
                if((navios[i][0] == navios[j][0])&& navios[i][1] == navios[j][1]){
                    do {
                        navios[i][0] = gerador.nextInt(5);
                        navios[i][1] = gerador.nextInt(5);
                    }while(navios[i][0] == navios[j][0] && navios[i][1] == navios[j][1]);
                }
            }
        }
    }

    public void darTiro(int[] tiro){

        System.out.print("digite o valor da linha que deseja tentar(1-5): ");
        tiro[0]= input.nextInt();
        tiro[0]--;

        System.out.print("digite o valor da coluna que deseja tentar(1-5): ");
        tiro[1]= input.nextInt();
        tiro[1]--;

    }

    public void acertou(int tiro, int[][]navios){

    }
}
