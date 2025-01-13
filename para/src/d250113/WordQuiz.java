package d250113;

import java.util.Vector;

public class WordQuiz {
	private Vector<Word> v;
	private String name;

	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("\"영어테스트\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("\"현재 17개의 단어가 들어 있습니다.");
		while(true) {
			
		}
	}
}
