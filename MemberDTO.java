package login;

public class MemberDTO {
	private String ID;
	private String PW;
	private String Name;
	
	public MemberDTO(String ID, String PW, String Name) {
		this.ID = ID;
		this.PW = PW;
		this.Name = Name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "ID : " + ID + "        PW : " + PW + "       Name" + Name;
	}
	
}
