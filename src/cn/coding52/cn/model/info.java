package cn.coding52.cn.model;

public class info {
	private int infoid;
	private String biaoti;
	private String neirong;
	private String shijian;
	private String zuozhe;
	public int getInfoid() {
		return infoid;
	}
	public void setInfoid(int infoid) {
		this.infoid = infoid;
	}
	public String getBiaoti() {
		return biaoti;
	}
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	public info(String biaoti,String neirong,String shijian,String zuozhe){
		this.biaoti=biaoti;
		this.neirong=neirong;
		this.shijian=shijian;
		this.zuozhe=zuozhe;
	}
	public info(int infoid, String biaoti, String neirong, String shijian,
			String zuozhe) {
		super();
		this.infoid = infoid;
		this.biaoti = biaoti;
		this.neirong = neirong;
		this.shijian = shijian;
		this.zuozhe = zuozhe;
	}
	
	

}
