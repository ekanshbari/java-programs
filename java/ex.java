
// class a{
// 	public static void main(String[] args) {
// 		System.out.println(1==1);
// 	}
// }

class a{
 	public static void main(String[] args) {
 		System.out.println(1==1);
 		String str="hello";
 		String str1="hello"; // checks for hell and ans is false
 		String s=new String("hi");
 		String s1=new String("hi");
 		System.out.println(str==str1);  //checks memory i.e str and str1 point to same position
 		System.out.println(str.equals(str1));
 		System.out.println(s==s1);      // checks memory but s and s1 both has different obj i.e false
 		System.out.println(s.equals(s1));


 		String b="A";
 		String b1="D";
 		String b2=" ";
 		//if b=abd and b1=cnd then compareTo 
 		//check bitwise a and c is match then do to nxt
 		//else give ans as per tht
 		System.out.println(b.compareTo(b1));  //compare with size
 		System.out.println(b.equals(b1));
 		System.out.println(b==b1);

 		System.out.println(b.hashcode());

 		String city="delhi,gurgaon,patna,lacknow,ludhiana";
 		String s[]=city.split(",");
 		for(String x:s)
 			System.out.println(x);





	}
 }

//.equals => tpe of both object or not then check value is same or not
//== checks if both of same type or same loccatione or memory

 //charAt
 //Substring(3) 3=length not index
 // to check methods javap java.lang.String