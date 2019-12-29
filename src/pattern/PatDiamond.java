package pattern;

public class PatDiamond {
	public void diamond(int n,int m) {
		int i,j,k;
		for(i=1;i<=n;i++){
			
			for(j=0;j<=m;j++){
				System.out.print(" ");
			}
			m--;
			
			for(k=0;k<i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
for(int p=0;p<n;p++) {
			
			for(int q=0;q<=i;q++)
			{
				System.out.print(" ");
			}
			
			for(int r=0;r<m;r++) {
				System.out.print("* ");
			}
			m--;
			System.out.println();
			
		
		}
		
	}

	public static void main(String[] args) {
		int n=5;
		int m=5;
		PatDiamond pd=new PatDiamond();
		pd.diamond(n, m);
	}
}//not complete.
/* 
      *
     * *
    * * *
   * * * * 
  * * * * *
   * * * *
    * * *
     * * 
      *
 */