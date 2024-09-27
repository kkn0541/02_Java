package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/*
	 * ObjectInputStream / objectOuputStream
	 * -java 객체 입/ 출력할때 
	 * 사용하는 바이트 기반 "보조"  스트림
	 * (보조스트림은 단독으로 사용 불가능 기반스트림과 함께 사용해야함)
	 * 
	 *  ***직렬화(serializable) ***
	 *  -객체를 직렬(직선)형태로 변환
	 * 
	 *  -직렬화 란 객체의 상태(필드 값들)를 바이트 스트림으로 변환하는 과정.
	 *  이를 통해 객체는 메모리에서만 존재하는 것이 아니라 , 파일로 저장되거나
	 *  네트워크를 통해 전송될수 있음
	 * 
	 *  -역직렬화는 바이트 스트림을 다시 객체로 복원하는 과정.
	 *  즉 , 저장되거나 전송된 데이터를 원래의 객체형태로 되돌리는 작업

	 * */
	
	/**객체를 외부파일로 출력 
	 * 내부 -> 외부 출력 
	 * 직렬화 필요! 
	 * 
	 * 
	 */
	public void objectOutput() {
		
		//스트림 참조변수 선언 
		FileOutputStream fos = null; //기반 스트림
		
		//보조스트림 은 단독사용 불가해서 FileOutputStream같은 기반스트림과 같이써야함
		ObjectOutputStream oos = null; // 객체 출력용 보조 스트림
		
		
		
		try {
			// .dat 확장자 : data를 담고있는 파일을 나타내는 확장자 
			fos= new FileOutputStream("/io_test/20240926/Member.dat");
			
			//보조스트림은 기반스트림을 통해 만듬
			oos = new ObjectOutputStream(fos); //객체 보조스트림 생성 
			
			//내보낼 Member객체 하나 생성 
			Member member = new Member("member01", "pass01","김회원",30);
			
			//ObjectOutputStream 을 이용해서 MEMBER객체를 출력하기 
			oos.writeObject(member); //member객체를 출력
			
			System.out.println("회원출력완료");
			
			//에러 내용 [직렬화가 되지 않음]
			//java.io.NotSerializableException: edu.kh.io.pack3.model.dto.Member
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			//예외가 발생 하든 안하든 무조건 수행
			//사용 완료된 스트림 메모리 반환 
			try {
				//보조스트림만 닫아도 기반스트림은 같이 닫힘 
				if(oos!=null) {
					oos.close(); //oos닫으면 기반스트림인 fos 함께 닫힘 
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**외부 파일로부터 member객체입력 받기
	 * 
	 * 외부-> 내부(자바프로그램) 
	 * 역직렬화 필요!
	 */
	public void objectInput() {
		
		//스트림 참조변수 선언 
		//기반스트림 
		FileInputStream fis = null;
				
		//보조스트림
		ObjectInputStream ois=null;
		
		
		try {
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240926/Member.dat");
			
			//객체 입력 보조스트림 생성 
			ois = new ObjectInputStream(fis);
			
			//스트림을 이용해 파일에 작성된 
			//직렬화된 Member 객체를 읽어와 
			//역직렬화를 수행하여 정상적인 Member객체로 변경 
			
			//Object ois.readObject() :직렬화된 객체를 읽어와 역직렬화 
			//              +member객체로 변경하려면 다운캐스팅 해줘야함
			Member member =(Member) ois.readObject();  // Member = object 못들어가서 object를 (Member)로 다운캐스팅 
			
			//읽어온 내용 확인 
			System.out.println(member);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(ois!=null) {
					//스트림 닫기 
					ois.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
