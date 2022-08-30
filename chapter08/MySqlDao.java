package chapter08;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql 검색");		
	}

	@Override
	public void insert() {
		System.out.println("MySql 삽입");				
	}

	@Override
	public void update() {
		System.out.println("MySql 수정");				
	}

	@Override
	public void delete() {
		System.out.println("MySql 삭제");				
	}

}
