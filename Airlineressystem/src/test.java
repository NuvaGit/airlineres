import java.util.HashMap;

public class test {
public static void main(String[] args) {
	HashMap<String,String> logininfo = new HashMap<String,String>();
  logininfo.put("admin", "admin");
  String copy = logininfo.get("admin");
  System.out.println(copy);
}
}
