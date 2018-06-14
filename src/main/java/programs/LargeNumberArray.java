package programs;

public class LargeNumberArray {
	 public static void main(String args[]){
	   int a[]={7,2,8,1,3,5,10,0,12,11};
	   int large=a[0],second=a[0],third=a[0];
	   int index=0,index1=0,index2=0;
	   for (int i=0;i<a.length;i++)
	   {
	     if(a[i]>=large)
	     {
	        large=a[i];
	        index=i;  
	     }
	   }
	   for (int j=0;j<a.length;j++)
	   {
	      if(a[j]<large && a[j]>second)
	      {
	         second=a[j];
	         index1=j;
	      }
	    }
	   for (int k=0;k<a.length;k++)
	   {
	      if(a[k]<second && a[k]>third)
	      {
	         third=a[k];
	         index2=k; 
	      }
	   }
	   System.out.println("Large Number: "+large+ " Index: "+index);
	   System.out.println("Large Number: "+second+ " Index: "+index1);
	   System.out.println("Large Number: "+third+ " Index: "+index2);
	  }
	}

