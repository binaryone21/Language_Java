package seunghee.study.혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

import java.util.List;
import java.util.Vector;

public class _02_VectorExample {
	public static void main(String[] args) {
		List<_02_Board> list = new Vector<_02_Board>();
		
		list.add(new _02_Board("제목1", "내용1", "글쓴이1"));
		list.add(new _02_Board("제목2", "내용2", "글쓴이2"));
		list.add(new _02_Board("제목3", "내용3", "글쓴이3"));
		list.add(new _02_Board("제목4", "내용4", "글쓴이4"));
		list.add(new _02_Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			_02_Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
