package chapter06.sec03.practice03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title,content,"�α����� ȸ�����̵�","������ǻ�� ��¥",0);
	}
	Board(String title,String content,String writer){
		this(title,content,writer,"������ǻ�� ��¥",0);
	}
	Board(String title,String content,String writer,String date){
		this(title,content,writer,date,0);
	}
	Board(String title,String content,String writer,String date,int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
/* 4��
 * Board board1 = new Board("Ÿ��Ʋ","������");
 * Board board2 = new Board("Ÿ��Ʋ","������","�浿");
 * Board board3 = new Board("Ÿ��Ʋ","������","�浿","2022-06-20");
 * Board board4 = new Board("Ÿ��Ʋ","������","�浿","2022-06-20",0);
 * 
 */
