import java.math.BigInteger;


class ankush{
	
	public void func(int a)
	{
		System.out.println("Integer");
	}
	public void func(String a)
	{
		System.out.println("String");
	}
	public void func(Object a)
	{
		System.out.println("Object");
	}
	
}

class A{
	public void print(A obj)
	{System.out.println("A");}
}

class B extends A{
	public void print()
	{System.out.println("B");}
}
class C extends B{
	public void print(A obj)
	{System.out.println("C");}
}
class D extends C{
	public void print()
	{System.out.println("D");}
}
public class Test {
	public static void main(String[] args) {
		ankush obj = new ankush();
		obj.func(null);
		B o = new D();
		o.print(o);
		o.print();
		
		BigInteger b = new BigInteger("89798274987");
		System.out.println(b.toString(11));
	}
}
