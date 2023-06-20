package model;

public class semaforo {
	
	private String ci= "*\n"
			+ "	**\n"
			+ "	***\n"
			+ "	****\n"
			+ "	*****";
	
	private String cd= "*****\n"
					+"****\n"
					+"***\n"
					+"**\n"
					+"*";
	
	private String cn= 	"**********\n"
						+"**********\n"
						+"**********\n"
						+"**********\n"
						+"**********\n";
	
	private String cs=  "********************\n"
						+ "********************\n"
						+ "********************\n"
						+ "********************\n"
						+ "********************\n";
	
	private String p= "***\n"
					+"***\n"
					+"***\n"
					+"***\n"
					+"***\n";
	
	public semaforo() {
		ci="*\n"
				+ "	**\n"
				+ "	***\n"
				+ "	****\n"
				+ "	*****";
		cd= "*****\n"
				+"****\n"
				+"***\n"
				+"**\n"
				+"*";
		cn="**********\n"
				+"**********\n"
				+"**********\n"
				+"**********\n"
				+"**********\n";
		cs="********************\n"
				+ "********************\n"
				+ "********************\n"
				+ "********************\n"
				+ "********************\n";
		p="***\n"
				+"***\n"
				+"***\n"
				+"***\n"
				+"***\n";
	}

	public semaforo(String ci, String cd, String cn, String cs, String p) {
		this.ci = ci;
		this.cd = cd;
		this.cn = cn;
		this.cs = cs;
		this.p = p;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getCs() {
		return cs;
	}

	public void setCs(String cs) {
		this.cs = cs;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "semaforo [ci=" + ci + ", cd=" + cd + ", cn=" + cn + ", cs=" + cs + ", p=" + p + "]";
	}
	
	
	
}
