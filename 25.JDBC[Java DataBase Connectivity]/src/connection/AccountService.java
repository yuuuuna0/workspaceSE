package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.address.DataSource_Scott;

public class AccountService {
	private DataSource_Scott dataSource;
	public AccountService() {
		dataSource=new DataSource_Scott();
	}
	//모든계좌의 잔고 balance만큼 갱신
	public void updateBalance(int balance) {
		boolean exceptionCondition=true;
		Connection con=null;
		PreparedStatement pstmt=null;
		String updateSql="update accounta set acc_balance=acc_balance+? where acc_no=?";
		try {
			con=dataSource.getConnection();			//<-----롤백해서 오는 위치
			System.out.println("--------updateBalance transaction start----------");
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(updateSql);
			
			/****************10000번 계좌 update*************/
			int acc_no=10000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			int rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			/****************20000번 계좌 update*************/
			acc_no=20000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			/****************30000번 계좌 update*************/
			acc_no=30000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			/**예외발생***/
			int rn=(int)(Math.random()*2);
			if(rn%2==0) {
				exceptionCondition=true;
			}else {
				exceptionCondition=false;
			}
			
			if(exceptionCondition) {
				throw new Exception("모든계좌잔고갱신예외발생");
			}
			/****************40000번 계좌 update*************/
			acc_no=40000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			/****************50000번 계좌 update*************/
			acc_no=50000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			/****************60000번 계좌 update*************/
			acc_no=60000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount=pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+"행 update");
			
			System.out.println("------updateBalance transaction end[commit]----------");
			con.commit();
			
		} catch (Exception e) {
			System.err.println("99.예외발생: "+e.getMessage());
			System.out.println("------updateBalance transaction end[rollback]----------");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			/*
			 * exception 발생 유무와 관계없이 항상 실행
			 * 		-리소스 해지
			 */
			try {
				pstmt.close();
				dataSource.close(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
