 int n2,n3=1234,n4;
        while(n!=0)
        {
           n1=n%10;
           sum+=n1;
           n=n/10;
        }
        
        while(n3!=0)
        {
           n2=n3/10;
            n3=n2;
            while(n2!=0)
            {
                n4=n2%10;
                
                sum+=n4;
                n2=n2/10;
            }
        }
       System.out.println(""+sum);
      