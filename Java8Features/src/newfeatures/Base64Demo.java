package newfeatures;

import java.util.Base64;
import java.util.Scanner;

//java program to Encrypt and Decrypt data
public class Base64Demo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String userName,password;
		
		System.out.println("**welcome to coforge technologies****");
System.out.println("Enter your user name : ");
userName=s.next();

System.out.println("Enter Your Password :" );
password=s.next();

String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
System.out.println("Login Successfull !!!");
System.out.println("User Name : "+userName);
System.out.println("Password: "+encodedPassword);


System.out.println("****Decrypt the password**");

//decode base64 format to String
String decodedPassword = new String (Base64.getDecoder().decode(encodedPassword));
System.out.println("The Password is : "+decodedPassword );

System.out.println("******URL Encoding*****");
Base64.Encoder encoder=Base64.getUrlEncoder();
String eUrl=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());

System.out.println("Encode URL" + eUrl);
}

}