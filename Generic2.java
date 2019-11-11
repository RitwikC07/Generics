package generic;

public class Generic2 <T> {
	T obj; 
	Generic2(T obj)
    {  
		this.obj = obj;
	}
    public T getObject()
    { 
    	return this.obj;
    }
}
