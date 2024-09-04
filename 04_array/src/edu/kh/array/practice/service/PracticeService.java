package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int sum = 0;
		int arr[] = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			if (i % 2 == 0 || i == 0) {
				sum += arr[i];
			}
			System.out.print(arr[i]);
		}

		System.out.println("짝수 번째 인덱스 합:" + sum);
	}

	public void practice2() {

		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			// 반복문 9부터 시작 x
			// 배열 0번째 값에 arr 길이에 - i 한 값 들어옴
			arr[i] = arr.length - i;

			System.out.print(arr[i] + " ");

			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합:" + sum);

	}

	public void practice3() {
		System.out.println("양의정수 ");
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int i = 0; i < input; i++) {
			arr[i] = i + 1;
		}

		System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
		int count = 0;
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력" + i);
			int input = sc.nextInt();
			arr[i] = input;
		}

		System.out.println("검색할 값 : ");
		int input1 = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (input1 == arr[i]) {
				count++;
				System.out.println("인덱스 " + count);
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {

		// 배열 내에서 위치 찾기 모르겟음
		String input = sc.next();
		char[] arr = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);

		}
		int count = 0;

		System.out.println("검색할 문자 입력");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {

				count++;

			}
		}
		System.out.println("count개수" + count);

	}

	public void practice6() {
		System.out.println("정수");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d 번째 인덱스에 넣을 값", i);
			int input1 = sc.nextInt();
			sum += input1;
			arr[i] = input1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 " + sum);
	}

	public void practice7() {
		System.out.println("주민등록번호(-포함)");
		String input = sc.next();
		char[] arr = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 8; i < arr.length; i++) {
			arr[i] = '*';
		}
		System.out.println(arr);
	}

	public void practice8() {
		
	}

	public void practice9() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

		}
		System.out.println("발생한 난수" + Arrays.toString(arr));
	}

	public void practice10() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

		}
		System.out.print("발생한 난수" + Arrays.toString(arr));

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
				System.out.println("발생한 난수" + Arrays.toString(arr));
			}
		}
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);

	}

	public void practice11() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void practice12() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1);

			lotto[i] = random;

			for (int x = 0; x < i; x++) {
				if (random == lotto[x]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	public void practice13() {
		System.out.println("단어입력");
		String input = sc.next();
		char[] arr = new char[input.length()];
		int count=0;
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.print("\n");
		System.out.println("문자개수"+count);
	}
}