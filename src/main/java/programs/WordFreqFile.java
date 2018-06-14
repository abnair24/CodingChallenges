package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class WordFreqFile {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		
		try {
			File f = new File("D:\\Study\\Program2Learn\\SampleWrite.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String line="";
			
			while((line=br.readLine())!=null)
			{
				String[] temp= line.split(" ");
				
				for(String s: temp) {
					Integer i = hm.get(s);
					
					if(i==null) {
						hm.put(s, 1);
					}
					else {
						hm.put(s,i);
					}
					
				}
			}
			System.out.println(hm);
			for(Entry<String, Integer>ent: hm.entrySet()) {
				System.out.println(ent.getKey()+":"+ent.getValue());
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
