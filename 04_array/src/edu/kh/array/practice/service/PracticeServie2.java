package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeServie2 {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[9];

		int sum = 0; // 합계 저장용 변수
		for (int i = 0; i < arr.length; i++) {
			// 0~8까지니깐 +1
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n 짝수번쨰 인덱스 합: " + sum);
	}

	public void practice2() {
		int arr[] = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// 0 ==> 9 1=>8 2=>7

			arr[i] = arr.length - i;
			// arr[0] =9-0
			// arr[1]=9-1
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) {
				sum += arr[i];
			}
		}

		System.out.println("\n홀수번째 인덱스 합" + sum);

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int arr[] = new int[sc.nextInt()]; // 코드짧게 input따로 생성안하고 바로 넣기

		for (int i = 0; i < arr.length; i++) {
			//
			arr[i] = i + 1;
			System.out.println(arr[i]);

		}

	}

	public void practice4() {
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt(); // 입력 값 배열에 대입

		}
		System.out.println("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("인덱스 :" + i);
				flag = false; // 찾았다면 flag를 false로 변경
				break; // 앞쪽요소에서 찾았으면 가장 가까운 반복문 멈춤 ㄹ
			}

		}
		if (flag) {
			System.out.println("일치하는 값이 존재하지 않음");
		}
	}

	public void practice5() {
		// 1. 사용자에게 문자열입력받기
		System.out.println("문자열 : ");
		String str = sc.nextLine();

		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
		// 먼저 사용자가 입력한 문자열 (str)의 길이만큼의 char배열을 할당
		char[] arr = new char[str.length()]; // 문자열의 길이

		// 반복문을 통해 str.charAt(i) 값을 arr[i]에 담는 과정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i); // 0번 문자 a , 1번문자b ,2번문자 c

		}

		// 3. 문자 입력 받기 (검색할 문자)
		System.out.println("문자 : ");
		// 검색할 문자도 char형이여야함
		char ch = sc.nextLine().charAt(0);

		// 4. 검색할 문자가 문자열에 몇개 , 어느 인덱스에 있는지

		int count = 0; // 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견될때마다 1씩 증가

		// 반복문 수행 전 문자열 출력
		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스)");

		// 인덱스 마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우

				// 이거 몰랐음
				System.out.print(i + " ");// 해당되는 인덱스 이어서 출력하기

				count++; // 1증가

			}
		}

		// 위에서 구한 값들 출력하기
		System.out.println(); // 위에서 마지막으로 print() 사용했기때문에
		// 개행이 되어있지 않아서 개행해줌
		System.out.println(ch + "개수" + count);

	}

	public void practice6() {
		// 1.사용자에게 값을 입력받고 그 값만큼 배열 선언 및 할당
		System.out.println("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		// 2. 배열의 크기만큼 사용자가 직접 값으 ㄹ입려가형 각각 인덱스값을 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();

		}
		// 3 전체값 나열 및 총합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println();
		System.out.println(sum);
	}

	public void practice7() {
		System.out.println("주민등록번호 (-포함) :");
		String input = sc.next();
		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {

			if (i <= 7) { // 7번 인덱스 이하 (생년월일 , -, 성별
				arr[i] = input.charAt(i);
			} else { // 8번 인덱스 이상부터는 *
				arr[i] = '*';
			}

			System.out.println(arr[i]);

		}

	}

	// 어려움
	public void practice8() {

		while (true) {
			// 3이상의 수가 입력될때까지 반복
			// -> 3이상 홀수가 입력되면 원하는 코드 수행 후 break문으로 종료 예정

			System.out.println("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) { // 3미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력하세요");
			} else {
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];

				int num = 0; // arr 배열에 대입될 값

				for (int i = 0; i < arr.length; i++) {

					// 요소에 값 대입하기
					if (i <= arr.length / 2) { // 중간 이전까지 -> 증가

						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}
					if (i == arr.length - 1) {
						System.out.println(arr[i]);
					} else {
						System.out.println(arr[i] + ", ");
					}
				} // for문 끝

				// 각 요소에 대입된 값 출력하기
				// 출력 시 , 추가(단, 마지막 제외)

				break;
			}
		}

	}

	public void practice9() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

		}
		System.out.println("발생한 난수: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice10() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.println(arr[i] + " ");

		}
		System.out.println();

		int max = 1; // 최대값을 담아줄 변수
		int min = 10; // 최소값을 담아줄 변수

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) { // 해당 인덱스의 값이 max보다 큰경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}
			if (arr[i] < min) { // 해당 인덱스의 값이 min보다 작은 경우
				min = arr[i]; // 해당 값을 min변수에 담아주
			}

		}
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);
	}

	public void practice11() {
		int[] arr = new int[10];

		// 2. 1~10 사이의 난수를 발생시킨 값을 각 인덱스에 넣기(단, 중복없이)

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			// 중첩for문으로 중복제거
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {// 앞쪽 요소에 대입된 값을 현재 요소에 대입된 값과 비교
					i--;
					break; // 안쪽 for문 멈추고 바깥쪽 다시 돌게

				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public void practice13() {
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열:");
		String str = sc.nextLine();

		// 2. 해당 문자열의 문자들을 char[]에 담기

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}

		// 3. char배열에서 중복값 존재할 경우 출력x
		int count = 0;// 문자 개수 카운트

		System.out.println("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true; // 중복 체크용 flag

			// for문
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					flag = false; // 중복 발생했을때
					break;
				}

			}

			if (flag) { // 중복이 발생하지 않았을 경우

				// if문
				if (i == 0) {
					System.out.println(arr[i]);
				} else {
					System.out.println(", " + arr[i]);
				}
				// 중복 아닐때만 count개수 늘리기
				count++;
			}

		}

		System.out.println();
		System.out.println("문자 개수" + count);

	}

	public void practice14() {
		// 1.첫 배열 크기 지정
		System.out.println("배열의 크기를 입력하시오");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

		String[] arr = new String[size];

		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3. 반복이 시작되는 구간부터 무한반복하는 while문 작성하여 내부에 종료조건 만들어서 break
		while (true) {
			System.out.print("더 값을 입력하시겟습니까? (y/n) : ");
			char ch = sc.nextLine().charAt(0);

			// 4. 값을 더 입력할 경우
			if (ch == 'y' || ch == 'Y') {
				//5. 더 입력받을 개수 입력받기 
				System.out.println("더 입력받고 싶은 개수");
				int addSize= sc.nextInt();
				sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거 
				
				// 6. 새로 값을 입력받을 배열 생성 ->기존 배열의 크기 + 추가 입력 개수 
				String[] newArr = new String[arr.length+addSize];
				
				//7. 배열 복사 +새로운 문자열 입력받기 
				for (int i = 0; i < newArr.length; i++) {
					
					if(i<arr.length) { //인덱스의 크기가 기존배열보다 작은 경우 
						newArr[i]= arr[i]; //기존 배열 요소 값 복사 
					}else {//인덱스 크기가 기존 배열보다 클 경우 새로운 입력 받기 
						System.out.println((i+1)+"번째 문자열: ");
						newArr[i]=sc.nextLine();
						
					}
				}
				
			//8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 
				arr=newArr;
				
			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않은 경우
				break; //while 반복문 종료 
			} else {// 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}

		}
			//10. 배열 값 모두 출력
		System.out.println(Arrays.toString(arr));
	}
}
