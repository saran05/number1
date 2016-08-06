 while(n!=0)
        {count++;
         k1[i]=n%10;
         i++;
         n=n/10;
        }int t;
        for(j=0;j<i-1;j++)
        {
            for(int k2=j+1;k2<i;k2++)
            {
               if(k1[j]>k1[k2])
            {
              t=k1[j];
              k1[j]=k1[k2];
              k1[k2]=t;
                
            }
        }
    }
for(j=0;j<count-k;j++)   
{
     System.out.print(""+k1[j]);
}