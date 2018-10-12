package javaday2;

public class Charsequence implements CharSequence {
    private String tem;
    
	public Charsequence(String tem) {
		super();
		this.tem = tem;
	}

	public String getTem() {
		return tem;
	}

	public void setTem(String tem) {
		this.tem = tem;
	}

	@Override
	public char charAt(int arg0) {
		if(arg0<0||arg0>tem.length()) {
			throw new StringIndexOutOfBoundsException(arg0);
		}
		return tem.charAt(arg0);
	}

	@Override
	public int length() {
		
		return tem.length();
	}

	@Override
	public CharSequence subSequence(int arg0, int arg1) {
 
		 if (arg0 < 0) {
	            throw new StringIndexOutOfBoundsException(arg0);
	        }
	        if (arg1 > tem.length()) {
	            throw new StringIndexOutOfBoundsException(arg1);
	        }
	        if (arg0 > arg1) {
	            throw new StringIndexOutOfBoundsException(arg0 - arg1);
	        }
	        StringBuilder sub = 
	            new StringBuilder(tem.subSequence(arg0,arg1));
	        return sub.reverse();
	}
	public String toSring() {
		StringBuilder s=new StringBuilder(this.tem);
		return s.reverse().toString();
	}
	public static void main(String[] args) {
		Charsequence ch= new Charsequence("THU THAO");
		System.out.println(ch.subSequence(1, 4));
		
	}

}
