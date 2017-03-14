package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder010 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			String tre;
			String poi;
			int aaa = 0;
			
			for(int j=0;j<tes.length();j++){
				for(int i=1;i<tes.length();i++){
					//System.out.println(j+"  "+(tes.length() - i));
					if(j > tes.length() -i){
						continue;
					}
					tre = tes.substring(j, tes.length() - i);
					StringBuffer sb = new StringBuffer(tre);
			        sb.reverse();
			        StringBuffer sc = new StringBuffer(tre);
	//		        System.out.println(i+":"+sb.toString());
	//		        System.out.println(i+":"+sc.toString());
			        
			        
			        
					poi = tes.substring(tes.length() - i, tes.length());
					StringBuffer sb1 = new StringBuffer(poi);
			        sb1.reverse();
			        StringBuffer sc1 = new StringBuffer(poi);
			        
//			        System.out.println(i+":"+sb.toString());
//			        System.out.println(i+":"+sc.toString());
			        
			        if(sb.toString().equals(sc.toString())){// && sb1.toString().equals(sc1.toString())){
			        	
			        	if(aaa < sb.length()){
			        		aaa = sb.length();
			        	}
			        }
			        
				}
				System.out.println(aaa);
			}
			
	}

}