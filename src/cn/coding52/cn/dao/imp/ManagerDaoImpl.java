package cn.coding52.cn.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.coding52.cn.dao.ManagerDao;
import cn.coding52.cn.model.info;
import cn.coding52.cn.util.JDBCUtil;


public class ManagerDaoImpl implements ManagerDao {

	@Override
	public List<info> getBlogByPage(int page,String str) {
		String sql = "select * from info where info like ? ORDER BY shijian DESC limit ?,5";
		PreparedStatement pmst = JDBCUtil.getConncetion(sql);
		List<info> list = new ArrayList<info>();
		try {
			pmst.setString(1, "%"+str+"%");
			pmst.setInt(2, page * 5);

			ResultSet rs = pmst.executeQuery();

			while (rs.next()) {
				int infoid=rs.getInt(1);
				String biaoti=rs.getString(2);
				String neirong=rs.getString(3);
				String shijian=rs.getString(4);
				String zuozhe=rs.getString(5);
				info info=new info(infoid, biaoti, neirong, shijian, zuozhe);
				list.add(info);	
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getCountBlog(String str) {
		String sql = "select count(*) from info where info like ? ";
		PreparedStatement pmst = JDBCUtil.getConncetion(sql);
		int allblog = 0;
		try {
			pmst.setString(1, "%"+str+"%");
			ResultSet rs = pmst.executeQuery();

			while (rs.next()) {
				allblog = rs.getInt(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return allblog;
	}

}
