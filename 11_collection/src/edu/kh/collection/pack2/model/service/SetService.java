package edu.kh.collection.pack2.model.service;

import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

/**
 * 
 */
/**
 * 
 */
public class SetService {
	/*
	 * Set(집합 , 주머니 ) -기본적으로 순서를 유지하지 않음 (index 없음 -> get() 메서드가 없음)
	 * 
	 * 
	 * -중복 데이터 저장 x ( 같은 객체가 들어오면 덮어쓰기)
	 * 
	 * Set 인터페이스의 자식 클래스 1. HashSet(대표) : 처리속도가 빠른set 2. LinkedHashSET: 순서를 유지하는 SET
	 * 3. treeset : 자동 정렬되는 set
	 * 
	 * 
	 * 
	 */

	public void method1() {
		// Hashset 객체 생성
		Set<String> set = new HashSet<String>();
//		Set<String> set = new LinkedHashSet<String>();
//		Set<String> set = new TreeSet<String>();
		// 다형성 중 업캐스팅 적용

		// 1.boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");

		System.out.println(set);
		// hashset 순서 유지 불가 확인
		// linkedhashset 순서 유지 가능
		// treeset 가 나 다 정렬 ( 자동정렬)

		// 중복저장 확인 -> 중복저장 불가 확인
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");

		System.out.println(set);
		// null도 중복 불가 확인
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set); // null 1회출력

		// 2. int size() : set에 저장된 객체의 수 반환
		System.out.println("set.size() " + set.size());

		// 3. boolean remove(E e) :
		// 전달받은 매개변수 e를 set에서 제거
		// 제거 성공 true , 없으면 false

		System.out.println(set.remove("배달의민족"));
		System.out.println(set.remove("유플러스"));
		System.out.println(set);

		// 4. boolean contains(E e) :
		// 전달받은 e가 Set에 있으면 true , 없으면 false
		System.out.println("쿠팡 있는지 검사" + set.contains("쿠팡"));
		System.out.println("삼성 있는지 검사" + set.contains("삼성"));

		// 5. void clear() : Set에 저장된 내용을 모두 삭제
		set.clear();

		// 6. boolean isEmpty() : 비어있으면 true , 아니면 false
		System.out.println(set.isEmpty()); // 비어있는지 물어봄
		System.out.println(set); // 아무것도 없으니 [] 출력

	}

	/**
	 * alt shift j
	 * 
	 * Set에 저장된 요소( 객체)를 꺼내는 방법 1.Iterator (반복자) 이용 2.List 로 변환 3. 향상된 for문 이용
	 * 
	 * 
	 */
	public void method2() {
		Set<String> set = new HashSet<String>();

		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");

		// 1. Iterator (반복자)
		// - 컬렉션 객체에 저장된 요소를
		// 하나씩 순차 접근하는 객체

		// Iterator Set.iterator() :
		// 현재 set을 순차 접근할수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		// 객체로 반환해주기때문에 담아줘야함

		System.out.println("[iterator]");

		// hasNext는 boolean 값 반환 ,
		// booleab Iterator .hasNext():
		// 다음 순차 접근할 요소가 있으면 true , 없으면 false
		while (it.hasNext()) {
			// 다음 요소가 있으면 반복 , 없으면 멈춤

			// E Iterator.next(): 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
		}

		System.out.println("=======================================");

		System.out.println("[List로 변환]");

		// Set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<String>(set);

		// 일반 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=======================================");

		System.out.println("향상된 for문 ");

		// 꺼내올 타입 , 변수입력 : 뭐반복할꺼?
		for (String snack : set) {
			System.out.println(snack);
		}

	}

	/**
	 * 직접 만든 클래스를 이용해 만든 객체를 set에 저장(중복 제거 확인)
	 *
	 * 
	 */
	public void method3() {
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 25, '여');

		// set객체 생성 후 p1 ~ p4 추가
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);

		System.out.println("-------------------------------------");

		for (Person p : personSet) {
			System.out.println(p);
		}

		System.out.println("-------------------------------------");

		// hashCode() : 객체 식별 번호 를 반환
		// 같은 필드 값을 가진 객체는 번호가 같다.

		System.out.println("p1 :" + p1.hashCode());
		System.out.println("p2 :" + p2.hashCode());
		System.out.println("p3 :" + p3.hashCode());
		System.out.println("p4 :" + p4.hashCode());

		// A.equals(B) A:B가 가지고 있는 필드 값이 같다면 TRUE
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		// **************************************************************
		// hash라는 단어가 포함된 컬렉션 이용시
		// hashcode(), equals()오버라이딩 필수적으로 진행해야 한다 !

	}

	/**
	 * treeset 이용한 로또번호 생성기 ->기본 오름차순 정렬 전제조건 : 저장되는 객체는 Comparable 인터페이스 상속 필수!
	 * ->Integer는 comparable 상속되어있음
	 * 
	 */
	public void method4() {
		// 난수생성
		// 1) Math.random()
		// 2) Random.nextInt()

		// Random객체 생성
		Random random = new Random();
		// Integer를 저장할 treeset 객체 생성
		// integer(객체 , wrapper class ) <==> int(기본자료형)
		Set<Integer> lotto = new TreeSet<Integer>();

		// lotto에 저장된 값이 6개 미만이면 반복
		// == 6개 멈춤
		while (lotto.size() < 6) {
			// 난수 추가
			// random.nextint(45) -> 0 <= x < 45 난수
			lotto.add(random.nextInt(45) + 1); // 1~45 의 수를 lotto에 add해줌
		}
		System.out.println(lotto);
	}

	/**
	 * 로또 번호 생성기 금액을 입력받아 ( 천원 단위) 1000원당 1회씩 생성 해서 List에 저장한 후 생성 종료시 한번에 출력
	 * 
	 * <pre>
	 * 금액 입력 : 3000
	 * 
	 * 1회 :[11,22 33,44,55}
	 * 2회 :[12,23 32,41,58}
	 * 3회 :[1,2 3,4,5}
	 * 
	 * 
	 * 
	 * </pre>
	 * 
	 * 
	 */
	public void lottoNumberGenerator() {

		// 스캐너 필요
		Scanner sc = new Scanner(System.in);
		// 생성된 로또 번호 묶음(TreeSet)을 저장할 List
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();

		System.out.println("금액입력");
		int won = sc.nextInt();
		Random random = new Random();

		if (won % 1000 != 0) {
			System.out.println("1000단위 입력");

		} else {
			for (int i = 0; i < won / 1000; i++) {

				Set<Integer> lotto = new TreeSet<Integer>();

				while (lotto.size() < 6) {
					// 난수 추가
					// random.nextint(45) -> 0 <= x < 45 난수
					lotto.add(random.nextInt(45) + 1); // 1~45 의 수를 lotto에 add해줌

				}
				lottoList.add(lotto); //list 에 set을 추가 
			}
			for (int i = 0; i < lottoList.size(); i++) {
				System.out.println((i+1) +"회" + lottoList.get(i));
			}
		}

	}
}
