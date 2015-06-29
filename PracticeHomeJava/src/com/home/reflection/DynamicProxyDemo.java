package com.home.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

	public static void main(String[] args) {
		InvocationHandler invHnd = new MyInvocationHandler();
		YourProxyInterface proxyInstance = (YourProxyInterface)Proxy.newProxyInstance(YourProxyInterface.class.getClassLoader(),
				new Class[]{MyProxyInterface.class, YourProxyInterface.class}, invHnd);
		proxyInstance.mummyMethod();
	}
}

interface MyProxyInterface {
	public void dummyMethod();
}

interface YourProxyInterface {
	public void mummyMethod();
}

class MyInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("i am here " + proxy.getClass().getName() + " " + method.getName());
		// TODO Auto-generated method stub
		return null;
	}
	
}