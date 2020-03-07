package com.huayun.model;
/**
 * 应用表
 *
 */
public class App {

	private Long id;		//主键
	private String name;	//应用名称
	private String describe;//应用系统描述
	private String leader;	//应用负责人
	private String contact;	//负责人联系方式
	private String unit;	//应用厂商
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "App [id=" + id + ", name=" + name + ", describe=" + describe + ", leader=" + leader + ", contact="
				+ contact + ", unit=" + unit + "]";
	}
	public App(Long id, String name, String describe, String leader, String contact, String unit) {
		super();
		this.id = id;
		this.name = name;
		this.describe = describe;
		this.leader = leader;
		this.contact = contact;
		this.unit = unit;
	}
	public App() {
		super();
	}
	
	
}

