
public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=n-1;i>=0;i--)
		{
			for(int k=i;k>=0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
