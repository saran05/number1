while(n!=0)
        {count++;
            n1=n%10;
            n=n/10;
        }
       
        while(n2!=0)
        {f++;
             n3=n2%10;
            if(f==1)
        {
            sum+=n3;
            n2=n2/10;
        }else
            {mul=1;
                for(i=count;i>0;i--)
                {
                    mul*=n3;
               }
                sum+=mul;
                count--;
                n2=n2/10;
            }
         
        }
          System.out.println(""+sum); 
    