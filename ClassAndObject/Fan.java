
public class Fan {
	//��1��������ΪSLOW��MEDIUM����FAST��ֵΪ1��2��3�ĳ�����ʾ���ȵ��ٶ�
	final int SLOW=1;
	int MEDIUM=2;
	int FAST=3;
	
	//��2��һ����Ϊspeed��int�ͳ�Ա������ʾ���ȵ��ٶ�
	int speed;
	
	//��3��һ����Ϊon��boolean���͵ĳ�Ա������ʾ�����Ƿ��
	boolean on;
	
	//��4��һ����Ϊradius��double�ͳ�Ա������ʾ���ȵİ뾶
	double redius;
	
	//
	String color;
	
	//�޸�
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
	
	//����
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
