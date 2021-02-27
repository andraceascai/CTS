package clase;

public class Girafa  extends Animal{
private int inaltime;
	public Girafa(String nume,int intaltime) {
		super(nume);
		this.inaltime=intaltime;
		// TODO Auto-generated constructor stub
	}
	
	public int getInaltime() {
		return inaltime;
	}
	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	@Override
	public void merge() {
		// TODO Auto-generated method stub
		System.out.print("merge cu capul pe sus");
		
	}
	

}