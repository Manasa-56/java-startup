import java.util.*;
public class MatrixMul{
public static void main(String[] args)
{
int a[][]={{1,3,4},{2,4,3},{3,4,5}};
int b[][]={{1,3,4},{2,4,3},{1,2,4}};
int[][] c=new int[3][3];
System.out.println("Multiplication of Matrices is:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
    c[i][j]=0;
for(int k=0;k<a.length;k++)
{
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
