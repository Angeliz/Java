
public class Fan {
	//（1）三个名为SLOW、MEDIUM、和FAST而值为1、2、3的常量表示风扇的速度
	final int SLOW=1;
	int MEDIUM=2;
	int FAST=3;
	
	//（2）一个名为speed的int型成员变量表示风扇的速度
	int speed;
	
	//（3）一个名为on的boolean类型的成员变量表示风扇是否打开
	boolean on;
	
	//（4）一个名为radius的double型成员变量表示风扇的半径
	double redius;
	
	//
	String color;
	
	//修改
	void changeSpeed(int speed)
	{
		this.speed = speed;
	}
	void changeOn(boolean on)
	{
		this.on = on;
	}
	void changeRedius(double redius)
	{
		this.redius = redius;
	}
	void changeColor(String color)
	{
		this.color = color;
	}
	
	//访问
	int getSpeed()
	{
		return this.speed;
	}
	boolean getOn()
	{
		return this.on;
	}
	double getRadius()
	{
		return this.redius;
	}
	String getColor()
	{
		return this.color;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan t=new Fan();
		t.changeSpeed (2);
		t.changeRedius(10);
		t.changeOn(true);
		t.changeColor("white");
		System.out.println(t.getSpeed()+","+t.getOn()+","+t.getRadius()+","+t.getColor());
	}

}
