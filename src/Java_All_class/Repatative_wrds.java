package Java_All_class;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repatative_wrds {

	public static void main(String[] args) {
		
		String s = "for the people by the people by the people";
       String[] split = s.split(" ");	
       
       Map<String, Integer> m =  new LinkedHashMap<String, Integer>();
        for (String string : split) {
	     
        	if (m.containsKey(string)) {
				Integer in = m.get(string);
				m.put(string,in+1);
			} else {
	
        	m.put(string, 1);
	}
        }
       //System.out.println(m);
        Set<Entry<String,Integer>> entrySet = m.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
        	
         if (entry.getValue()>1) {
			
		}				
         System.out.println(entry);
			}
		}
	}

