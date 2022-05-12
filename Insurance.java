package insurance_bazar;

import java.util.*;

public class Insurance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		System.out.println("Enter no of policy you want to store :");
		int i=sc.nextInt();
		for(int m=0;m<i;m++) {
			System.out.println("Enter policy ID :");
			int id=sc.nextInt();
			System.out.println("Enter policy Name :");
			String name=sc.nextLine();
			name=sc.nextLine();
			map.put(id, name);
		}
		System.out.println("Enter Policy type to be Searched :");
		String type=sc.next();
		for(Map.Entry m : map.entrySet()){    
		    String name=(String) m.getValue();    
		    if(name.contains(type))
		    System.out.println(m.getKey());
		   }  
	}

}
