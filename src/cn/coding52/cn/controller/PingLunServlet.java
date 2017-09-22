package cn.coding52.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.coding52.cn.dao.imp.pinglunDaoImpl;
import cn.coding52.cn.model.pinglun;

public class PingLunServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 解决请求和响应的乱码问题
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");

				String content = request.getParameter("content");
				pinglun pl = new pinglun(content);
				
				// 先把评论插入到数据库
				new pinglunDaoImpl().addPl(pl);

				// 再把所有的评论给查询出来

				List<pinglun> list = new pinglunDaoImpl().getAllPl();

				PrintWriter pw = response.getWriter();

				pw.print(list);//requset.setattribute("ll",list);
				pw.flush();
				pw.close();
			}

		
	}

