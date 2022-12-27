package dao.address.fourth;

public class AddressDao4TestMain {

	public static void main(String[] args) throws Exception{
		/*
		 * AddressDao4TestMain	에서
		 * AddressDao4Main으로 데이터 리턴을 전달
		 */
		AddressDao4 addressDao4=new AddressDao4();
		System.out.println("1. insert");
		Address newAddress= new Address(0,"홍진경","555-5555","대구시민");
		int rowCount=addressDao4.insert(newAddress);
		System.out.println(">>insert row Coun: "+rowCount);
		System.out.println("2. update");
		Address updateAddress=new Address(10,"김변경","000-0000","주소변경");
		rowCount=addressDao4.update(updateAddress);
		System.out.println(">>update row Coun: "+rowCount);		
		System.out.println("3. delete");
		rowCount=addressDao4.delete(20);
		System.out.println(">>delete row Coun: "+rowCount);		
		
		System.out.println("4. findByPrimaryKey");
		Address findAddress=addressDao4.findByPrimaryKey(10);
		if(findAddress!=null) {
			System.out.println(">> "+findAddress);
		} else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		System.out.println(">> "+addressDao4.findByPrimaryKey(3));
		System.out.println(">> "+addressDao4.findByPrimaryKey(4));
		System.out.println(">> "+addressDao4.findByPrimaryKey(5));
		System.out.println("5. findAll");
		addressDao4.findAll();
	}

}
