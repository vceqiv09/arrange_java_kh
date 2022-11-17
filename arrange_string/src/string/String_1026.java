package string;

import java.util.Arrays;
import java.util.stream.Stream;

public class String_1026 {
	
	public static void main(String[] args) {
		/*
		 * String 관련 클래스
		 * 		- String : 문자열 클래스로 문자열 데이터를 다루기 위해 사용한다.
		 * 				   수정 불가능(불변타입)으로 데이터 수정 시 원본 데이터를 복사하여
		 * 				   새로운 문자열 데이터로 만드는 형식으로 사용 되었던 것.
		 * 
		 * 		- StringBuilder : 문자열 클래스로 String 의 불변타입을 변경가능으로 
		 * 						  사용할 수 있게 만들어진 클래스.
		 * 						  Thread Safe 기능을 제공하지 않음.
		 * 		
		 * 		- StringBuffer : StringBuilder 클래스와 동일한 기능을 제공
		 * 						 차이는 Thread Safe 기능을 제공.
		 * 	* Thread Safe(method synchronizes on) 기능은 멀티쓰레드 작업에 활용할 때 공유 자원에 대한 
		 * 	  안정성을 높여 주기 위해 사용하는 기능. 그래서 성능은 떨어진다.
		 */
		
		// 문자열 생성 방법
		String str1 = "문자열";
		String str2 = new String("문자열");
		String str3 = new String(new char[] { '문', '자', '열' });
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// charAt() : 문자열에서 매개변수로 전달한 정수값의 위치에 해당하는 문자를 char 형으로 반환하는 메서드.
		// str.length() : 배열에서 사용한 length(변수, 속성)이라는 다르다.
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			System.out.print(ch +" ");
		}
		System.out.println();
		
		// codePointAt() : 문자열에서 매개변수로 전달한 정수값의 위치에 해당하는 문자의 문자코드를 반환하는 메서드.
		System.out.println();
		for(int i=0; i<str1.length(); i++) {
			int code = str1.codePointAt(i);
			System.out.println(code +"|"+ (char)code);
		}
		
		// compareTo() : 문자열에서 매개변수로 전달한 문자열과 기준이 되는 문자열의 사전 순을 구분 해주는.
		// compareToIgnoreCase : compareTo() 와 같지만 대소문자 구분을 하지 않는 것.
		// return 값이 양수면 기준이 되는 게 사전 순으로 뒤에 있다.
		//			  음수면 기준이 되는 게 사전 순으로 앞에 있다.
		System.out.println();
		str1 = new String("가");
		str2 = new String("나");
		int compare = str1.compareTo(str2);
		System.out.println(compare);
		
		compare = str2.compareTo(str1);
		System.out.println(compare);
		
		// str1.codePointAt(0) - str2.codePointAt(0) = compare
		System.out.println(str1.codePointAt(0));
		System.out.println(str2.codePointAt(0));
		
		// concat() : 문자열에서 매개변수로 전달한 문자열과 기준이 되는 문자열을 결합해주는 것.
		System.out.println();
		str1 = new String("가");
		str2 = new String("나");
		str3 = str1.concat(str2);
		System.out.println(str3);
		
		// contains() : 문자열에서 매개변수로 전달한 문자열이 기준이 되는 문자열에 포함되어 있는가?
		// 비밀번호 만들 때 영어 대소문자, 숫자, 특수문자 등이 포함되었는가? 이런거 할 때 유용?
		System.out.println();
		str1 = new String("이 메서든는 contains 메서드 예제 입니다.");
		boolean isContains = str1.contains("contains");
		System.out.println(isContains);
		
		isContains = str1.contains("컨테인");
		System.out.println(isContains);
		
		// contentEquals() :  
		// contains()와 다르게 한 문자라도 다르면 false가 반환된다.
		// equals()와 다른 점은 contentEquals 는 StringBuffer 가 사용된다.
		System.out.println();
		str1 = new String("동일한 내용이 있는지 검사하는 메서드");
		boolean isEquals = str1.contentEquals("동일한 내용이 있는지 검사하는 메서드");
		System.out.println(isEquals);
		
		isEquals = str1.contentEquals("동일한 내용이 있는지 검사하는 메서");
		System.out.println(isEquals);
		
		// startsWith(), endsWith()
		//    접두사     ,  접미사
		// 일부만 일치하면 된다. 대소문자 구분함.
		System.out.println();
		str1 = new String("startsWith(), endsWith() 메서드 예제"); 
		boolean isStarts = str1.startsWith("st");					// 접두사 : startsWith()
		boolean isEnds = str1.endsWith("end");						// 접미사 : 예제
		System.out.println(isStarts +"|"+ isEnds);
		
		// toUpperCase(), toLowerCase()
		str2 = str1.toUpperCase();
		System.out.println(str2);
		
		str2 = str1.toLowerCase();
		System.out.println(str2);
		
		// indexOf() : 위치 찾아주는 메서드
		// lastIndexOf() : 
		str1 = new String("indexOf() 메서드 사용 예제로 이 메서드는 특정 문자열의 위치를 알려주는 메서드 입니다.");
		int index = str1.indexOf("메서드");
		System.out.println(index);
		index = str1.indexOf("메서드", 11);
		System.out.println(index);
		index = str1.indexOf("메서드", 24);
		System.out.println(index);
		index = str1.indexOf("메서드", 46);
		System.out.println(index);
		
		
		// 문자열에서 사용자가 지정한 문자열이 몇개 있는지 출력하시오.
		str1 = new String("indexOf() 메서드 사용 예제로 이 메서드는 특정 문자열의 위치를 알려주는 메서드 입니다.");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("찾을 문자 : ");
//		String word = sc.nextLine();
		String word = "메서드";
		
