package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.student;
import utils.BaseDao;

public class StudentDao extends BaseDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public List<student> getShow() {
		List<student> stu=new ArrayList<student>();
		
		try {
			conn=getConnection();
			String sql="SELECT* FROM student";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				student st=new student(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getInt(4), rs.getString(5));
				stu.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stu;
	}

	
}
