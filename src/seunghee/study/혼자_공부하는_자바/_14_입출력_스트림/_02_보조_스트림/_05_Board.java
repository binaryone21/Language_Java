package seunghee.study.혼자_공부하는_자바._14_입출력_스트림._02_보조_스트림;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class _05_Board implements Serializable {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public _05_Board(int bno, String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
