package test.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.vo.Content;
import test.vo.Member;




public class Run {

	public static void main(String[] args) {
		

	 
		
		
		
		
		
		
		List<Content> contentList =new ArrayList<Content>();
	
		//객체만 넣을수 잇음
				contentList.add(new Content("게시글11", "20202020"));
				contentList.add(new Content("게시글22", "20202020"));
				
				
	List<Member> memList = new ArrayList<Member>();
	memList.add(new Member("김길동", "1234", "19661111"));
	memList.add(new Member("박둘리", "4567", "19880404"));
	memList.add(new Member("홍도치", "9999", "19641211"));
	memList.add(new Member("마이콜", "0000", "19721011"));
	
			//	System.out.println(memList);
				
			//	contentList.addAll(memList);
//				

System.out.println(memList.get(0).getId() + contentList.get(0).getContent());
	
	
//	
//		int index =0;
//	
//				for(Member mem : memList) {
//				System.out.println(mem.getId("김길동"))	;
//				
//						
//						
//						
//				  for(Content ct : contentList) {
//					  String c=ct.getContent();
//					  
//					//  System.out.println(a+ " "+" " +c);
//				  }
//				 
//				
//				}
				
				
			//	System.out.println(contentList);
//		Map<String, String> memberList = new HashMap<String, String>();
//		memberList.put("user1", "1234");
//		memberList.put("user2", "1234");
//		
//		
//		Map<String, List<Content>> totalList= new HashMap<String, List<Content>>();
//		
		
	//	totalList.put(memberList.get, contentList);
		
		//entrySet() 은 key 와 value 값을keySet()은 key 값만을 가져올 수 있다.
	//	System.out.println(totalList);
		//
	
		
	//    System.out.println(memberList);
		
	  
	}
	
	
}
