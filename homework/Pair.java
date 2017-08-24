package practice;

public class Pair implements Comparable<Pair> {
	private String text;
	private int count;
	public String getText()
	{
		return text;
	}
	public void setText(String text)
	{
		this.text=text;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int count)
	{
		this.count=count;
	}
	
	@Override
	public int compareTo(Pair o)
	{
		if(this.count>o.count)
		{
			return -1;
		}
		else if(this.count<o.count)
		{
			return 1;
		}
		return 0;
	}

}
