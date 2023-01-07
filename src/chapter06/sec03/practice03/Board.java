package chapter06.sec03.practice03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title,content,"로그인한 회원아이디","현재컴퓨터 날짜",0);
	}
	Board(String title,String content,String writer){
		this(title,content,writer,"현재컴퓨터 날짜",0);
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
/* 4번
 * Board board1 = new Board("타이틀","콘텐츠");
 * Board board2 = new Board("타이틀","콘텐츠","길동");
 * Board board3 = new Board("타이틀","콘텐츠","길동","2022-06-20");
 * Board board4 = new Board("타이틀","콘텐츠","길동","2022-06-20",0);
 * 
 */
