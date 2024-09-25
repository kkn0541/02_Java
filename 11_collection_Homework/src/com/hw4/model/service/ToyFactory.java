package com.hw4.model.service;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);

	private Set<Toy> toySet = new HashSet<Toy>();
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set

	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	// 재료가 저장되어있는 map
	// 재료 고유번호 INTEGER , 재료 이름 STRING

	// 메서드
	public ToyFactory() { // 기본생서자

		// 기본 등록된 재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		// 현재 제작된 장난감
		toySet.add(new Toy("마이롱레그", 8, 36000, "분홍색", "19950805", addmts(1, 4)));
		toySet.add(new Toy("허기위기", 5, 12000, "파란색", "19940312", addmts(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addmts(1, 3)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960125", addmts(1, 4)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addmts(1, 3, 4)));

		// 1 일반 배열 사용
		// toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addmts(new int[]{1,4}
		// )));

		// 2 List. of() 사용 전달받은것 배열형태로 만들어줌
		// toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addmts(List.of()1,4
		// ))));

		// 3. Arrays.asList() 사용
		// toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225",
		// addmts(Arrays.asList(1,4)))));
	}

	// 가변인자 메서드
	/**
	 * 매개변수로 전달받은 값들을 set형태로 반환하는 메서드 재료저장 Map에 있는지 확인하고 set형태로 반환하는 메서드
	 * 
	 * @param
	 * @return
	 * 
	 *         가변인자 작성법 : 자료형 ... 변수명 ->매개변수의 수가 정확히 몇개인지 특정할수 없을 때 사용
	 */

	public Set<String> addmts(Integer... materials) {
		// maarials는 배열형태로 들어옴 ex [1,4]

		// 매개변수로 전달받은 재료를 저장하여 반환할 set객체를 생성
		// 새로 만들ㅇ저서 반환할 set객체 생성
		Set<String> addMaterials = new HashSet<String>();

		// 전달받은 값 반복돌려서 확인
		for (Integer materiealsKey : materials) {
			// Map에서 재료 고유번호(key)에 대응하는 재료명 value을 가져와서
			// addMateirlas 에 추가
			String materialsValue = materialMap.get(materiealsKey);
			// 1, 4에 해당하는 value값 가져옴 = Map.get(key) : key를 전달하면 대응되는 value를 반환

			// map에 없는 key를 입력하여 value를 얻어왔을대 == null

			if (materialsValue != null) { // 재료 목록에 있을때
				addMaterials.add(materialsValue);
			}
		}
		return addMaterials;
	}

	// 메서드 호출

//printNumbers(1);          // 1개의 인수 전달
//printNumbers(1, 2, 3);    // 3개의 인수 전달
//printNumbers();           // 인수를 하나도 전달하지 않을 수도 있음

	public void displayMenu() {
		int menuNum = 0;

		do {
			System.out.println("\n<< 플레이타임 공장 >>\n");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");

			try {

				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					displayAllToys();
					break;
				case 2:
					createNewToy();
					break;
				case 3:
					deleteToy();
					break;
				case 4:
					displayToysByManufactureDate();
					break;
				case 5:
					displayToysByAge();
					break;
				case 6:
					addMaterial();
					break;
				case 7:
					removeMaterialByName();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!");

				}

			} catch (Exception e) {
				System.out.println("알맞은 입력을 해라...(경고)..");

				sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자 비우기

				menuNum = -1;
				// 첫 반복에서 예외 발생 시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
			}

		} while (menuNum != 0);

	}

	public void displayAllToys() {
		System.out.println("===============전체 장난감 조회 ============");
		if (toySet.isEmpty()) {
			System.out.println("비어있음");
			return;
		}
		int index = 1;
		for (Toy toy : toySet) {
			System.out.println(index + "." + toy);
			index++;
		}

	}

	/**
	 * 새로운 장난감 만들기
	 * 
	 * @return
	 */
	public void createNewToy() {
		System.out.println("장난감 이름");
		String name = sc.next();
		// 이미 존재하는 장난감 이름인지 이름으로 확인
		for (Toy existingToy : toySet) {

			if (existingToy.getName().equals(name)) {
				System.out.println("이미 같은 이름 가진 장난감이 있음");
				return;
			}
		}

		System.out.println("사용 연령");
		int age = sc.nextInt();

		System.out.println("가격");
		int price = sc.nextInt();

		sc.nextLine();

		System.out.println("색상");
		String color = sc.next();

		System.out.println("제조일");
		String manufactureDate = sc.next();

		System.out.println("재료 ");

		Set<String> materials = new HashSet<String>(); // 재료 저장할 set 객체 생

		System.out.println("사용 가능한 재료 목록 ");

		System.out.println(materialMap.entrySet());
		// set객체로 반환됨
		// [1=면직물 , 2=플라스틱 , 3=유리 , 4=고무]
		// k=v -> 엔트리라고 함
		// Set<Entry<K , V> > Map.entrySet(): key=value 한쌍으로 이루어진 Entry 객체를
		// Set 객체로 반환
		// Entry.getKey() : entry객체의 key반환
		// Entry.getValue() : Entry 객체의 value 반환

		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// 1 : 면직물
			// 2 : 플라스틱 ...
		}

		while (true) {
			System.out.println("추가할 재료의 번호를 입력하세요(종료하려면 q를 입력하세요 ) : ");

			try {
				String input = sc.next();

				if (input.equals("q")) { // 종료 시
					break;
				}
				// String형인 input 을 int형 정수 값으로 변환(Integer wrapper 클래스 이용 )
				int materialKey = Integer.parseInt(input); // "1" -> 1
				String material = materialMap.get(materialKey); // "면직물"
				// 입력받은 재료 고유번호로
				// map에 저장된 재료명 (value)를 얻어옴

				if (material != null) { // 재료명이 null이 아니라면

					// materials Set 객체에 해당 재료명이 존재하는지
					if (materials.contains(material)) {
						System.out.println("이미 추가된 재료입니다 다른 재료를 선택하세요");

					} else { // Set에 중복된 재료가 없으면 새로 추가
						materials.add(material);
						System.out.println("재료가 추가되었습니다." + material);

					}

				} else {// 재료명이 null== 없는 재료고유번호를 입력했다는 의미
					System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				}

			} catch (NumberFormatException e) { // 재료번호 입력 시 숫자나 q 가 아닌경우 예외처리 바로함
				System.out.println("숫자를 입력하거나 q를 입력하세요");
			}
		}

		Toy newToy = new Toy(name, age, price, color, manufactureDate, materials);
		// 추가할 재료 저장된 새로운 set객체

		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다.");

//
	}

	/**
	 * 장난감 삭제하기
	 * 
	 * 
	 */
	public void deleteToy() {
		System.out.println("=====삭제할 장난감이름입력=====");
		String toyName = sc.next();

		boolean flag = false;

		for (Toy toy : toySet) {
			if (toy.getName().equals(toyName)) {
				toySet.remove(toy);
				// Set.remove(Object)
				flag = true;
				break;
				// 1.효율 향상을 위해 break;
				// 2.순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// ->예외 방지 및 효율을 위해서 작성
			}

		}

		if (flag) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당하는 이름의 장난감을 찾을수 없습니다. ");
		}
	}

	/**
	 * 재료 추가하기
	 * 
	 * @throws Exception
	 */
	public void addMaterial() throws Exception {
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료 ---");

		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("--------------------");

		System.out.println("재료 고유번호 (key)입력 :");
		int key = sc.nextInt();

		System.out.println("재료명 입력");
		String material = sc.next();

		if (materialMap.containsKey(key)) { // materialMap에 이미 존재하는 Key 인지 확인

			System.out.println("이미 해당키에 재료가 등록되어있습니다.");
			System.out.println("덮어 쓰시겠습니까 y /n ");
			String input = sc.next();

			if (input.equalsIgnoreCase("Y")) {
				// equalsIgnoreCase : 대문자 인지 소문자 인지 구분하지 않고 문자열 값 자체만 비교
				materialMap.put(key, material); // 같은 key로 추가 시 value 덮어쓰기 함
			} else {
				System.out.println("재료추가가 취소 되었습니다.");
			}

		} else {
			materialMap.put(key, material);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}
	}

	/**
	 * 재료명으로 재료 삭제하기
	 * 
	 * @throws Exception
	 */
	public void removeMaterialByName() throws Exception {
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료 ---");

		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("--------------------------------------");
		System.out.println("삭제할 재료명 입력");
		String materialName = sc.next();

		boolean flag = false;

		for (Entry<Integer, String> entry : materialMap.entrySet()) {

			if (entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());

				System.out.println("재료" + materialName + " 가 성공적으로 제거되었ㅅ습니다.");
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}

	}

	/**
	 * 제조 일순으로 장난감 정렬하기
	 * 
	 */
	public void displayToysByManufactureDate() {
		System.out.println("<제조일 순으로 장난감을 정렬 >");

		List<Toy> toyList = new ArrayList<Toy>(toySet);

		toyList.sort(Comparator.comparing(Toy::getManufactureDate));

		int index = 1;
		for (Toy toy : toyList) {
			System.out.println(index + " " + toy);
			index++;
		}

	}

	/**
	 * 연령별 장난감 정렬하기
	 * 
	 */
	public void displayToysByAge() {

		System.out.println("<연령별로 사용 가능한 장난감");
		
		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		//toyByAge 라는 이름의 새로운 map을 생성 
		//-> 연령을 key 로 지정하고 , 해당 연령을 가진 장난감 List 를 value로 가짐 
		//{  k : v , k: v , k: v...}
		//-> {5: ["키시미시 ",,"허기워기"]   {8 : ["캣냅" , "마이롱레그"],12:["파피"]}
		
		for(Toy toy : toySet) {
			int age = toy.getAge(); // 현재 toy 객체가 가진 나이 얻어오기 
			
			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			//putIfAbsent() : Map에서 제공하는 메서드로 , 
			//해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함.
			//->Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트 생성하여 추가 
		
			toysByAge.get(age).add(toy);
			//map.get(k)는 value값 반환 
			//toysByAge.get(age) -> age(k)에 맞는 value 값 반환 -> List
			//List.add(toy) -> 전달된 toy 객체를 List에 추가 
			
		}
		/*toysByAge.entrySet() (set)
		 * 
		 * 5: ["키시미시 " , "허기워기"] 
		 * 8: ["캣닙", "마미롱레그"]
		 * 12 : ["파피"]
		 * 
		 * 
		 * */
		
		for(Entry<Integer,List<Toy>> entry : toysByAge.entrySet()) {
			
			int age = entry.getKey();// 해당 entry의 key(나이)를 얻어옴 
			//해당 entry 의 value를 얻어옴 
			List<Toy> toyList = entry.getValue();
			
			
			System.out.println("[연령: " +age +"세]");
			
			int index=1;
			for(Toy toy : toyList) {
				System.out.println(index+ ", "+ toy);
				index++;
			}
		}
	}
}
