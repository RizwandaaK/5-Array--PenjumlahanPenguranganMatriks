/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.array.penjumlahanpenguranganmatriks;

import java.util.Scanner;

/**
 *
 * @author rizwa
 */
public class CodinganAingMacan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i, j, m, n;
    int matriksA[][] = new int[10][10];
    int matriksB[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Jumlah Baris: ");
    m = scan.nextInt();
    System.out.print("jumlah Kolom: ");
    n = scan.nextInt();
    System.out.println("Elemen Matriks A: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriksA[i][j] = scan.nextInt();
      }
    }
    System.out.println("Elemen Matriks B: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriksB[i][j] = scan.nextInt();
      }
    }
    System.out.println("Hasil A+B: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriksA[i][j] + matriksB[i][j];
        System.out.print(hasil[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
