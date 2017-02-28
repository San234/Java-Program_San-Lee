public abstract class Console extends GameSystem
{
	private String platform;
	private int serialNo;
	public Console()
	{
		super();
	}
	public Console(String p)
	{
		super(p);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract String getController();
	public String toString()
	{
		return "Platform: " + getPlatform() + "\n" 
		+ "Serial #: " + super.getSerialNo() + "\nController: " + getController();
	}
}