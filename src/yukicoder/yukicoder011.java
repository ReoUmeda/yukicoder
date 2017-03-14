package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder011 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			
			String[] rew = tes.split("\\+");

			System.out.println(tes.indexOf("-", 1));
			System.out.println(tes.indexOf("+", 1));
			
			int splitIndex = Math.min(Math.max(0, tes.indexOf("-", 1)), Math.max(0, tes.indexOf("+", 1)));
			System.out.println("\t\t" + tes.substring(0, splitIndex+1));
			
			char[] er = tes.toCharArray();
			int tmpp = 0;
			for(int i=0;i<tes.length();i++){
				if(er[i] == '-'){
					tmpp++;
				}
			}
			
			if(rew.length == 2){
				int a = Integer.parseInt(rew[0]);
				int b = Integer.parseInt(rew[1]);
				
				System.out.println(a-b);
				return;
			}else if(rew.length == 3){
				int a;
				try{
					a = Integer.parseInt(rew[0]);
				}catch(NumberFormatException e){
					a = Integer.parseInt(rew[1]);
				}
				
				int b = Integer.parseInt(rew[2]);
				
				System.out.println(a-b);
				return;
			}
			if(tmpp == 1){
				
				rew = tes.split("\\-");
				
				int a = Integer.parseInt(rew[0]);
				int b = Integer.parseInt(rew[1]);
				System.out.println(a+b);
				return;
				
			}else if(tmpp == 3){
				rew = tes.split("\\-");
				
				int a = Integer.parseInt(rew[0]);
				int b = Integer.parseInt(rew[2]);
				
				a = -1*a;
				b = -1*b;
				
				System.out.println(a+b);
				return;
			}else if(tmpp == 1 && er[0] == '-'){
				rew = tes.split("\\-");
				
				int a = Integer.parseInt(rew[0]);
				int b = Integer.parseInt(rew[1]);
				
				a = -1*a;
				
				System.out.println(a+b);
				return;
			}else{
				rew = tes.split("\\-");
				
				int a = Integer.parseInt(rew[0]);
				int b = Integer.parseInt(rew[1]);
				
				b = -1*b;
				
				System.out.println(a+b);
				return;
			}
			
			
			
	}

}