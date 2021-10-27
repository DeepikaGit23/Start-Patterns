
public class StarPattern4 {
	
	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>0;i--) {
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
