package dao.address.third;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception{
		/*
		 * AddressDao2TestMain	에서
		 * AddressDao2로 파라메타를 전달
		 */
		AddressDao3 addressDao3=new AddressDao3();
		System.out.println("1. insert");
		Address newAddress= new Address(0,"홍진경","555-5555","대구시민");
		addressDao3.insert(newAddress);
		System.out.println("2. update");
		Address updateAddress=new Address(10,"김변경","000-0000","주소변경");
		addressDao3.update(updateAddress);
		System.out.println("3. delete");
		addressDao3.delete(20);
		System.out.println("4. findByPrimaryKey");
		addressDao3.findByPrimaryKey(10);
		System.out.println("5. findAll");
		addressDao3.findAll();
	}

}
