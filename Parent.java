class Parent1{
	void print(){
		System.out.println("This is printend in parent1");
		
	}
}

class Parent extends Parent1
{	
	void print(){
		System.out.println(this.getClass());
		System.out.println(this.hashCode());
		System.out.println(super.getClass());
	
	}
	
	public static void main(String args[]){
		Parent p = new Parent();
		p.print();
	}

}