		int count = 0;
		index = 0;
		for(int i=0; i<str1.length(); i++) {
			index = str1.indexOf(word, index);
			if(index != -1) {
				index++;	count++;
			} else
				break;
		}
		System.out.println("str1 문자열에서 "+ word +" 단어는 "+ count +"개 있습니다.");
		
		System.out.println(str1.indexOf((int)'문'));
		
		
		// isBlank() : 공백, 개행도 전부 비어있다고 판단 true 반환
		// isEmpty() : 공백, 개행을 문자가 있다고 판단 false 반환 
		System.out.println();
		str1 = new String("");
		boolean isBlank = str1.isBlank();
		boolean isEmpty = str1.isEmpty();
		System.out.println(isBlank +"|"+ isEmpty);
		
		str1 = new String(" ");
		isBlank = str1.isBlank();
		isEmpty = str1.isEmpty();
		System.out.println(isBlank +"|"+ isEmpty);
		
		str1 = new String("\n");
		isBlank = str1.isBlank();
		isEmpty = str1.isEmpty();
		System.out.println(isBlank +"|"+ isEmpty);
		
		// lines() : 웬만하면 쓰지 마라? 11버전 이후부터 나온 거다. 시스템에 따라 개행 문자는 달라질 수 있다. 얘는 알아서 맞춰준다.
		System.out.println();
		str1 = new String("문자열에\n개행이 있으면\n개행을 기준으로\n분리하는 메서드");
		Stream<String> stream = str1.lines();
		Object objArr[] = stream.toArray();
		
		for(int i=0; i<objArr.length; i++) {
			String s = (String)objArr[i];
			System.out.println(s);
		}
		
		// split() :
		System.out.println();
		String strArr[] = str1.split("\\n");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		str1 = new String("split 메서드는 매개변수로 전달하는 구분문자열을 기준으로 분리하는 메서드.");
		strArr = str1.split(" ");
		System.out.println(Arrays.toString(strArr));
		strArr = str1.split(" ", 3);
		System.out.println(Arrays.toString(strArr));

		// repeat() : 매개변수로 들어온 반복. 11버전 이후부터 나온 거다.
		System.out.println();
		str1 = new String("Hell!");
		str1 = str1.repeat(5);
		System.out.println(str1);
		
		// replace(CharSequence, CharSequence) : CharSequence 이거는 String 이라고 생각해도 된다.
		// replaceAll(String regex, ...) : regex(정규표현식!)
		str1 = new String("문자열의 일부를 변경하기 위한 문자열 메서드 입니다.");
		str2 = str1.replace("문자열", "String");
		System.out.println(str2);
		
		// strip() : 11버전 이후, 문자열의 앞 뒤 공백 모두 제거
		// stripLeading() : 11버전 이후, 문자열의 뒤 공백 제거, 문자열의 앞 공백을 Leading 이라고 한다?
		// stripTrailing() : 11버전 이후, 문자열의 앞 공백 제거, 문자열의 뒤 공백을 Trailing 이라고 한다?
		// trim() : 문자열의 앞 뒤 공백 모두 제거 
		
		str1 = new String("   문자열의 앞 뒤로 존재하는 공백을 제거   ");
		str2 = str1.strip();
		System.out.println("\n|"+ str2 + "|");
		
		str2 = str1.stripLeading();
		System.out.println("|"+ str2 + "|");
		
		str2 = str1.stripTrailing();
		System.out.println("|"+ str2 + "|");
		
		str2 = str1.trim();
		System.out.println("|"+ str2 + "|");
		
		// substring() : 문자열 자르는 메서드
		// substring(index) : index 이후부터 자르기
		// substring(start, end) : start 이상 end 미만 자르기
		System.out.println();
		str1 = new String("문자열 자르기 위한 메서드");
		str2 = str1.substring(4);
		System.out.println(str2);
		
		str2 = str1.substring(8, 10);
		System.out.println(str2);
		
		// String.format() : printf()를 대신할 수 있는 메서드. 
		// printf()는 무조건 출력을 하지만, String.format() 은 무조건 출력하지 않고, 활용을 할 수 있다.
		str1 = String.format("\n%s %d %f", "문자열포멧", 1234, 12.34);
		System.out.println(str1);
		
		// String.join() : 구분문자를 통해 문자열을 구분한다.
		str1 = String.join(", ", "가", "나", "다");
		System.out.println(str1);
		
		// String.valueOf() : 다른 타입을 문자열 타입으로 바꿔주는 거다.
		str1 = String.valueOf(true);
		System.out.println(str1);

		str1 = String.valueOf(10);
		System.out.println(str1);
		
		str1 = String.valueOf(12.34);
		System.out.println(str1);
		
		// 인스턴스를 통해 메서드를 사용하는 것. 인스턴스 메서드
		// str2 = str1.substring(8, 10);
		
		// 클래스를 통해 메서드를 사용하는 것. 클래스 메서드(정적 메서드)
		// 접근제한자 static 반환타입 메서드명() { } 
		// 인스턴스 생성 없이 클래스명을 가지고 메서드를 사용할 수 있다.
		// str1 = String.valueOf(true);
		
	}
	
}	