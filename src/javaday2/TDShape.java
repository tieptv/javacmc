package javaday2;

public abstract class TDShape implements Shape {

}
class Circle extends TDShape {
private int r;

public int getR() {
	return r;
}

public void setR(int r) {
	this.r = r;
}
@Override
public
	void getArea() {
		Double s=Math.PI*r*r;
		System.out.println("Area "+ s);
	}

@Override
public void getVolumn() {
	// TODO Auto-generated method stub
	
}
}
class Square extends TDShape{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	 @Override
	public
	void getArea() {
		Long s=(long) (a*a);
		System.out.println("Area "+ s);
	}

	@Override
	public void getVolumn() {
		// TODO Auto-generated method stub
		
	}
	
}
class Triangle extends TDShape{
	private int a,b,c;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	 @Override
	public
	void getArea() {
		int p=(a+b+c)/2;
		Double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Area "+ s);
	}

	@Override
	public void getVolumn() {
		// TODO Auto-generated method stub
		
	}
	
}
