package pack1;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


class st1{
	public int rno;
	public String name;
	st1(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
}
public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		st1 st2=new st1(12,"raj");
		Map<String,st1> map12=new HashMap<String,st1>();
		map12.put("Karnataka",st2);
		System.out.println(map12);
		
		System.out.println("++++++++++++++");
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("Karnataka", "Bengaluru");
		map1.put("Tamilnadu","Chennai");
		map1.put("Maharhastra","Mumbai");
		Map<String,String> map3=new HashMap<String,String>();
		map3.putAll(map1);
		
		
		System.out.println(map1);
		Iterator<String> it=map3.keySet().iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key+"  val="+map1.get(key));
		}
		//map3.remove("Tamilnadu");
		//map3.putIfAbsent("Tamilnadu","Chennai");
		TreeMap<String,String> tr=new TreeMap<String,String>();
		tr.put("Karnataka", "Bengaluru");
		tr.put("Tamilnadu","Chennai");
		tr.put("Maharhastra","Mumbai");
		tr.put("aa", "zz");
		Iterator<String> ittr=tr.keySet().iterator();
		while(ittr.hasNext()) {
			String l=(String)ittr.next();
			System.out.println("tree key"+l+"values="+tr.get(l));
		}
//		boolean t=map3.get(0).contentEquals("Tamilnadu");
//		if(t) {
//			System.out.println("checked+++++++++++++");
//		}
		
		
		
		
		
		
		for(String val:map1.values()) {
			System.out.println(val);
		}
		Map<String,String> map2=new HashMap<String,String>(map1);
		// map2.putAll(map1);//////////////
		map2.remove("Tamilnadu");
		for(String val:map2.values()) {
			System.out.println("-------"+val);
		}
		System.out.println(map1.size()+"    "+map2.size());
		if(map1.containsKey("Karnataka")) {
			System.out.println("yes");
		}
			map1.putIfAbsent("Bihar","patna");
			System.out.println("done"+map1.entrySet());
			System.out.println("done"+map1.keySet());
			System.out.println("done"+map1.values());
			
		
	}

}
