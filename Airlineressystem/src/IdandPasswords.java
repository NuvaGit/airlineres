import java.util.HashMap;

public class IdandPasswords {

	// create hashmap
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IdandPasswords() {
		logininfo.put("admin", "admin");
		
	}
	
	protected HashMap getlogininfo() {
		return logininfo;
	}
	public void setidpass(String pass , String ID) {
		this.logininfo.put(pass, ID);
	}

}
