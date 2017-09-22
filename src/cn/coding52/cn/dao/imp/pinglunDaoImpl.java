package cn.coding52.cn.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.coding52.cn.dao.pinglunDao;
import cn.coding52.cn.model.pinglun;
import cn.coding52.cn.util.JDBCUtil;

public class pinglunDaoImpl implements pinglunDao{
	PreparedStatement psmt;
	@Override
	public void addPl(pinglun pl) {
		String sql = "insert into pinglun(content) values(?)";
		psmt = JDBCUtil.getConncetion(sql);
		try {
			psmt.setString(1, pl.getContent());

			psmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		
	}

	@Override
	public List<pinglun> getAllPl() {
		String sql = "select * from pl";
		psmt = JDBCUtil.getConncetion(sql);
		List<pinglun> list = new ArrayList<pinglun>();
		try {
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String content = rs.getString(2);

				pinglun plLun = new pinglun(id, content);
				list.add(plLun);
			}

		} catch (Exception e) {

		}
		return list;
	}
	}


