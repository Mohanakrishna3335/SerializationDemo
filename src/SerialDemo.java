/*import java.io.*;
//simple serilaization example to show  how serialization happens when multiple objects to be serialized
class TextInfo implements Serializable{

}
class FileInfo implements Serializable{
	
}
class NetworkInfo implements Serializable{

}
public class SerialDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		TextInfo t=new TextInfo();
		FileInfo f =new FileInfo();
		NetworkInfo n= new NetworkInfo();
		//serilaization
		FileOutputStream fos = new FileOutputStream("MultiObject.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.writeObject(f);
		oos.writeObject(n);
	   
		//deserialization
		//order of objects to deserialize i simportant or else we will get classcastException
		FileInputStream fis = new FileInputStream("MultiObject.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		          TextInfo t1 =(TextInfo)ois.readObject();
		          FileInfo f1=(FileInfo)ois.readObject();
		          NetworkInfo n1=(NetworkInfo)ois.readObject();
		         
		          
	}	

}
*/
//
import java.io.*;
//simple serilaization example to show  how serialization happens when multiple objects to be serialized
class TextInfo implements Serializable{

}
class FileInfo implements Serializable{
	
}
class NetworkInfo implements Serializable{

}
public class SerialDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		TextInfo t=new TextInfo();
		FileInfo f =new FileInfo();
		NetworkInfo n= new NetworkInfo();
		//serilaization
		FileOutputStream fos = new FileOutputStream("MultiObject.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.writeObject(f);
		oos.writeObject(n);
	   
		//deserialization
		//order of objects to deserialize i simportant or else we will get classcastException
		FileInputStream fis = new FileInputStream("MultiObject.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o instanceof TextInfo){
			TextInfo t1=(TextInfo)o;
			}
		else if(o instanceof FileInfo ){
			FileInfo f1=(FileInfo)o;
			}
		else if(o instanceof NetworkInfo ){
			NetworkInfo n1=(NetworkInfo)o;
			}
		}
		}