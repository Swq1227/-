package cn.coding52.cn.model;

public class pinglun {
	private int id;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public pinglun(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public pinglun(String content) {
		super();
		this.content = content;
	}
	
	

}
