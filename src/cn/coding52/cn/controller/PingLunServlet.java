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
		// ����������Ӧ����������
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");

				String content = request.getParameter("content");
				pinglun pl = new pinglun(content);
				
				// �Ȱ����۲��뵽���ݿ�
				new pinglunDaoImpl().addPl(pl);

				// �ٰ����е����۸���ѯ����

				List<pinglun> list = new pinglunDaoImpl().getAllPl();

				PrintWriter pw = response.getWriter();

				pw.print(list);//requset.setattribute("ll",list);
				pw.flush();
				pw.close();
			}

		
	}

