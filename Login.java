public class Login{
	/*
	*@program:Login.java
	*@Description:Login
	*@author:yangmengsi123
	*@data:2019/9/30
	*/
	public static void main(String[] args){
		final String username = "test";
		final String userpassword = "123456";
		
		User user = new User();
		
		Scanner scanner = new Scanner(System.in);
		
		String usernameinput = scanner.next();
		
		if(username.equals(usernameinput)){
			Sytem.out.println("Please input password:");
			String userpasswordinput = scanner.next();
			if(userpassword.equals(userpasswordinput)){
				System.out.println("Welcome");
			}
		}
	}
}