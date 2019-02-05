package test.singleton;

public class Singleton {
	
	
	private String  ObjectState ; 
	
	private static final Singleton instance = new Singleton(); 
	
	
	public Singleton()
	{
		this.ObjectState="ABC ..... XYZ";
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public String getObjectState() {
		return ObjectState;
	}
	
	public void setObjectState(String objectState) {
		ObjectState = objectState;
	}
	
	

}
