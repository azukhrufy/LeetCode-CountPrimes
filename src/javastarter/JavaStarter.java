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
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i < n; i++){
            if (!isPrime[i]) continue;
            for(int j = i * i; j <n; j = j+i){
                isPrime[j] = false;
            }
        }
        int counter = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]) counter++;
        }
        System.out.println("Prime Number Count = " + counter);
    }
  }