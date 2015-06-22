import java.util.TreeSet;


public class ComparableDemo implements Comparable<Integer> {

	private String name;
	
	public ComparableDemo() {}
	
	public ComparableDemo(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		TreeSet<ComparableDemo> set = new TreeSet<ComparableDemo>();
		set.add(new ComparableDemo("ankush")); //class cast exception (ComparableDemo cannot be cast to Integer)
		set.add(new ComparableDemo("jain"));
		
		System.out.println(set);
	}

	
}
