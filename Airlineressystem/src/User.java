import java.util.HashMap;

public class User {
//Make a new class, User, which can contain the information you need to work with.
//Then store those users using a Map<String, User>, which will allow you to 
//look them up via their username. You can also internalize the password check 
//(and other functionality) within the User class (e.g. User#checkPassword(String pw))
//, so you aren't exposing password storage somewhere
	String cash = "2000";
	int current = 0;
	HashMap<String,String> logininfo = new HashMap<String,String>();

	String user;
	User() {
		IdandPasswords login = new IdandPasswords();
		User[] user = new User[logininfo.size()];
		for(int i=0;i<logininfo.size();i++) {

			user[i].user = logininfo.get(i);
		}
	}
}

