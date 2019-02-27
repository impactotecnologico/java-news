package hilosSync;

public class Main extends Thread{
	static String[] msg = {"Estoy", "siendo", "procesado", "por", "el", "hilo"};
	
	public Main(String id) {
		super(id);
	}
	
	public static void main(String[] args) {
		Main thread1 = new Main("hilo 1");
		Main thread2 = new Main("hilo 2");
		
		thread1.start();
		thread2.start();
		
		boolean t1Alive = true;
		boolean t2Alive = true;
		
		do {
			if(t1Alive && !thread1.isAlive()) {
				t1Alive = false;
				System.out.println("El primer hilo ha muerto");
			}
			if(t2Alive && !thread2.isAlive()) {
				t2Alive = false;
				System.out.println("El segundo hilo ha muerto");
			}
		}while (t1Alive || t2Alive);
	}
	
	void randomWait() {
		try {
			Thread.currentThread().sleep((long) (3000 * Math.random()));
		}catch(InterruptedException ex) {
			System.out.println(ex);
		}
	}
	
	@Override
	public synchronized void run() {
		SynchronizedOutput.displayList(getName(), msg);
	}
}
	
	class SynchronizedOutput {
		public static synchronized void displayList(String name, String list[]) {
			System.out.println(list.length);
			for(int i = 0;i<list.length;i++) {
				Main t = (Main) Thread.currentThread();
				t.randomWait();
				
				if(i==(list.length-1)) {
					System.out.println(list[i]+ " "+name);
				}else {
					System.out.println(list[i]);
				}
			}
		}
	}
