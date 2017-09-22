package cn.coding52.cn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/system/usercheck")
public class UserCheckServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        //�����ַ����뼯
        request.setCharacterEncoding("utf-8");
        //ģ��������ݿ�������˺�
        String[] arr={"����","����","����","admin","С��"};
        //��ȡǰ̨����������
        String account=request.getParameter("account");
        
        //ģ������ݿ��������Ϣƥ��
        boolean mark=false;
        boolean mark1=false;
        for(String user:arr){
            if(user.equals(account)){
                mark=true;
                break;
            }
            if ("".equals(account)) {
            	mark1=true;
			}
        }
        
        //��Ӧǰ̨
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        if(mark){
            out.println("<font color='red'>���ʺ��Ѿ����ڣ�����������!</font>");
        }else if (mark1) {
        	out.println("<font color='red'>�˺Ų���Ϊ�գ�</font>");
		}
        else{
            out.println("<font color='green'>��ϲ�������ʺſ���ʹ��!</font>");
        }
        out.flush();//ˢ����
        out.close();//�ر���
        
    }
    
    
}