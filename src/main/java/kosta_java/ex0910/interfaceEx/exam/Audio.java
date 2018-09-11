package kosta_java.ex0910.interfaceEx.exam;

public class Audio extends Elec implements ElecFunction{
	
	private int volumn;
	
	public Audio(){}
	public Audio(int volumn) {
		this("",0,volumn);
	}
	public Audio(String code, int cost, int volumn) {
		super(code,cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}
	
	@Override
	public void display() {
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Audio [volumn=");
		builder.append(volumn);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
