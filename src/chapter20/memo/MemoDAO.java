package chapter20.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

//Data Access Object: 직접 데이터베이스에 접속해서 테이터 처리 
public class MemoDAO {
	public List<MemoVO> selectList() throws Exception{
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc06","java");
		Statement stat = conn.createStatement();
		// 문자열 결합
		// 1. + 기호로 문자열 결합
		// 2. StringBuilder(StringBuffer)로 문자열 결합 : 속도가 빠르다
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");                 //alt + shift + a
		builder.append("    id, ");
		builder.append("    title, ");
		builder.append("    contents, ");
		builder.append("    register_date, ");
		builder.append("    modify_date ");
		builder.append("FROM ");
		builder.append("    memo ");
		String sql = builder.toString();
		
		ResultSet rs = stat.executeQuery(sql);
		//결과가: 0 ~ 무한대  -> flux
		List<MemoVO> list = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString(2);
			String contents = rs.getString("contents");
			Date register_date = rs.getDate(4);
			Date modify_date = rs.getDate(5);
			list.add(new MemoVO(id, title, contents, register_date, modify_date));
			
		}
		rs.close();
		stat.close();
		conn.close();
		return list;
	}
	public MemoVO selectOne(int serchId) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc06","java");
		Statement stat = conn.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");                 //alt + shift + a
		builder.append("    id, ");
		builder.append("    title, ");
		builder.append("    contents, ");
		builder.append("    register_date, ");
		builder.append("    modify_date ");
		builder.append("FROM ");
		builder.append("    memo ");
		builder.append("WHERE ");
		builder.append("    id =" + serchId);
		String sql = builder.toString();
		
		ResultSet rs = stat.executeQuery(sql);
		// 결과가 0 or 1 -> Mono
		MemoVO vo = null;
		if(rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString(2);
			String contents = rs.getString("contents");
			Date register_date = rs.getDate(4);
			Date modify_date = rs.getDate(5);
			vo = new MemoVO(id, title, contents, register_date, modify_date);
		}
		rs.close();
		stat.close();
		conn.close();
		return vo;
	}
	public int insertMemo(MemoVO vo) throws Exception {		//DB에서 sysdate 타입일경우 insert value 값을 넣지 않아도 된다.
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc06","java");
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo (  ");
		builder.append("    id, ");
		builder.append("    title, ");
		builder.append("    contents ");
		builder.append(") VALUES ( ");
		builder.append("    memo_seq.nextval, ");
		builder.append("    ?, ");
		builder.append("    ? ");
		builder.append(") ");
		String sql = builder.toString();
		System.out.println(sql);
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContents());
		// insert, update, delete 가 모두 executeUpdate()메소드 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		conn.close();
		
		return executeUpdate;
	}
	public int updateMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc06","java");
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE memo ");
		builder.append("    SET ");
		builder.append("        title = ?, ");
		builder.append("        contents = ?, ");
		builder.append("        modify_date = SYSDATE ");
		builder.append("WHERE ");
		builder.append("    id = ? ");
		String sql = builder.toString();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContents());
		statement.setInt(3, vo.getId());
		// insert, update, delete 가 모두 executeUpdate()메소드 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		conn.close();
		
		return executeUpdate;
	}
	public int deleteMemo(int deleteId) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pc06","java");
		StringBuilder builder = new StringBuilder();
		builder.append("DELETE FROM ");
		builder.append("   memo ");
		builder.append("   WHERE ");
		builder.append("    id = ? ");
		String sql = builder.toString();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, deleteId);
		// insert, update, delete 가 모두 executeUpdate()메소드 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		conn.close();
		return executeUpdate;
	}
}
