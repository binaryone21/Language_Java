package seunghee._혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _05_ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<_05_Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy=MM-dd");
		for(_05_Board board : list) {
			System.out.println(
					board.getBno() + "\t" +
					board.getTitle() + "\t" +
					board.getContent() + "\t" +
					board.getWriter() + "\t" +
					sdf.format(board.getDate()));
		}
	}
		
	public static void writeList() throws Exception {
		List<_05_Board> list = new ArrayList<>();
		
		list.add(new _05_Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new _05_Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new _05_Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		list.add(new _05_Board(4, "제목4", "내용4", "글쓴이4", new Date()));
		
		FileOutputStream fos = new FileOutputStream(_00_FilePath.path + "/05_text.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<_05_Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream(_00_FilePath.path + "/05_text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<_05_Board> list = (List<_05_Board>) ois.readObject();
		ois.close();
		return list;
	}
}
