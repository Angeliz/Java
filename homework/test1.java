package practice;
//��������Ĺ��췽��ǰ���ȵ��ø���Ĺ��췽��
class getBirthInfo {  
    getBirthInfo()
    {  
        System.out.println("auto");  
    }  
    void aa() 
    {  
        System.out.println("born alive.");  
    }  
}  
  
class Platypus1 extends getBirthInfo  
{  
      Platypus1() 
      {  
    	//super();
        System.out.println("hatch from eggs");  
        System.out.println("a mammal normally is ");  
      }  
}  

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Platypus1 p1=new Platypus1(); 
	}

}
