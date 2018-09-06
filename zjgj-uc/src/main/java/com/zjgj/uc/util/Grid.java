package com.zjgj.uc.util;
import java.util.ArrayList;
import java.util.List;

public class Grid<T> implements java.io.Serializable {

	private static final long serialVersionUID = -6788783393618677964L;
	private Integer total = 0;
	private List<T> rows = new ArrayList<T>();
	private List<T> footer = new ArrayList<T>();

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public List<T> getFooter() {
		return footer;
	}

	public void setFooter(List<T> footer) {
		this.footer = footer;
	}

}
