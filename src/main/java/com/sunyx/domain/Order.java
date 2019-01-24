package com.sunyx.domain;

import java.util.Date;

public class Order {
	private Integer id;

	private Integer userId;

	private String numbers;

	private Date createtime;

	private String note;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers == null ? null : numbers.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", numbers=" + numbers + ", createtime=" + createtime
				+ ", note=" + note + "]";
	}

}