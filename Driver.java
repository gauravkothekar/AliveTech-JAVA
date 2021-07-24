class Parent{
	int a,b,c;
Parent(int a){
	this();
	System.out.println("Inside Parent with ARGS");
}
Parent(){
	System.out.println("Inside Parent no ARGS");
}
	void f1(){
		System.out.println("Inside f1");
	}
}
class Child extends Parent{
	
Child(int a){
	super(a);
	System.out.println("Inside Child with ARGS");
}
Child(){
	this(4);
	System.out.println("Inside Child No ARGS");
}	
	void f2(){
		System.out.println("Inside f2");
	}
	
}
class Driver{
	public static void main(String args[]){	
		Child c = new Child();		
	}
}
