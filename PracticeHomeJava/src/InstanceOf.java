import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import com.home.*;

class ClassASamePackage {
	
	int a=6;
	{
		System.out.println("non-static block of A");
	}
	static{
		System.out.println("static block of A");
	}
	 protected void protectedFun(){
		System.out.println("A fun "+ a);
	}
	 void defaultFun() {
		 System.out.println("A default fun:" + a);
	 }
	public ClassASamePackage(){
		System.out.println("A default constructor");
	}
}

class ClassB extends ClassA{
	int a=8;
	{
		System.out.println("non-static block of ClassB");
	}
	static{
		System.out.println("static block of ClassB");
	}
	
	//this is not overriding base method
	protected void protectedFun(){
		System.out.println("B fun "+ a);
		super.protectedFun();
		//super.fun();
	}
	public ClassB(){
		System.out.println("ClassB default constructor");
	}
	public ClassB(int a){
		System.out.println("ClassB parameterized constructor");
	}
}

class ClassC extends ClassASamePackage {
	int a = 10;
	{ 
		System.out.println("non-static block of ClassC");
	}
	static{
		System.out.println("static block of ClassC");
	}
	protected void protectedFun(){
		System.out.println("Class fun "+ a);
	}
	 void defaultFun() {
		 System.out.println("Class default fun:" + a);
	 }
	 public ClassC(){
			System.out.println("ClassC default constructor");
		}
}
public class InstanceOf {
	
	private InstanceOf(){
		System.out.println("creating instanceOf object");
	}
	public static void main(String[] args) {
		InstanceOf ob = new InstanceOf();
		ClassB bObj = new ClassB(3);
		System.out.println(bObj.a);
		bObj.protectedFun();
		
		ClassA aObjB = new ClassB();
		System.out.println("----::" + aObjB.getClass() + " " + (aObjB instanceof ClassB) + " " + 
				(aObjB instanceof ClassA));
		
		
		ClassASamePackage aObjC = new ClassC();
		aObjC.protectedFun();
		
		
		String old  = "my name is ankush";
		old.replaceAll("ankush", "shivam");
		System.out.println(old);
		
		synchronized (args) {
			System.out.println("before wait");
			try{
				args.wait();
				System.out.println("after wait");
			}catch(Exception e)
			{}
			
			
		}
		
//		if(bObj instanceof ClassB)
//			System.out.println("object of B");
//		if(bObj instanceof ClassA)
//			System.out.println("object of A");
//		if(bObj instanceof Object)
//			System.out.println("object of object class");
//		System.out.println(fun());
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("ankush");
		tset.add("ankush");
		System.out.println(tset);
		 map.put(3, "ankush");
	        map.put(3,"shivam");
	        System.out.println(map);
		
		 Collection<String> list = new ArrayList<String>();
	        list.add("Android");
	        list.add("iPhone");
	        list.add("Windows Mobile");
	       
	             
	        Iterator<String> itr = list.iterator();
	        while(itr.hasNext()){
	            String lang = itr.next();
	            list.remove(lang);		//will throw concurrent modification exception
	        }
	        
	        System.out.println("gap bet two for each");
	        
	        for(String language: list){
	            list.remove(language);		//it will also throw concurrent modification exception
	        }
	       

		
		
	}
	@SuppressWarnings("finally")
	static int fun(){
		try{
			return 9;
		}catch(Exception e){}
		finally
		{
			return 8;
			}
	}
}
