/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /* -------------------- //NOTE media altura 1000 personas ------------------- */

    double altura[] = new double[1000];

    double media = 0;

    for (int i = 0; i < altura.length; i++) {
      altura[i] = Math.random() * 0.5 + 1.6;
      System.out.println(String.format("%.2f", altura[i]) + " ");
      media += altura[i];
    }
    media /= altura.length;
    System.out.println("Esta es la media " + String.format("%.2f", media));
    /* -------------------------------------------------------------------------- */

    /* ----------------------------- //NOTE Matrices ---------------------------- */

    // int matriz[][] = new int[2][4]; ==> Sintaxix de una array multidimensional
      


  }
}
