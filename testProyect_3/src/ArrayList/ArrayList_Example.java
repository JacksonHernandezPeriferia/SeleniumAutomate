package ArrayList;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		 
        ArrayList<String> Sample = new ArrayList<String>();
        
        Sample.add("button1");
        Sample.add("button2");
        Sample.add("button3");
        Sample.add("button4");
        Sample.add("button5");
        
        for(int i=0; i<Sample.size();i++) {
        	System.out.println(Sample.get(i));
        }
        
        
        
        System.out.println("-----------");
        
        int ItemIndex = Sample.indexOf("button3");
        System.out.println("Index of button3 Item = "+ItemIndex);
        System.out.println("-------------------");
        
        Sample.remove(1);
        for(int i=0; i<Sample.size();i++){
        System.out.println(Sample.get(i));
        }
	    System.out.println("------------");
	    
	    
	    
	    
	    Sample.set(2, "button8");
	    for(int i=0; i<Sample.size();i++) {
	    	System.out.println(Sample.get(i));
	    }
    }

}
