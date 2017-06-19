package co.artsoft.arqui.migrania.entity;

public class TestJson {

	private long id=0;
	private String content=null;
	
	
	public void setId(long id){
		this.id = id;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "TestJson [id=" + id + ", content=" + content + "]";
	}
	
}
