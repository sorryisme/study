package kosta_java.ex0913.homwork;

import java.util.ArrayList;
import java.util.Random;
/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : 로또
 */
public class Lotto extends ArrayList<Integer>{
	Lotto(){
		super(6);
	}
	
	
	void addLotto(){
		Random r = new Random();

		do {
			int result = r.nextInt(45)+1;
			if(!check(result)) {
				super.add(result);
			}
		} while(super.size() < 6);
	}
	
	boolean check(int checkNum) {
		return super.contains(checkNum);
	}
	
	void print() {
		for(Integer i : this) {
			System.out.println(i);
		}
	}
	
	void sorting() {
		int tmp = 0;
		for(int i = 0; i <this.size(); i++) {
			for(int j = (i+1); j < this.size(); j++) {
				if(this.get(i) > this.get(j)) {
					tmp = this.get(i);
					this.set(i, this.get(j));
					this.set(j, tmp);
				}
			}
		}
	}
}

