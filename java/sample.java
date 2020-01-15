



// class Main{
// 	public void go(short s){
// 		System.out.println("short");
// 	}

// 	public void go(Byte s){
// 		System.out.println("Byte");
// 	}

// 	public void go(byte s){
// 		System.out.println(" byte");
// 	}

// 	public void go(int s){
// 		System.out.println("integer");
// 	}

// 	public void go(long s){
// 		System.out.println("long");
// 	}


// 	public static void main(String[] args) {
		
// 		// Integer a=100;
// 		// Integer b=100;
// 		// Integer a=1000;
// 		// Integer b=1000;

// 		// Long a=1000l;
// 		// Long b=1000l;

// 		// Double a=100d;
// 		// Double b=100d;

// 		//System.out.println(a==b);

// 		Main w=new Main();
// 		byte a=12;
// 		int b=120;
// 		long c=12341;

// 		w.go(12);
// 		w.go(120);
// 		w.go(1234);

// 		w.go(a); //widdening seach for nxt upper
// 		w.go(b);
// 		w.go(c);




// 	}
// }

// // compiler try to fit in old version. in autoboxing or last alternative



/////================================================


// class Main{
// 	public static void main(String[] args) {
// 		public void go(Number n){
// 			System.out.println("Number");

// 		}

// 		public void go(Integer n){
// 			System.out.println("Integer");
			
// 		}

// 			Main w=new Main();
// 			w.go(null); //give priority to child and if sibling then ambiguity


// 	}
// }

//===========+==============================++======================+==================+================================================================x



// class employee{
// 	String name;
// 	public employee(String name){
// 		this.name=name;
// 	}
// 	public String toString(){
// 		return "Hello";
// 	}
// }

// class M{
// 	public static void main(String[] args) {
// 		String str=new String("Saurabh");
// 		employee e= new employee("Saurabh");

// 			System.out.println(str); //but here in tostring it is overriden
// 			System.out.println(e); //object print then tostring method is called by Object clss so hash code without explicit tostring method which is created here 
// 			System.out.println(e);//my tostring claass
			

// 	}
// }


//hashcode() is the method of Object class 
//hashing came from mathematics
//it is an algo for searching fasthk


class employee{
	String name;
	public employee(String name){
		this.name=name;
	}

	public int hashCode(){
		return 2;//return name.length();
	}

	public boolean equals(Object obj){
		if(obj instanceof employee && this.name==((employee)obj).name)
			return true;
		else
			return false;
	}
	
}

class M{
	public static void main(String[] args) {
		
		employee e= new employee("Saurabh");
		employee e1= new employee("Saur");

			
			System.out.println(e);  
			System.out.println(e1);
			System.out.println(e.equals(e1)); //true when two object are identical equal
			
			//if object are equal then same hashcode [equals method]
			// but if hashcode is same that not means that object are identical equal

	}
}







