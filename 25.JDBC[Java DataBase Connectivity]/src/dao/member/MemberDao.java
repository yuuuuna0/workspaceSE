package dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() {

	}

	public void insert() throws Exception {

	}

	public void update() throws Exception {
		//update가 여러개면 overloading해서 쓴다.
	}

	public void delete() throws Exception {
		//delete가 여러개면 overloading해서 쓴다.
		//영향받은 행의 수를 반환
		//pk delete
	}

	public void findByPrimaryKey() throws Exception {
		//pk find
	}

	public void findAll() throws Exception {

	}
}
