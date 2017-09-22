package cn.coding52.cn.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.test.StaticFunctionTests;
import org.omg.CORBA.PUBLIC_MEMBER;

import cn.coding52.cn.dao.imp.ManagerDaoImpl;
import cn.coding52.cn.model.info;



public class searchSevelt extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static String record = "";//来保存搜索框的值
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Searchstr = request.getParameter("wd");
		//第一次表单提交肯定能取到值
				if (request.getParameter("wd") != null) {
					record = Searchstr;
				} else {
					//点击下一页的时候把记录值保存起来
					Searchstr = record;

				}
		int count = 0;
		// 查询出来的总数
		int number = new ManagerDaoImpl().getCountBlog(Searchstr);

		if (number % 5 == 0) {
			count = number / 5;//总数为偶数时
		} else {
			count = number /5 + 1;//总数为奇数时
		}
		int page;
		if (request.getParameter("page") == null) {
			page = 0;// 默认的页码数为零
		} else {
			page = Integer.parseInt(request.getParameter("page"));
			//判断是上一页和下一页
			if (request.getParameter("type")!=null) {
				if (request.getParameter("type").equals("pre")) {
					page--;
					if (page <= 0) {
						page = 0;
					}
				}else if (request.getParameter("type").equals("next")) {
					++page;
					if (page >= (count-1)) {
						page = count-1;
					}
				}
				
			}
			
			 

		}

		List<info> list = new ManagerDaoImpl().getBlogByPage(page,Searchstr);
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("page", page);

		request.getRequestDispatcher("info.jsp").forward(request,response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
	}

}
