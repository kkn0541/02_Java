package test.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.vo.Content;




public class Run {

	public static void main(String[] args) {
		

	    
		List<Content> contentList =new ArrayList<Content>();
	
		//객체만 넣을수 잇음
				contentList.add(new Content("게시글11", "20202020"));
				contentList.add(new Content("게시글22", "20202020"));
				
		Map<String, String> memberList = new HashMap<String, String>();
		memberList.put("user1", "1234");
		memberList.put("user2", "1234");
		
		
		Map<String, List<Content>> totalList= new HashMap<String, List<Content>>();
		
		
		totalList.put(memberList.get, contentList);
		
		//entrySet() 은 key 와 value 값을keySet()은 key 값만을 가져올 수 있다.
		System.out.println(totalList);
		//
	
		
	//    System.out.println(memberList);
		
	  
	}
	
	
}
