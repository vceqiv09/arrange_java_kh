package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collectoin_List_1101 {

	public static void main(String[] args) {
		/*
		 * List 계열 컬렉션 (배열이랑 거의 유사, 더 유용)
		 * 		- 데이터를 순차적으로 나열한 자료구조로 되어 있으며, 인덱스로 관리를 한다.
		 * 		- 중복 데이터 저장이 가능하다.
		 * 		- 구현 클래스로는 ArrayList, Vector, LinkedList 가 있다.
		 * 
		 * ArrayList
		 * 		- List 의 구현체로 초기 저장 용량 10에서 데이터가 추가/삭제 될때마다
		 * 		  자동으로 늘어나면서 데이터를 관리한다.
		 * 		- Thread Safe 기능을 제공하지 않는다.
		 * 
		 * Vector
		 * 		- ArrayList 와 동일하며, Thread Safe 기능을 제공한다.
		 * 
		 * LinkedList
		 * 		- 특정 위치에 데이터를 추가하거나 제거를 하면 앞/뒤 노드의 링크 정보만 변경하는
		 * 		  형태로 동작하며 이로 인해 빈번한 데이터의 추가/수정에 가장 우수한 성능을 가지는
		 * 		  List 컬렉션이다.
		 */
		
		// 제네릭 타입(= <>) : 객체에서 사용할 일반 객체 타입을 지정하기 위해 쓰임.
		// int 같은 기본자료형은 안된다. 객체로 써야한다.
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		// add() : 데이터 추가
		aList.add(Integer.valueOf(10));	aList.add(Integer.valueOf(20));
		aList.add(Integer.valueOf(30));	aList.add(Integer.valueOf(40));
		System.out.println(aList);
		
		aList.add(2, Integer.valueOf(25));
		System.out.println(aList);
		
		// set() : 데이터 수정
		aList.set(4, 45);
		System.out.println(aList);
		
		// remove() : 데이터 삭제
		aList.remove(3);
		System.out.println(aList);
		
		aList.remove(Integer.valueOf(25));
		System.out.println(aList);
		
		// get() : 데이터 추출
		Integer i = aList.get(1);
		System.out.println(i);
		
		// contains() : 데이터 확인
		boolean isExists = aList.contains(Integer.valueOf(45));
		System.out.println(isExists);
		
		// indexOf() : 데이터 확인
		int index = aList.indexOf(Integer.valueOf(45));
		System.out.println("index : "+ index);
		
		// size() : 저장된 데이터 수 확인
		int size = aList.size();
		System.out.println(size +"개의 데이터가 저장되어 있습니다.");
		
		// addAll() : 다른 리스트 계열 컬렉션에 저장된 데이터를 추가
		ArrayList<Integer> bList = new ArrayList<Integer>();
		bList.add(100);	bList.add(120);	bList.add(130);
		bList.add(110);	bList.add(160);	bList.add(150);
		
		aList.addAll(bList);
		System.out.println(aList);
		
		// clear() : 전부 삭제
		bList.clear();
		System.out.println(bList);
		
		// isEmpty() : 리스트 컬렉션에 비어 있는지 확인
		boolean isEmpty = aList.isEmpty();
		System.out.println(isEmpty);
		
		isEmpty = bList.isEmpty();
		System.out.println(isEmpty);
		
		// 전체 탐색
		// foreach 를 사용한 전체 탐색		일괄 데이터 수정, 변경 안된다. 일괄 처리, 작업 불가능.
		for(int n=0; n<aList.size(); n++) {
			System.out.print(aList.get(n) +"\t");
		}
		System.out.println();
		
		for(Integer n: aList) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		// subList() : 리스트 일부만 잘라서 새로 만들기
		ArrayList<Integer> subList = new ArrayList<Integer>(aList.subList(3, 7));
		System.out.println(aList);
		System.out.println(subList);
		
		// toArray() : 리스트를 Object 배열로 반환
		Object[] objArr = aList.toArray();
		for(int n=0; n<objArr.length; n++) {
//			System.out.print(objArr[n] +"\t");
			Integer num = (Integer)objArr[n];
			System.out.print(num +"\t");
		}
		System.out.println();
		
		// 리스트에 저장된 객체 타입에 맞추어 배열로 반환
		Integer[] iArr = aList.toArray(new Integer[aList.size()]);
		for(int n=0; n<objArr.length; n++) {
			System.out.print(iArr[n] +"\t");
		}
		System.out.println();
		
		
		// Collections.reverse() : 뒤집기
		Collections.reverse(aList);
		System.out.println(aList);
		
		// sort() : 정렬(오름차순)
		Collections.sort(aList);
		System.out.println(aList);
		
		// sort() + reverse() : 정렬(내림차순)
		Collections.sort(aList);
		Collections.reverse(aList);
		System.out.println(aList);
		
		
		// 사용자 정의 객체를 리스트에 사용
		ArrayList<Subject> sList = new ArrayList<Subject>();
		
		sList.add(new Subject("국어", 78));
		sList.add(new Subject("영어", 45));
		sList.add(new Subject("수학", 87));
		sList.add(new Subject("과학", 90));
		System.out.println(sList);
		
		// Subject.compareTo() -> implements Comparable<Subject> 해야한다.
		// 여기서 return 1이냐 -1이냐로 오름차순 내림차순 가능, reverse 로도 가능
		
		Collections.sort(sList);
		System.out.println(sList);
		Collections.reverse(sList);
		System.out.println(sList);
		
		// 다형성 적용
		// 리스트 계열의 컬렉션들이기 때문에 동일한 기능 지원
		// 내부 동작은 다름.
		List<Integer> cList = new ArrayList<Integer>();
		cList = new Vector<Integer>();
		cList = new LinkedList<Integer>();
		
	}

}