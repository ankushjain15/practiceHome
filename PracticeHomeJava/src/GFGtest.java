class Test1 {
	Test1(int x) {
		System.out.println("Constructor called " + x);
	}
}

// This class contains an instance of Test1
class GFGtest {
	Test1 t1 = new Test1(10);

	GFGtest(int i) {
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		GFGtest t2 = new GFGtest(5);
	}
}
