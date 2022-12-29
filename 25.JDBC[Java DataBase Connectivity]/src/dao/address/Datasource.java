package dao.address;
/*
 * 데이터베이스 설정정보를 사용해서 
 * Connection 객체를 생성하고, 해지하는 역할을 하는 클래스
 * (Dao 객체들이 사용하는 객체)
 */
public class Datasource {
	private String driverClass="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="tiger";
	/*
	 * Connection 객체를 생성해서 반환하는 메쏘드
	 */
	public void getConnection() {
		
	}
	/*
	 * Connection 객체를 close하는 메쏘드
	 */
	public void close() {
		
	}
	
	
}
