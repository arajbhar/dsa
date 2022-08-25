package handson;

class Myth implements Runnable {

	public void run() {
		int i = 0;

		while (true) {
			System.out.println(i + " Hello");
			i++;
		}

	}

}

public class RunnablePractice {

	public static void main(String[] args) {
		Myth t = new Myth();
		Thread th = new Thread(t);
		
		th.start();

		int j = 0;

		while (true) {
			System.out.println(j + " World");
			j++;
		}
	}
}
