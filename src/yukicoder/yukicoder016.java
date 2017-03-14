package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder016 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		
		int n = Integer.parseInt(tes);
		char tmp='0';
		String[] ss = new String[n];
		for(int i=0;i<n;i++){
			try {
				tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
			}
			ss[i] = oo(tes);
			
			if(tmp <= valerl(ss[i])){
				tmp = valerl(ss[i]);
			}
		}
		
		int sin = codeenco(tmp);
		
		
		
	}
	public static String oo(String s){
		String ret;
		char[] tmp = s.toCharArray();
		
		for(int i=0;i<tmp.length;i++){
			
			if(tmp[i] != '0'){
				break;
			}else if(tmp[i] == '0'){
				
				tmp[i] = 0;
				
//				for(int j=0;j<tmp.length-1;j++){
//					tmp[j] = tmp[j+1];
//				}
//				tmp[tmp.length-1] = 0;
			}
		}
		ret = String.valueOf(tmp);
		
		return ret;
	}
	public static char valerl(String s){
		char ret = '0';
		char sss = '0';
		char[] tmp = s.toCharArray();
		
		for(int i=0;i<tmp.length;i++){
			
			if(sss <= tmp[i]){
				ret = tmp[i];
			}
		}
		
		return ret;
	}
	public static int codeenco(char s){
		int ret = 0;
		
		if(s == '0'){
			ret = 0;
		}else if(s == '1'){
			ret = 1;
		}else if(s == '2'){
			ret = 2;
		}else if(s == '3'){
			ret = 3;
		}else if(s == '4'){
			ret = 4;
		}else if(s == '5'){
			ret = 5;
		}else if(s == '6'){
			ret = 6;
		}else if(s == '7'){
			ret = 7;
		}else if(s == '8'){
			ret = 8;
		}else if(s == '9'){
			ret = 9;
		}else if(s == 'A'){
			ret = 10;
		}else if(s == 'B'){
			ret = 11;
		}else if(s == 'C'){
			ret = 12;
		}else if(s == 'D'){
			ret = 13;
		}else if(s == 'E'){
			ret = 14;
		}else if(s == 'F'){
			ret = 15;
		}else if(s == 'G'){
			ret = 16;
		}else if(s == 'H'){
			ret = 17;
		}else if(s == 'J')ret = 19;
		else if(s == 'K')ret = 20;
		else if(s == 'L')ret = 21;
		else if(s == 'M')ret = 22;
		else if(s == 'N')ret = 23;
		else if(s == 'O')ret = 24;
		else if(s == 'P')ret = 25;
		else if(s == 'Q')ret = 26;
		else if(s == 'R')ret = 27;
		else if(s == 'S')ret = 28;
		else if(s == 'T')ret = 29;
		else if(s == 'U')ret = 30;
		else if(s == 'V')ret = 31;
		else if(s == 'W')ret = 32;
		else if(s == 'X')ret = 33;
		else if(s == 'Y')ret = 34;
		else if(s == 'Z')ret = 35;
		
		return ret;
	}
}
