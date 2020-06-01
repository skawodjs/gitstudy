package customerManagement;

public class CustomInfo {
	protected String customId;
	protected String password;
	protected String name;
	protected String address;
	protected String phoneNum;
	protected String eMail;
	
	
	public String getCustomId() {
		return customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CustomInfo) {
			CustomInfo customInfo = (CustomInfo)obj;
			if(customInfo.customId == this.customId) {
				System.out.println("이미 사용중인 아이디입니다.");
				return true;
			}else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	
	
	
	
	
}
