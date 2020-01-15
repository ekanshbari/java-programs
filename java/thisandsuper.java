class Animal
{
	Animal(){
		//this("abc");
		System.out.println("non pA");
	}
	Animal(String x){

		System.out.println("pA");
	}
}

class Dog extends Animal
{
	Dog(){
		this("xyz");
		//super();
		System.out.println("non pD");
	}
	Dog(String y){
		super("abc");
		System.out.println("pD");
	}
}

class test
{
	public static void main(String[] args) {
		Dog obj=new Dog();
	}
}