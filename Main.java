package generic;

public class Main {
	public static void main(String[] args) 
    {  
		Generic1 t = new Generic1();
        System.out.println(t.genericDisplay(11)); 
        System.out.println(t.genericDisplay("Ritwik")); 
        System.out.println(t.genericDisplay(1.0)); 
        
        Generic2 <Integer> iObj = new Generic2<Integer>(15); 
        System.out.println(iObj.getObject()); 
        Generic2 <String> sObj = new Generic2<String>("Hey there!!"); 
        System.out.println(sObj.getObject()); 
    } 
}
