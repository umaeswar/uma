package com.example.springproject;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringprojectApplication.class, args);
      
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		D obj4=new D(obj3);
		obj4.runner();
	}	
}
class A
{
	void right()
	{
		System.out.println("right");
	}
	void left()
	{
		System.out.println("left");
	}
	void down()
	{
		System.out.println("on");
	}
	void up()
	{
		System.out.println("up");
	}
	
}
class B
{
	void right()
	{
		System.out.println("right");
	}
	void left()
	{
		System.out.println("left");
	}
	void down()
	{
		System.out.println("on");
	}
	void up()
	{
		System.out.println("up");
	}
	
}
class C
{
	void right()
	{
		System.out.println("right");
	}
	void left()
	{
		System.out.println("left");
	}
	void down()
	{
		System.out.println("on");
	}
	void up()
	{
		System.out.println("up");
	}
	
}
class D
{
	private C obj;
	
	public D(C a)
	{
		this.obj= a;
	}
	void runner()
	{
		obj.left();
		obj.right();
		obj.up();
		obj.down();
		
				
	}
	
}






