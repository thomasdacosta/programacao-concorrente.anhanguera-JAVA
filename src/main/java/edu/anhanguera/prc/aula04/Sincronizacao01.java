package edu.anhanguera.prc.aula04;

public class Sincronizacao01 extends Thread {
	
	public static int contador = 0;
	
	public void run() {
		for (int i=1;i<=10;i++)
			incrementarContador();
	}
	
	public void incrementarContador() {
		contador++;
		System.out.println(this.getName() + " - " + contador);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sincronizacao01 sinc1 = new Sincronizacao01();
		
		Thread thread1 = new Thread(sinc1);
		thread1.start();
		
		Thread thread2 = new Thread(sinc1);
		thread2.start();
	}

}
