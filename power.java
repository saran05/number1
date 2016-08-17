while(n!=0)
        {
            count++;
            n=n/10;
        }
        while(n1!=0)
        {
            n2=n1%10;
            pow=1;
            for(i=0;i<count;i++)
            {
              pow=pow*n2;
              }
            sum+=pow;
            n1=n1/10;
        }
        System.out.println(""+sum);
    