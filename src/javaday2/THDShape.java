package javaday2;

public abstract class THDShape implements Shape {

	

}
class Cube extends THDShape {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public void getArea() {
		Long s=(long) (6*a*a);
		System.out.println("Area "+s);
	}
	public void getVolumn() {
		Long v=(long) (a*a*a);
		System.out.println("Volumn"+v);
	}
	
}
class Shpere extends THDShape {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	public void getArea() {
		Double s=(Double) (4*Math.PI*a*a);
		System.out.println("Area "+s);
	}
	public void getVolumn() {
		Double v= (Double)(4/3*Math.PI*a*a*a);
		System.out.println("Volumn"+v);
	}
	
}
class Tetrahedron extends THDShape{
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void getVolumn() {
		// TODO Auto-generated method stub
		
	}
	
}