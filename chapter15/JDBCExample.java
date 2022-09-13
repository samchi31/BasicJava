package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCExample {
	public static void main(String[] args) throws Exception {
		//new OracleDriver()
		
		// 0. 드라이버 로딩 (리플렉션 기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 1. db 접속(서버주소, 아이디, 패스워드)	서버주소:jdbc:oracle:thin@localhost:1521:xe
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "in89", "java");
		
		// 2. 연결된 db에 요철할 쿼리 작성
		Statement statement = connection.createStatement(); // 워크시트 생성
		String sql = ""; 		// sql 작성
		sql+=" SELECT";				
		sql+="     mem_id,";
		sql+="     mem_name,";
		sql+="     mem_hp,";
		sql+="     mem_mail";
		sql+=" FROM";				
		sql+="     member";
		// "select mem_id, mem_name, mem_hp, mem_mail from member";	
		// alt+shift+a 로 여러줄 복사
		// 앞이나 뒤에 공백이 없으면 error 발생 (문자열을 연결하면 명령어 인식 안됨)
		
		// 3. 쿼리 실행
		ResultSet resultSet = statement.executeQuery(sql); 
		// executeQuery : select => 결과 집합을 반환
		// executeUpdate : insert, update, delete => 실행된 개수 반환		
		
		// 4. 실행 결과 받기
		while (resultSet.next()) {	// Set.hasNext()와 같다
			String memId = resultSet.getString(/*컬럼명*/ "mem_id");	// 인덱스를 매개변수로 가능하지만 인덱스는 변하는 값이라서 비추
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			
			System.out.printf("%s\t%s\t%s\t%s\n",memId,memName,memHp,memMail);
		}
		
		// 5. 접속 종료 (자원 반납)
		resultSet.close();
		statement.close();
		connection.close();
	}
}
