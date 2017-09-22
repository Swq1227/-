package cn.coding52.cn.dao;

import java.util.List;

import cn.coding52.cn.model.info;



public interface ManagerDao {
	
	/**
	 * 
	 * @param page
	 * @return
	 */
	public List<info> getBlogByPage(int page,String str);
	/**
	 * 
	 * @return
	 */
	public int getCountBlog(String str);

}
