package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder05 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		

		
		

			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String[] tew = null;
			long x = Long.parseLong(tes);
			
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			long x2 = Long.parseLong(tes);
//			if((x/1000L) == x2){
//				System.out.println(1);
//			}else if((x/1000L) < x2){
//				System.out.println((x/1000L)*x2);
//			}
			
			long x3 = ((x/1000L)%x2);
			if(x3 == 0){
				System.out.println(1);
				System.exit(0);
			}
			long tmpx1=1,tmpx2=1,tmpx3=1;
			for(long i=x2;i>0;i--){
				tmpx1 = tmpx1*i;
			}
			for(long i=x3;i>0;i--){
				tmpx2 = tmpx2*i;
			}
			for(long i=(x2-x3);i>0;i--){
				tmpx3 = tmpx3*i;
			}
		System.out.println((tmpx1/(tmpx2*tmpx3))%1000000000L);
	}

}