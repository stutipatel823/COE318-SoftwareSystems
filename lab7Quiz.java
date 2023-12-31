/*Q1.Since variable m is a“private”variable of class x, it will not be visible from class Y
because variable‘m’ is not a part of class Y.
Use getter and setter methods to get access to the private variable.*/

class X {
	private int m = 48;

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
}

class Y extends X {
	void methodOfY() {
		System.out.println(getM());
	}
}

// Q2.Output:51 250 500
