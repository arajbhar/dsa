package handson;

class Whiteboard {
	String text;
	int studentCount = 0;
	int count = 0;

	synchronized public void write(String s) {

		if (count != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		this.text = s;
		count = studentCount;
		notifyAll();

		System.out.println(s);
	}

	synchronized public String read() {
		String txt;

		if (count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

		txt = this.text;
		count--;
		if (count == 0) {
			notify();
		}
		return txt;
	}

	public void attendance() {
		studentCount++;
	}
}

class Teacher extends Thread {

	Whiteboard wb;

	String notes[] = { "Java is language", "It is oops", "It is platform independent", "end" };

	public Teacher(Whiteboard wb) {
		this.wb = wb;
	}

	public void run() {
		System.out.println("Teaching is writing ");
		for (int i = 0; i < notes.length; i++) {
			wb.write(notes[i]);
		}
	}
}

class Student extends Thread {
	Whiteboard wb;
	String name;
	String text;

	public Student(String name, Whiteboard wb) {
		this.name = name;
		this.wb = wb;
		this.wb.attendance();
	}

	public void run() {
		do {
			text = wb.read();
			System.out.println(name + " Reading " + text);
			System.out.flush();
		} while (!text.equals("end"));
	}
}

public class WhiteBoardThreadCommunication {

	public static void main(String[] args) {
		Whiteboard wb = new Whiteboard();

		Teacher t = new Teacher(wb);

		Student s1 = new Student("1. Amit", wb);
		Student s2 = new Student("2. Ajay", wb);
		Student s3 = new Student("3. Sanjay", wb);
		Student s4 = new Student("4. Kapil", wb);

		t.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
