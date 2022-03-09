package controller;

import java.security.SecureRandom;

public class ThreadMtz extends Thread {
	
	public int matriz;
	public int threadmtz;
	private int linha = 3;
	private int coluna = 5;
	private int[][] mtz = new int[linha][coluna];
	private int S1 = 0;
	private int S2 = 0;
	private int S3 = 0;
	
	public int matriz() {
	for (int L = 0; L < linha; L++) {
		for (int C = 0; C < coluna; C++) {
			 mtz[L][C] = new SecureRandom().nextInt(9);
			 System.out.printf("%d 	", mtz[L][C]);	 			 
		}
	System.out.printf("%n");	
	}
	return matriz;
	}
	
	public ThreadMtz(int threadmtz) {
		this.threadmtz = threadmtz;
	}
	
    @Override
    public void run() {
    	matriz = matriz();
    	for (int C = 0; C < coluna; C++) {
        S1 = S1 + mtz[0][C];
        S2 = S2 + mtz[1][C];
        S3 = S3 + mtz[2][C];
    	}
    		
    System.out.println("Soma das colunas da 1ª linha: " + S1);
    System.out.println("Soma das colunas da 2ª linha: " + S2);
    System.out.println("Soma das colunas da 3ª linha: " + S3);
    	}    
    	}
    	
    

	
