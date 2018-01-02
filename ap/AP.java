/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

/**
 *
 * @author leolu
 */
public class AP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={1,2,3};
        System.out.println("Scores increasing "+Codingbat.scoresIncreasing(a));
        int[] b={100,100,100};
        System.out.println("100 scores "+Codingbat.scores100(b));
        int[] c={3,5,6};
        System.out.println("scores clump "+Codingbat.scoresClump(c));
    }
    
}
