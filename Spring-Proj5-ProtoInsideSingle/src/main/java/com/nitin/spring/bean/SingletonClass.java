package com.nitin.spring.bean;

public abstract class SingletonClass {

	protected abstract PrototypeClass createPrototype();
	
	public void doSomething() {
		createPrototype().doSomething();
	}
	
	public void doSomethngElse() {
		createPrototype().doSomethingElse();
	}
}
