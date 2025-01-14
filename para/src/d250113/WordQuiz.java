package d250113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {
	private Vector<Word> v;
	private String name;

	public WordQuiz (String name) {
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
		ArrayList<String> awnslist = new ArrayList<>();
		
		
		Random rnd = new Random();
		WordQuiz quiz = new WordQuiz("");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\"영어테스트\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("\"현재 17개의 단어가 들어 있습니다.");
		
		while(true) {
			ArrayList<String> list = new ArrayList<>();

			String menu = "";
			String anws = "";
			int count = 0;
			
			//quiz = new WordQuiz( quiz.v.get(index).getEnglish());

			while(true) {
				int index; 
				while (count == 0 ) {
					boolean cflg = true;
					index = rnd.nextInt(17);

					anws = quiz.v.get(index).getKorean();
					
					for(int i=0;i<awnslist.size();i++) {

						if (awnslist.get(i).equals(anws)) {
							cflg = false;
						} else {
						}

					}
					
					if (cflg) {
						System.out.println(quiz.v.get(index).getEnglish() + "?");
						list.add(anws);
						count++;
					}	
					
				}
				
				for (int i=0;i<list.size();i++) {
					index = rnd.nextInt(17);
					boolean cflg = false;
					
					if (list.get(i).equals(quiz.v.get(index).getKorean())) {
						cflg = true;
					}
										
					if (!cflg) {
						list.add(quiz.v.get(index).getKorean());
						count++;
					}
					
					if (count == 4) { break; }
				}
				
				if (count == 4) { break; }
			}
			
			Collections.shuffle(list);
			
			System.out.println("(1)" + list.get(0) + " (2)" + list.get(1) + " (3)" + list.get(2) + " (4)" + list.get(3) );
			menu = sc.next();
			
			if (list.get(Integer.parseInt(menu)-1).equals(anws)) {
				System.out.println("정답! ! !");
			} else {
				System.out.println("틀렸음 ! !");
			}
			
			awnslist.add(anws);
			
			if (menu.equals(-1) || (awnslist.size() == 17)) {
				System.out.println("\"영어테스트\"를 종료합니다...");
				break;
			}
			
		}
	}




}
