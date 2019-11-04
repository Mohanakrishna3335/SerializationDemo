import java.io.*;
public class ExternalizationDemo implements Externalizable{
	String s;
	String i ;
	int j;
	public ExternalizationDemo(){
		System.out.println("public no-arg constructor");
	}
	public ExternalizationDemo(String s,String i, int j){
		this.s=s;
		this.i=i;
		this.j=j;
	}
	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeObject(s);
		out.writeObject(i);
	}
	public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException{
		s=(String)in.readObject();
		i=(String)in.readObject();
	}
	public static void main(String[] args)throws Exception{
		ExternalizationDemo t1= new ExternalizationDemo("mohan","k3335",343);
		FileOutputStream fos=new FileOutputStream("Externalization.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(t1);
		oos.close();
		FileInputStream fis =new FileInputStream("Externalization.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizationDemo t2=(ExternalizationDemo)ois.readObject();
		System.out.println(t2.s+"--"+t2.i+"--"+t2.j);
		ois.close();
	}
}
