import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[8];
		arr[0] = "c=";
		arr[1] = "c-";
		arr[2] = "dz=";
		arr[3] = "d-";
		arr[4] = "lj";
		arr[5] = "nj";
		arr[6] = "s=";
		arr[7] = "z=";
		
		String str = sc.nextLine();
		
		int count = 0;
		
		if(str.length() == 1) {
			count = 1;
		}else {
			for(int i=0; i<str.length()-1; i++) {
				count++;
				
				if(i < str.length()-2) {
					if(str.charAt(i)=='c' && (str.charAt(i+1)=='=' || str.charAt(i+1)=='-')) {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='d' && str.charAt(i+1)=='-') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='d' && str.charAt(i+1)=='z' && str.charAt(i+2)=='=') {
						if(i+1 == str.length()-3) {
							count++;
							break;
						}else {
							i+=2;
						}
					}else if(str.charAt(i)=='l' && str.charAt(i+1)=='j') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='n' && str.charAt(i+1)=='j') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='s' && str.charAt(i+1)=='=') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='z' && str.charAt(i+1)=='=') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}
				}else {
					if(str.charAt(i)=='c' && (str.charAt(i+1)=='=' || str.charAt(i+1)=='-')) {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='d' && str.charAt(i+1)=='-') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='l' && str.charAt(i+1)=='j') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='n' && str.charAt(i+1)=='j') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='s' && str.charAt(i+1)=='=') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;
						}
					}else if(str.charAt(i)=='z' && str.charAt(i+1)=='=') {
						if(i+1 == str.length()-2) {
							count++;
							break;
						}else {
							i++;;
						}
					}else if(i==str.length()-2) {
						count++;
					}
				}
				
			}
		}
		
		
		System.out.println(count);
	
	}
}
