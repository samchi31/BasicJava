package memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

// Database Access Object
public class MemoDAO {
//	// 값 확인하기
//	public static void main(String[] args) throws Exception {
//		MemoDAO dao = new MemoDAO();
//		List<MemoVO> list = dao.getMemos();
//		System.out.println(list.size());
//	}

	public List<MemoVO> getMemos() throws Exception {
		// 0. 드라이버 로딩
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver()); // 드라이버를 로딩

		// 1. 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");

		// 2. 쿼리 작성
		Statement statement = connection.createStatement();
		// String vs StringBuilder vs StringBuffer(Thread Safe) 문자열 합치기 성능차이
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     no,");
		builder.append("     title,");
		builder.append("     content,");
		builder.append("     writer,");
		builder.append("     register_date,");
		builder.append("     modify_date");
		builder.append(" FROM");
		builder.append("     memo");
		String sql = builder.toString();

		// 3. 쿼리 전송
		ResultSet resultSet = statement.executeQuery(sql);

		// 4. 결과 정리
		// 저장할 리스트
		List<MemoVO> list = new ArrayList<>();
		while (resultSet.next()) {
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");

			// MemoVO에 저장 후 리스트 추가
			list.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
		}

		// 5. 자원 반납
		resultSet.close();
		statement.close();
		connection.close();

		return list;
	}
	
	public MemoVO getMemo(int searchNo) throws Exception {
		// 0. 드라이버 로딩
		DriverManager.registerDriver(new OracleDriver()); // 드라이버를 로딩

		// 1. 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");

		// 2. 쿼리 작성		
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT");
		builder.append("     no,");
		builder.append("     title,");
		builder.append("     content,");
		builder.append("     writer,");
		builder.append("     register_date,");
		builder.append("     modify_date");
		builder.append(" FROM");
		builder.append("     memo");
		builder.append(" WHERE");
		builder.append("     no = ?");		
		String sql = builder.toString();

		// 3. 준비된 쿼리에 데이터 입력
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1,  searchNo); 
		
		ResultSet resultSet = statement.executeQuery();
		
		MemoVO memoVO = null;
		if(resultSet.next()) {
			memoVO = new MemoVO(
					resultSet.getInt("no"),
					resultSet.getString("title"), 
					resultSet.getString("content"), 
					resultSet.getString("writer"), 
					resultSet.getDate("register_date"), 
					resultSet.getDate("modify_date"));
		}
		
		// 4. 자원 반납
		resultSet.close();
		statement.close();
		connection.close();
		return memoVO;
	}

	public int insertMemo(MemoVO vo) throws Exception {
		// 0. 드라이버 로딩
		DriverManager.registerDriver(new OracleDriver()); // 드라이버를 로딩

		// 1. 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");

		// 2. 쿼리 작성
		Statement statement = connection.createStatement();
		
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo ( ");
		builder.append("    no, ");
		builder.append("    title, ");
		builder.append("    content, ");
		builder.append("    writer ");
		builder.append(") VALUES ( ");
		builder.append("    seq_memo.NEXTVAL, ");
		builder.append(String.format("    '%s', ", vo.getTitle()));
		builder.append("    '"+vo.getContent()+"', ");
		builder.append("    '"+vo.getWriter()+"' ");
		builder.append(") ");
		
		String sql = builder.toString();

		// 3. 쿼리 전송
		int result = statement.executeUpdate(sql);

		// 4. 자원 반납
		statement.close();
		connection.close();
		return result;
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		// 0. 드라이버 로딩
		DriverManager.registerDriver(new OracleDriver()); // 드라이버를 로딩

		// 1. 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");

		// 2. 쿼리 작성
		
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE memo ");
		builder.append("    SET ");
		builder.append("        title = ?, ");
		builder.append("        content = ?, ");
		builder.append("        writer = ?, ");
		builder.append("        modify_date = sysdate ");
		builder.append("WHERE ");
		builder.append("    no = ? ");
		
		String sql = builder.toString();

		// 3. 준비된 쿼리에 데이터 입력
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1,  vo.getTitle()); 		// 첫번째 ? 에 대입
		statement.setString(2,  vo.getContent()); 
		statement.setString(3,  vo.getWriter()); 
		statement.setInt(4,  vo.getNo()); 
		
		int result = statement.executeUpdate();
		
		// 4. 자원 반납
		statement.close();
		connection.close();
		return result;
	}
	
	public int deleteMemo(int deleteIndex) throws Exception {
		// 0. 드라이버 로딩
		DriverManager.registerDriver(new OracleDriver()); // 드라이버를 로딩

		// 1. 접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");

		// 2. 쿼리 작성
		
		StringBuilder builder = new StringBuilder();
		builder.append("DELETE FROM memo WHERE ");
		builder.append("    no = ? ");
		
		String sql = builder.toString();

		// 3. 준비된 쿼리에 데이터 입력
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1,  deleteIndex); 
		
		int result = statement.executeUpdate();
		
		// 4. 자원 반납
		statement.close();
		connection.close();
		return result;
	}
}
