
// class day5{
// 	public void calculate(int a, int b) {
// 		System.out.println("calculate called");
// 	}

// 	public static void main(String[] args) {
// 		day5 obj=new day5();
// 		obj.calculate(12,4);
// 	}
// }

// //============================================================
// //throws raise the exception tells the caller that it may have 
// //exception

// class day5{
// 	public void calculate(int a, int b) throws Exception {
// 		System.out.println("calculate called");
// 	}

// 	public static void main(String[] args) {
// 		day5 obj=new day5();
// 		obj.calculate(12,4);
// 	}
// }

//above give error as here we have declare excepton so when call this 
//functon just take some precaution and we have to handle it

class day5{
	public void calculate(int a, int b) throws Exception {
		System.out.println("calculate called");
		System.out.println(a/b);

	}

	public static void main(String[] args) {
		day5 obj=new day5();
		try
		{
			obj.calculate(12,0);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

//========================



