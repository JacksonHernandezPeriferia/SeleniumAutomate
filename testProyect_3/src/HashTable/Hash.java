package HashTable;

import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {
		Hashtable<String, Integer> t1 = new Hashtable<String, Integer>();
		t1.put("Legs", 4);
		t1.put("Eyes", 2);
		t1.put("Mouth",1);
		
		
		System.out.println("Animal Legs = "+t1.get("Legs"));
		System.out.println("Animal Eyes = "+t1.get("Eyes"));
		System.out.println("Animal Mouth = "+t1.get("Mouth"));

	}

}
