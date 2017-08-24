package test;
class Base{}
class Sub extends Base{}
public class Abc{
	public static void main(String argv[]){
		Base b=new Base();
		Sub s=(Sub) b;
	}
}