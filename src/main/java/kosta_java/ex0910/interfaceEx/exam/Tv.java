package kosta_java.ex0910.interfaceEx.exam;

public class Tv extends Elec implements ElecFunction{
	private int chnnel;
	
	public Tv() {}
	
	public Tv(int chnnel) {
		this("",0,chnnel);
	}
	
	public Tv(String code, int cost, int chnnel) {
		super(code,cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public void start() {}
	
	@Override
	public void stop() {}
	
	@Override
	public void display() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" TV [chnnel=");
		builder.append(chnnel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
