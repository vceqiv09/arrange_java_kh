package object.exam.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	private int round;
	private int arr[];
	private int bonus;
	
	Random rand = new Random();
	
	public Lotto(int round){
		this.arr = new int[7];
		this.round = round;
	}
	
	public int getRound() {
		return this.round;
	}
	
	public void createLotto() {
		for(int i=0; i<this.arr.length; i++) {
			int random = rand.nextInt(46)+1;
			this.arr[i] = random;
			
			for(int j=0; j<i; j++) {
				if(this.arr[j] == random) {
					i--;
					break;
				}
			}
		}
		this.bonus = this.arr[6];
	}
	
	public String getArr() {
		String lotto = "";
		for(int i=0; i<this.arr.length-1; i++) {
			lotto += this.arr[i] +"\t";
		}
		lotto += "보너스 : "+ this.arr[6];
		
		return lotto;
	}
	
}