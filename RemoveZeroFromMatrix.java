package dsa;

import java.util.Scanner;

public class RemoveZeroFromMatrix {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter rows and column");
		int m=s.nextInt();
		int n=s.nextInt();
		int[][] a=new int[m][n];
		int[][] b=new int[m][n];
		int[][] c=new int[m][n];
		int[][] d=new int[m][n];
		System.out.println("enter the matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("input matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		
		}

		int sumRow=0,x=0;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sumRow+=a[i][j];
				
			}
			if(sumRow!=0)
			{
				
				for(int k=0;k<n;k++)
				{
					b[i-x][k]=a[i][k];
				}
			}
			else
			{
				x++;
			}
			sumRow=0;
		}
//		
//		System.out.println("b matrix is");
//		for(int i=0;i<m-x;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		
//		}
		
		int sumCol=0,y=0,temp=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n-x;j++)
			{
				sumCol+=b[j][i];
				
			}
			if(sumCol!=0)
			{
				
				
				for(int k=0;k<n-x;k++)
				{
//					c[k][i]=b[k][i-temp];
					if(temp==0)
					{
						c[k][i]=b[k][i];
					}
					if(temp==1 && n>3)
					{
						c[k][i]=b[k][i+1];
//						System.out.println(i);
					}
					
				}
//				for(int p=0;p<m;p++)
//				{
//					for(int q=0;q<n-x;q++)
//					{
//						c[q][p]=b[q][p+y];
//					}
//				}
//				y=0;
//				for(int k=0;k<n;k++)
//				{
//					c[k][i-y]=b[k][i];
//				}
			}
			else
			{
				for(int k=0;k<n-x;k++)
				{
					c[k][i]=b[k][i+1];
					temp=1;
				}
				
			}
			sumCol=0;
		}
		System.out.println("outut matix:");
		for(int i=0;i<m-x;i++)
		{
			for(int j=0;j<n-y-temp;j++)
			{
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
		}
	}

}
