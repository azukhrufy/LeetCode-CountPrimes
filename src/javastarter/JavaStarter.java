/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastarter;

/**
 *
 * @author zukhruf
 */
public class JavaStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n = 20;

    boolean[] isPrime = new boolean[n];
   for (int i = 2; i < n; i++) {
      isPrime[i] = true;
   }
   // Loop's ending condition is i * i < n instead of i < sqrt(n)
   // to avoid repeatedly calling an expensive function sqrt().
   for (int i = 2; i * i < n; i++) {
//       System.out.println("i = " +i);
      if (!isPrime[i]) continue;
      for (int j = i * i; j < n; j += i) {
//           System.out.println("j = " +j);
         isPrime[j] = false;
      }
   }
   int count = 0;
   for (int i = 2; i < n; i++) {
      if (isPrime[i]) count++;
   }
        System.out.println(count);
        
    }
}