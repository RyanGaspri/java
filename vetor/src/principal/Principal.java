/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       int x = 0;
       int total = 1;
      
       int[] soma = new int[10];
      
       for(x = 0; x < 5; x++){
           String y = JOptionPane.showInputDialog(null,"Digite um numero" +(x+1));
           soma[x] = Integer.parseInt(y);
           total = total + soma[x];
       }
       JOptionPane.showMessageDialog(null,total);
    }
    
}
