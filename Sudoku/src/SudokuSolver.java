import java.util.*;
public class SudokuSolver {
    static ArrayList<HashSet<Integer>> row=new ArrayList<HashSet<Integer>>();
	    static ArrayList<HashSet<Integer>> col=new ArrayList<HashSet<Integer>>();
	    static ArrayList<HashSet<Integer>> box=new ArrayList<HashSet<Integer>>();
	    
	    static void creat()
	    {
	    	for(int i=0;i<9;i++)
	    	{
	    		HashSet<Integer> h1=new HashSet<Integer>();
	    		HashSet<Integer> h2=new HashSet<Integer>();
	    		HashSet<Integer> h3=new HashSet<Integer>();
	    		row.add(h1);
	    		col.add(h2);
	    		box.add(h3);
	    	}
	    }
		
	    
	    static void entry1(int i,int j,int num)
	    {

	    			HashSet<Integer> h12=row.get(i);
	    			h12.add(num);
	    			HashSet<Integer> h22=col.get(j);
	    			h22.add(num);

	    			if(j<3)
	    			{
	    				if(i<3)
	    				{
	    					HashSet<Integer> h1=box.get(0);
	    	    			h1.add(num);
	    				}
	    				else if(i<6)
	    				{
	    					HashSet<Integer> h1=box.get(3);
	    	    			h1.add(num);
	    				}
	    				else
	    				{
	    					HashSet<Integer> h1=box.get(6);
	    	    			h1.add(num);
	    				}
	    			}
	    			else if(j<6)
	    			{
	    				if(i<3)
	    				{
	    					HashSet<Integer> h1=box.get(1);
	    	    			h1.add(num);
	    				}
	    				else if(i<6)
	    				{
	    					HashSet<Integer> h1=box.get(4);
	    	    			h1.add(num);
	    				}
	    				else
	    				{
	    					HashSet<Integer> h1=box.get(7);
	    	    			h1.add(num);
	    				}
	    			}
	    			else
	    			{
	    				if(i<3)
	    				{
	    					HashSet<Integer> h1=box.get(2);
	    	    			h1.add(num);
	    				}
	    				else if(i<6)
	    				{
	    					HashSet<Integer> h1=box.get(5);
	    	    			h1.add(num);
	    				}
	    				else
	    				{
	    					HashSet<Integer> h1=box.get(8);
	    	    			h1.add(num);
	    				}
	    			}
	    	
	    	
	    }
		
	    static boolean check(int num,int i,int j)
	    {
	    	HashSet<Integer> h11=row.get(i);
	    	if(h11.contains(num))
	    	{
	    		return false;
	    	}
	    	HashSet<Integer> h22=col.get(j);
	    	if(h22.contains(num))
	    	{
	    		return false;
	    	}
	    	
	    	if(j<3)
			{
				if(i<3)
				{
					HashSet<Integer> h1=box.get(0);
	    			if(h1.contains(num))
	    				return false;
				}
				else if(i<6)
				{
					HashSet<Integer> h1=box.get(3);
					if(h1.contains(num))
	    				return false;
				}
				else
				{
					HashSet<Integer> h1=box.get(6);
					if(h1.contains(num))
	    				return false;
				}
			}
			else if(j<6)
			{
				if(i<3)
				{
					HashSet<Integer> h1=box.get(1);
					if(h1.contains(num))
	    				return false;
				}
				else if(i<6)
				{
					HashSet<Integer> h1=box.get(4);
					if(h1.contains(num))
	    				return false;
				}
				else
				{
					HashSet<Integer> h1=box.get(7);
					if(h1.contains(num))
	    				return false;
				}
			}
			else
			{
				if(i<3)
				{
					HashSet<Integer> h1=box.get(2);
					if(h1.contains(num))
	    				return false;
				}
				else if(i<6)
				{
					HashSet<Integer> h1=box.get(5);
					if(h1.contains(num))
	    				return false;
				}
				else
				{
					HashSet<Integer> h1=box.get(8);
					if(h1.contains(num))
	    				return false;
				}
			}
	    	return true;
	    }
	    
	    static int[][] modify(int[][] a)
	    {
	    	creat();
	    	int[][] arr=new int[9][9];
	    	int count=0;
	    	for(int i=0;i<9;i++)
	    	{
	    		for(int j=0;j<9;j++)
	    		{
	    			int num=0;
	    			if(a[i][j]==0)
					 num=0;
					else
	    			num=a[i][j];
	    			if(num<=9 && num>0)
	    			{
	    				arr[i][j]=num;
	    				entry1(i,j,num);
	    			}
	    			else
	    			{
	    				count++;
	    				arr[i][j]=0;
	    			}
	    		}
	    		
	    	}
	    	while(count!=0)
			{
				for(int i=0;i<9;i++)
				{
					for(int j=0;j<9;j++)
					{
						int c=0;
						int ans=0;
						if(arr[i][j]==0)
						{
							for(int k=1;k<=9;k++)
							{
								if(check(k,i,j))
								{
									c++;
									ans=k;
								}
							}
						}
						if(c==1)
						{
							arr[i][j]=ans;
							count--;
							entry1(i,j,ans);
						}
					}
				}
			}
	    	return arr;
	    }

	public static int[][] solveSudoku(int[][] a) {
		SudokuSolver ol=new SudokuSolver();
		 //return a;
	    int[][] arr=ol.modify(a);
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//Finalarray fa=new Finalarray();
	    ol.row.clear();
	    ol.col.clear();
	    ol.box.clear();
	    //fa.setArr(arr);
	    return arr;
	}
}
