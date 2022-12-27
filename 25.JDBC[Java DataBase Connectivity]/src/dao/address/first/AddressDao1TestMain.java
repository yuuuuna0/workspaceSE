package dao.address.first;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao1 addressDao1=new AddressDao1();
		System.out.println("1. insert");
		addressDao1.insert();
		System.out.println("2. findByPrimaryKey");
		addressDao1.findByPrimaryKey();
		System.out.println("3. findAll");
		addressDao1.findAll();
		System.out.println("4. update");
		addressDao1.update();
		System.out.println("5. delete");
		addressDao1.delete();

	}

}
