package yukicoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yukicoder015 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		String[] sp = tes.split(" ");
		
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		
		
		try {
			tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}
		
		aisu soft = new aisu(tes);
		
		char tmp;
		int countka = 0;
		int tututu = 0;
		while(soft.isFlag()){
			tututu = 0;
			tmp = soft.eat();
			if(tmp == '1'){
				if(k <= soft.getKazu()){
					countka++;
					break;
				}
				tututu++;
			}else if(tmp == '2'){
				if(k <= soft.getKazu()){
					countka++;
					break;
				}
				tututu++;
				tututu++;
			}
			
			for(int j=0;j<tututu;j++){
				tmp = soft.eat();
				if(tmp == '1'){
					if(k <= soft.getKazu()){
						break;
					}
					tututu++;
				}else if(tmp == '2'){
					if(k <= soft.getKazu()){
						break;
					}
					tututu++;
					tututu++;
				}
			}
			
			countka++;
			if(k <= soft.getKazu()){
				break;
			}
		}
		int tmpa;
		tmpa = (k/soft.getKazu());
		if(0 != (k%soft.getKazu())){
			tmpa++;
		}
		
		countka = tmpa*countka;
		
		
		System.out.println(countka);
		
		
		
	}
//	private static void kkk(aisu soft, int tugi,int k) {
//		int tmp;
//		for(int i=0;i<tugi;i++){
//			tmp = soft.eat();
//			if(tmp == '1'){
//				if(k <= soft.getKazu()){
//					return;
//				}
//				kkk(soft,1,k);
//			}else if(tmp == '2'){
//				if(k <= soft.getKazu()){
//					return;
//				}
//				kkk(soft,2,k);
//			}
//		}
//	}
}
class aisu{
	private String hako;
	private int basyo =0;
	private int max;
	private boolean flag = true;
	
	
	private int kazu = 0;
	
	public aisu(String tmp){
		hako = tmp;
		max = hako.length();
		chek();
	}
	
	public char eat(){
		char ret;
		
		ret = hako.charAt(basyo);
		ink();
		kazu++;
		return ret;
	}
	
	private void ink(){
		basyo++;
		if(basyo == max){
			flag = false;
		}
		basyo = basyo % max;
	}
	
	public String getHako() {
		return hako;
	}
	public int getBasyo() {
		return basyo;
	}

	public int getMax() {
		return max;
	}

	public int getKazu() {
		return kazu;
	}

	public boolean isFlag() {
		return flag;
	}
	public void chek(){
		for(int i=0;i<hako.length();i++){
			if('2' != hako.charAt(i)){
				return;
			}
		}
		System.out.println("1");
		System.exit(0);
	}
	
	
}