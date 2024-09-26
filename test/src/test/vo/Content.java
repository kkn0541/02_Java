package test.vo;

public class Content {
	private String content;
	private String date;

	public Content() {
		// TODO Auto-generated constructor stub
	}

	public Content(String content, String date) {
		super();
		this.content = content;
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "content : " + content + "  ,   " + "date :" + date;
	}
}