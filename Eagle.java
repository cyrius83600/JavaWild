public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
	
	public void ascend(int height)
	{
		this.altitude += height;
		System.out.println(this.getName() + " flies upward, altitude : " + altitude);
	}	

	public void descend(int height)
	{
		this.altitude -= height;
		System.out.println(this.getName() + " flies downward, altitude : " + altitude);
	}

    public void land()	
    {
       if(altitude == 1)
       {
		  System.out.println(this.getName() + " lands on the ground.");
       }
       else
       {
           System.out.println(this.getName() + " is too high, it can't land.");
       }
    }
	
	
}
