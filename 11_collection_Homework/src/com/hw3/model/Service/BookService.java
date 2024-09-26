package com.hw3.model.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	// 필드
	// 스태너
	private Scanner sc = new Scanner(System.in);

	// 도서목록 저장할 컬렉션 객체 (목록 List)
	// 리스트는 인터페이스 라서 직접객체못하고 arrayList로 객체생성
	// 부모타입 참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	private List<Book> library = new ArrayList<Book>();

	// 즐겨찾기 저장할 컬렉션 객체 (즐겨찾기 목록 List)
	private List<Book> favList = new ArrayList<Book>();

	public BookService() {

		// Bookservcie 객체가 생성될때 Libary list에 5개 도서 등록
		// add() 에 () 는 넣고 싶은 객체를 넣는 거임
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베개", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
	}

	// 메서드
	public void displayMenu() {

		try {
			int menuNum = 0;
			do {
				System.out.println("==도서목록");
				System.out.println("1 등록");
				System.out.println("2 조회");
				System.out.println("3 수정");
				System.out.println("4 삭제");
				System.out.println("5 즐겨찾기추가");
				System.out.println("6 즐겨찾기 삭제");
				System.out.println("7 즐겨찾기 리스트");
				System.out.println("8 랜덤");
				System.out.println("0 종료");

				System.out.println("메뉴 입력");
				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					addBook();
					break;
				case 2:
					showBookList(library);
					break;
				case 3:
					System.out.println(editBook());
					break;
				case 4:
					deleteBook();
					break;
//				case 5: addFavorite(); break;
//				case 6: deleteFavoriteBook(); break;
				case 7:
					showBookList(favList);
					break;
			case 8: randomBook(); break;
//				case 0: System.out.println("종료되었습니다."); break;

				default:
					System.out.println("메뉴에 있는 번호만 입력");
					break;
				}

			} while (menuNum != 0);
			// 조건식이 false면 종료
		} catch (Exception e) {
			// 예외 처리
			// execption : 예외 클래스의 최사위 클래스
			// 모든 예외 처리 가능
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외 추적
		}
	}

	/**
	 * 도서등록 메서드
	 */
	public void addBook() {
		System.out.println("=======도서등록=======");

		System.out.println("도서번호");
		int bookNum = sc.nextInt();

		// 입력 버퍼에 남은 개행문자 제거용
		sc.nextLine();

		System.out.println("도서 제목");
		String title = sc.nextLine();

		System.out.println("도서 저자");
		String writer = sc.nextLine();

		System.out.println("도서 가격");
		int price = sc.nextInt();

		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거용

		System.out.println("도서 출판사");
		String publisher = sc.nextLine();

		// 입력받은 값으로 새로운 book객체 생성
		Book newbook = new Book(title, writer, price, publisher, bookNum);

		// library 리스트에 new book추가 6번째 방에 들어가게됨

		library.add(newbook);

		System.out.println("등록완료");

	}

	/**
	 * 도서목록 조회용 메서드
	 * 
	 * @param ==List<book> 매개변수로 List<book> list가 들어온다
	 */
	// 메서드에 타입 변수
	public void showBookList(List<Book> list) {
		System.out.println("=========도서전체조회----------");

		if (list.isEmpty()) {
			System.out.println("도서정보 없음");
			return;
		} else {
			// 전달받은 리스트를 순회해서 뽑아내기
			int index = 0;
			// list를 대상으로 각 book객체 출력
			for (Book lib : list) {
				System.out.println(lib); // Book.tostring
			}

		}

	}

	/**
	 * 도서 수정용메서드
	 * 
	 * @return
	 */
	public String editBook() {
		showBookList(library); // 등록된 도서를
		System.out.println("=====도서 수정=====");

		int editMenu = 0;

		System.out.println("수정할 도서 번호를 입력하세요");

		int bookNum = sc.nextInt();

		// for문으로 library 순회하면서 일치하는값있는지

		boolean flag = true;

		for (Book temp : library) {

			// int 값 비교 ==
			if (temp.getBookNum() == bookNum) {
				// 입력 도서번호화 도서목록 번호 일치하는걸 찾았을떄
				// 찾앗다
				flag = false;

				System.out.println("1. 도서명");
				System.out.println("2. 도서저자");
				System.out.println("3. 도가격");
				System.out.println("4. 출판사");
				System.out.println("0. 종료");

				editMenu = sc.nextInt();
				sc.nextLine();//안쓰니까 int가 남아있음 
				
				switch (editMenu) {
				case 1:
					System.out.println("---e도서명수정");
					System.out.println("수정할 도서명");
					String title = sc.nextLine();
					temp.setTitle(title);
					break;
			
				case 2:
					System.out.println("---e도서저자");
					System.out.println("수정할 저자");
					String writer = sc.nextLine();
					temp.setWriter(writer);
					break;

				case 3:

					System.out.println("---e도서가격");
					System.out.println("수정할 가격");
					int price = sc.nextInt();
					temp.setPrice(price);
					break;

				case 4:
					System.out.println("---e도서출판사");
					System.out.println("수정할 출판사");
					String publisher = sc.nextLine();
					temp.setPublisher(publisher);
					break;

				case 0:
					System.out.println("종료");
					break;

				default:
					System.out.println("d메뉴잇는번호만입력");
				}
			flag=false;
			}
		}

		if (flag) {
			return "일치하는 도서 없습니다.";
		}

		return "수정완료";
	}

	public String deleteBook() {
		System.out.println("====도서삭제=====");

		showBookList(library);

		System.out.println("삭제할 도서번호 입력");
		int deleteNum = sc.nextInt();

		for (Book temp : library) {
			if (temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp);
//		   int java.util.List.indexOf  (Object o)	:List 에 일치하는
				// 객체가 있으면 그객체가 있는 index번호 반환

				System.out.println("index 번호 " + index);

				System.out.println("정말 삭제하시겠습니까 *y / n  :");
				char answer = sc.next().toUpperCase().charAt(0);// "y" -> "Y" -> 'Y'
				if (answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다.";
				}

			}
		}

		return "삭제 끝";
	}
	/**추천 도서 뽑기 
	 * 
	 */
	public void randomBook() {
		int max = library.size();
		
		//            int형으로 강제형변환
		int random = (int)(Math.random() * max); //0~리스트의 마지막인덱스 번호 
		
		System.out.println(library.get(random).getTitle());
	}
}
