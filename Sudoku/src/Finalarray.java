
public class Finalarray {
	final static int[][] arr=new int[9][9];

	public static int[][] getArr() {
		return arr;
	}
	public static void setArr(int[][] a)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				arr[i]=a[i];
			}
		}
	}


}
