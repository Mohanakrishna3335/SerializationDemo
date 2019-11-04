import java.io.*;
// an example of customized serilaization
class Account implements Serializable{
	String username="mohana krishna";
	String password="krish@123";
	
	// top perform customized serialization we use two methods 
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epassword ="123"+password;
		os.writeObject(epassword);
		
	}
	private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		    String epassword=(String)is.readObject();
		    password=epassword.substring(3);
		    
	}
}
 class CustomizedSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	Account a1 = new Account();
	//serialization
	FileOutputStream fos = new FileOutputStream("Customized.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a1);
	oos.close();
	//deserialization
	FileInputStream fis = new FileInputStream("Customized.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	                Account ac1=(Account)ois.readObject();
	                ois.close();
	                System.out.println(ac1.username+"--"+ac1.password);
}
}
