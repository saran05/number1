while(n!=0)
      {
      n1=n%10;
      n=n/10;
      a[i]=n1;
      i++;
    }
    for(j=1;j<i;j++)
    {mul=1;
        for(int k=1;k<=a[j-1];k++)
        {
            mul*=a[j];
          }
        
        sum+=mul;
    }
    sum+=1;
        System.out.println(""+sum);