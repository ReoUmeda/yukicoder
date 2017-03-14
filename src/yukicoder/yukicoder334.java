package yukicoder;

import java.util.Scanner;

public class yukicoder334 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		readLineIntArray(sc);
		int[] a = readLineIntArray(sc);
		boolean[][][] b = tes();
		
		
		long count = 0;
		
		if(a.length <= 5){
			five(a,b);
		}
		
		if(a[0] < a[1]){
			count = a[0] - 2L -a[0] +a[1];
		}else{
			count = 2000000000L-a[0] -1L+a[0] -a[1];
		}
		
		System.out.println(count);
		
		
		
	}
	private static void five(int[] a, boolean[][][] b){
		
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<5;k++){
					if(i == j || i == k || j == k){
						continue;
					}
					if(b[a[i]][a[j]][a[k]]){
						System.out.println((i+1)+" "+(j+1)+" "+(k+1));
						System.exit(0);
					}
				}
			}
		}
		
		System.out.println("-1");
		
		System.exit(0);
	}
	
	private static boolean[][][] tes(){
		boolean[][][] a = new boolean[12][12][12];
		
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++){
				for(int k=0;k<12;k++){
					if(i == j || i == k || j == k){
						continue;
					}
					
					if((i+1) < (j+1) && (j+1) < (k+1) || (k+1)<(j+1) && (j+1)<(i+1)){
						a[i][j][k] = false;
					}else{
						a[i][j][k] = true;
					}
				}
			}
		}
		
		
		return a;
	}
	protected static long readLineLong(Scanner sc) {
		return Long.parseLong(sc.nextLine());
	}
	
	protected static long[] readLineLongArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		long ret[] = new long[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Long.parseLong(split[i]);
		}
		return ret;
	}
	protected static int readLineInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}
	
	protected static int[] readLineIntArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		int ret[] = new int[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Integer.parseInt(split[i]);
		}
		return ret;
	}
	
	protected static double readLineDouble(Scanner sc) {
		return Double.parseDouble(sc.nextLine());
	}
	
	protected static double[] readLineDoubleArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		double ret[] = new double[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Double.parseDouble(split[i]);
		}
		return ret;
	}
	
	protected static String readLineString(Scanner sc) {
		return sc.nextLine();
	}
	
	protected static String[] readLineStringArray(Scanner sc) {
		return sc.nextLine().split(" ");
	}

}
