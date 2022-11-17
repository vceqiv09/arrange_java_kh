package string.exam.phone;

public class Phone {
	
	/**
	 * 전화번호에 사용하는 접두사가 "010" 이 아니면 사용하는 에러코드 입니다.
	 */
	public final static int PREFIX_ERROR = 1;
	
	/**
	 * 전화번호에 사용하는 구분문자가 "-" 이 아니면 사용하는 에러코드 입니다.
	 */
	public final static int DELIMITER_ERROR = 2;
	
	/**
	 * 전화번호에 형식이 잘못 되었을 때 사용하는 에러코드 입니다.
	 */
	public final static int FORMATTING_ERROR = 3;
	
	/**
	 * 전화번호에 숫자가 아닌 문자가 포함된 경우 사용하는 에러코드 입니다.
	 */
	public final static int NUMBER_ERROR = 4;
	
	/**
	 * 전화번호에 길이가 잘못 되었을 때 사용하는 에러코드 입니다. </br>
	 * 전화번호는 구분문자 포함 총 13자리 이며, 2번째 3번째 자리의 번호는 4자리 입니다.
	 */
	public final static int LENGTH_ERROR = 5;
	
	private final String PREFIX_NUMBER = "010";
	private final String DELIMITER = "-";
	private final String HIDDEN_CHAR = "****";
	
	private String number;
	private String[] phoneNumber;
	private boolean invalid = true;
	private int errorCode;
	
	private Phone(String phone) {
		this.errorCode = this.valid(phone);
	}
	
	/**
	 * 생성된 객체에 젖아된 전화번호 형식이 유효하지 않은지 확인하기 위한 메서드</br>
	 * 		true : 올바르지 않은 전화번호(유효하지 않다.)</br>
	 * 		false : 올바른 전화번호(유효하다.)
	 * @return
	 * 	boolean
	 */
	public boolean isInvalid() {
		return this.invalid;
	}
	
	public int reason() {
		return this.errorCode;
	}
	
	public String getNumber() {
		return this.number;
	}
	public String getNumber(boolean hidden) {
		if(hidden) {
			if(!this.invalid) {
				return String.join(DELIMITER, phoneNumber[0], phoneNumber[1], HIDDEN_CHAR);
			}
		}
		return null;
	}
	
	private int valid(String phone) {
		if(!phone.startsWith(PREFIX_NUMBER)) {
			return Phone.PREFIX_ERROR;
		}
		if(phone.length() != 13) {
			return Phone.LENGTH_ERROR;
		}
		
		if(phone.split(DELIMITER).length != 3) {
			return Phone.FORMATTING_ERROR;
		}
		
		String phoneArr[] = phone.split(DELIMITER);
		for(int i=1; i<phoneArr.length; i++) {
			for(int j=0; j<phoneArr[i].length(); j++) {
				if(!(phoneArr[i].charAt(j) >= '0' && phoneArr[i].charAt(j) <= '9')) {
					return Phone.NUMBER_ERROR;
				}
			}
		}
		
		for(int i=1; i<phoneArr.length; i++) {
			if(phoneArr[i].length() != 4) {
				return Phone.LENGTH_ERROR;
			}
		}
		this.number = phone;
		this.phoneNumber = phoneArr;
		this.invalid = false;
		
		return 0;
	}
	
	public static Phone valueOf(String phone) {
		return new Phone(phone);
	}
	
}