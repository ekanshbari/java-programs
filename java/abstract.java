
// abstract class car{
// 	public abstract void fType();
// }

// class test{
// 	public static void main(String[] args) {
		
// 	}
// }

// //why to use abstract class all the child should implement this 
// kind of a rule that every child should follow

// in concrete it is optonal 

// abstract class have abstract method that need to be overridden in 
// child class it can also have normal methods


//  class car{
// 	 void fType();
// }

// class test{
// 	public static void main(String[] args) {
		
// 	}
// }

// the above code will say to declasce the body of method declare 
// it abstract after thT it says to make class also abstract

// if method is abstract then no body
abstract class car{
	public void fType(){
		System.out.println("Disel");
	}
}
class honda extends car{

}

class test{
	public static void main(String[] args) {
		honda h=new honda();
		h.fType();
	}
}

==============================================
abstract class car{
	public abstract void fType();
}
class honda extends car{
	void fType(){
		System.out.println("cng");
	}

}

class test{
	public static void main(String[] args) {
		honda h=new honda();
		h.fType();
	}
}


//abstract class cant be instantiated but refrence can be made

==========================================
abstract class car{
	public abstract void fType();
}
class honda extends car{
	void fType(){
		System.out.println("cng");
	}

}

class santro extends car{
	void fType(){
		System.out.println("Disel");
	}
}

class test{
	public static void main(String[] args) {
		car c=new honda(); //not car c=new car();
		c.fType();
		c=new santro();
		c.fType();

	}
}
==================================

// one abstract clsas can extent other abstract class
abstract class engine{
	public abstract void fType();
	public abstract void power();
}
abstract class car extends engine{
	public abstract void colour();
}
class honda extends car{
	void fType(){
		System.out.println("cng");
	}

}

class santro extends car{
	void fType(){
		System.out.println("Disel");
	}
}

class test{
	public static void main(String[] args) {
		car c=new honda(); //not car c=new car();
		c.fType();
		c=new santro();
		c.fType();

	}
}

// ===============================================================

abstract class engine{
	public engine(){
		System.out.println("engine");
	}

class honda extends engine{
	public honda(){
		System.out.println("honda");
	}

}
class test{
	public static void main(String[] args) {
		honda h=new honda();
		engine e=new engine(); //error

	}
}

//contructor is there in abstract class as if not that it wont be 
// // able to call object class 
// so if we make child of honda then it will call the constructor of
// engine class and it call the object class contructor

// we can make contructor of abstract class but cant make object of 
// it

//===================================

// by default method of interface is public and abstract

interface sizeable{
	public void size()
}
class honda implements sizeable{

}

class test{
	public static void main(String[] args) {
		honada h=new honda();
	}
}


//override or make abstract method


interface sizeable{
	 void size();
}
class honda implements sizeable{
		public void size(){
			System.out.println("sizeable called");
		}
}

class test{
	public static void main(String[] args) {
		honada h=new honda();
		h.size();
	}
}


//error as public=> default so we have make it public

interface sizeable{
	 void size();
	void dis(){
		System.out.println("Default method");
	}
}
class honda implements sizeable{
		public void size(){
			System.out.println("sizeable called");
		}
}

class test{
	public static void main(String[] args) {
		honada h=new honda();
		h.size();
	}
}

//error as abstract mentod cant have body


interface sizeable{
	 void size();
	public static void dis(){  //default or static
		System.out.println("Default method");
	}
}
class honda implements sizeable{
		public void size(){
			System.out.println("sizeable called");
		}
}

class test{
	public static void main(String[] args) {
		honada h=new honda();
		h.size();
		sizeable.dis(); // but if default then h.dis()
	}
}

//body method is used to resolve the issue of diamond
//shape
// as in interface method is abstract so every child have to compulsory
// override but by default or static it is not 
// necessary for the childs to override

































