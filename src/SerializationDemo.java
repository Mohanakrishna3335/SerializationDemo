import java.io.*;
//simple serialization example with username and password
class AccountDetails implements Serializable{
	String name ="mohana krishna";
	transient  final String password ="krish123";
	}
class SerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	AccountDetails acc =new AccountDetails();
	//serilazation
	FileOutputStream fos =new FileOutputStream("account.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(acc);
	oos.close();
	//deserialization
	FileInputStream fis= new FileInputStream("account.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	  AccountDetails accc=(AccountDetails)ois.readObject();
	  ois.close();
	  System.out.println(accc.name+"............"+accc.password);
	
}
}

