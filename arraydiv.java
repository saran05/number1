 while(j<4)
    {c=0;c1=0;sum=0;sum1=0;
        for(i=0;i<j;i++)
        {c++;
            sum+=a[i];
        }
       for(int k=i;k<5;k++)
        {c1++;
            sum1+=a[k];
        }
  
        sum=sum/c;
         sum1=sum1/c1;
        if(sum==sum1)
        {f++;
            System.out.println("\n");
             for(i=0;i<j;i++)
        {
          System.out.print(""+a[i]);
        }  System.out.print("  ");
        for(int k=i;k<5;k++)
        {
          System.out.print(""+a[k]);
        } }
       j++;
        }
    if(f==0)
            System.out.println("not possible");
    }
    
}