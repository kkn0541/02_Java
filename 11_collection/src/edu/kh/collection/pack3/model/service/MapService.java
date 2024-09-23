package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
//Map : key vlaue 한쌍이 데이터가 되어 이를 모아둔 객체 
//- key를 모아두면 set의 툭징 (중복x)
// -value를 모아두면 LIST의 특징(중복 O)

	public void ex1() {

		// hashMap<k,v> key 객체 value 객체 , Map의 자식 클래스중 가장 대표되는 MAP
		Map<Integer, String> map = new HashMap<Integer, String>();
		// key == integer 정수형태 value는 문자열 형태

		// Map.put(integer key , string value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");

		// {k=v, k=v....

		// key 중복 테스트
		map.put(1, "홍홍홍");// 중복 허용 x 대신 value 덮어쓰기
		// value 중복 테스트
		map.put(7, "최길동");

		System.out.println(map); // map.tostring()오버라이딩 되어있음
	}

	public void ex2() {
		// Map 사용 예제

		// VO (값 저장용 객체 )는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용
		// -> 재사용이 적은 VO는 오히려 코드 낭비
		// Map을 이용해서 VO와 비슷한 코드를 작성할수 있음 .

		// 1) VO버전
		Member mem = new Member();

		// 값세팅
		mem.setId("user01");
		mem.setPw("pass01");
		mem.setAge(30);

		// 값출력
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getAge());

		// 2) Map버전
		Map<String, Object> map = new HashMap<String, Object>();
		// value Object 타입 == 어떤객체든 value에 들어올수 있다.

		// 값세팅
		// id 라는 키에 user01 벨류가 들어와있는거
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		// Object로 넣을때 자동 형변환 integer 되어서 object로 넘어감
		// auto Boxing / auto unBoxing
		// auto Boxing : 기본 자료형 데이터를 객체타입 wrapper클래스로 자동변환
		// 일반자료형은 list에 들어갈수없어서 객체타입으로 변경하는 것이 wrapper
		// int -> integer
		// map.put("age" , 25 ) ;
		// ->map.put ("age", Integer.valueOf(25));

		// auto Unboxing : wrapper 클래스인 객체를 기본 자료형 데이터로 자동 변환
		int num = Integer.valueOf(100);

		// 값 출력
		// Object(value) Map.get(Object key) : 매개변수로 전달받은 key와 대응되는 value반환
		System.out.println(map.get("id")); // key값 id 에 대응되는 value user02 출력
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));

		System.out.println("---------------------------------------");

		// **Map에 저장되어있는 데이터 순차적으로 접근하기

//map에서 key만 모아두면 SET의 특징을 가진다. 
// -> 이를 활용해서 MAP에서 KEYsET() 메서드 제공 
//-> KEY만 모아서 SET으로 반환 
		Set<String> set = map.keySet();// id, pw ,age 가 저장된 set반환

		System.out.println("keySet() : " + set);

		// 향상된 for문
		for (String key : set) {
			System.out.println(map.get(key));
		}
		// map에 저장된 데이터가 많거나
		// 어떤 key가 있는지 불분명할때
		// 또는 map에 저장된 모든 데이터에 접근해야할때
		// keySet() +향상된 for문 코드 사용

	}

	public void ex3() {

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		for (int i = 0; i < 10; i++) {
			// Map 객체 10개 생성
			Map<String, Object> map = new HashMap<String, Object>();
			// Map에 데이터 추가
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			map.put("age", 20 + i);

			// Map을 List에 추가

			list.add(map);
		}

		// for문 종료 시 list에 10개의 map객체가 추가되어있다.
		System.out.println(list);

		// 향상된 for문 이용하여 key가 "id"에 대응되는 value값 전부 출력하기
		for (Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}

}
