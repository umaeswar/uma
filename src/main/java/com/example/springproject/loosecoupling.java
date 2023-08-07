package com.example.springproject;

interface loosecoupling {
	void left(int a);
	void right(int b);
	void up(int c);
	void down(int d);
}

class ABC implements loosecoupling
{
	@override

	public void left(int a)
	{
    System.out.println("left");
}
	@override
	public void right(int b)
	{
    System.out.println("left");
}
	@override
	public void up(int c)
	{
    System.out.println("left");
}
	@override
	public void down(int d)
	{
    System.out.println("left");
}
}
