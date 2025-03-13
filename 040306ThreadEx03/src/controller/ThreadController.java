package controller;

public class ThreadController extends Thread{
	private int[] vetor;
	private int n;
	
	public ThreadController(int[] vet, int n) {
		super();
		this.vetor = vet;
		this.n = n;
	}
	
	@Override
	public void run() {		
		if(this.n % 2 == 0) {
			double inicio = System.nanoTime();
			for(int i = 0; i < this.vetor.length; i++) {
				
			}
			
			double fim = System.nanoTime();
			double total = fim - inicio;
			total = total / Math.pow(10, 9);
	        System.out.printf("Tempo For ==> %.6fs%n", total, "s");
		}
		else {
			double inicio = System.nanoTime();
			
			for(int n : this.vetor) {
				
			}
			
			double fim = System.nanoTime();
			double total = fim - inicio;
			total = total / Math.pow(10, 9);
	        System.out.printf("Tempo Foreach ==> %.6fs%n", total, "s");
		}
		
	}
}