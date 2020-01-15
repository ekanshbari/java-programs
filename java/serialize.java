import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Date;

class car implements Serializable{
	String carName="Honda";
}

class Employee implements Serializable{  //marker interface as no method
	String name="Vishal";
	car c=new car();
	
}
public class a {
	public static void main(String[] args){
		// Date curDate= new Date();
		// System.out.println("******"+curDate);
		Employee e=new Employee();

// 		try{
// 			//serialization
// 			// FileOutputStream fos=new FileOutputStream("D://javaEclipse//object.txt");
// 			// ObjectOutputStream ois=new ObjectOutputStream(fos);ois.writeObject(curDate);
// 			// ois.flush();ois.close();System.out.println("Object saved'");
			
			
			
// //			FileInputStream fis=new FileInputStream("D://javaEclipse//object.txt");
// //			ObjectInputStream ois1 =new ObjectInputStream(fis);
// //			Object ob=ois1.readObject();
// //			Date d1=(Date)ob; //read dobject return type object
// //			
// //			System.out.println("========"+ob);
// //			System.out.println("======"+d1.getDate());//getDate is old method
// //			System.out.println(d1);

// 			//deserialization

// 			FileOutputStream fos=new FileOutputStream("D://javaEclipse//object.txt");
// 			ObjectOutputStream ois=new ObjectOutputStream(fos);
// 			Employee e=(Employee)ois,readObject();
// 			System.out.println(e.name);

// 			//==================derialisation ablve and down serialization
// 			ois.writeObject(emp);
// 			ois.flush();
// 			ois.close();
// 			System.out.println("Object saved'");
			
// 		}

		try{
			// serialization
			FileOutputStream fos=new FileOutputStream("D://javaEclipse//object.txt");
 			ObjectOutputStream ois=new ObjectOutputStream(fos);
 			ois.writeObject(emp);
 			ois.flush();
 			ois.close();
 			System.out.println("Object saved'");

 			//deserialisation
 			FileInputStream fos=new FileInputStream("D://javaEclipse//object.txt");
 			ObjectInputStream ois=new ObjectInputStream(fos);
 			Employee e= (Employee)ois.readObject();
 			System.out.println(e.c.carName);
 			System.out.println(e.name);


 			//employee ka object write hoga toh car ka bhi hoga but agar hume employee ka hi write krna hai 
 			//to hum implemnts hta skte hai class car se buut will give exception aur employee ka object bhi mhi bnega 
 			//to hum emplyee class me car ke object declaration me transient likh denge transient will skip this line





		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
}
