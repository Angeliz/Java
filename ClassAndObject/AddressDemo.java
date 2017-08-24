import address.info.Address;

public class AddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address();
		a.changeName("Free");
		a.changeWorkPlace("Beijing");
		a.changePhone("18200000000");
		a.changeEMail("zhu_free@163.com");
		a.display();
		Address b = new Address("Free", "Beijing", "18200000000", "zhu_free@163.com");
		b.display();
	}

}
