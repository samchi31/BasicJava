package memo;

import java.sql.Date;

// 얻은 데이터를 담는 클래스
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Date registerDate;
	private Date modifyDate;
	
	public MemoVO() {
	}

	public MemoVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public MemoVO(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public MemoVO(int no, String title, String content, String writer, Date registerDate, Date modifyDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
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


	public Date getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}


	public Date getModifyDate() {
		return modifyDate;
	}


	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", no,
				title, content, writer, registerDate, modifyDate);
	}
	
	
	
}
