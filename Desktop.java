package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("18 inches");
	}
	public static void main(String[] args) {
		Desktop electronics=new Desktop();
		electronics.computerModel();
		electronics.desktopSize();
	}

}
