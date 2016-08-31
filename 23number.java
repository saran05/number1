int i,n=500,i1,n2,c=0;
            for(i=1;i<=n;i++)
            {
               if(i<10)
                {
                    if(i==3||i==4)
                    {
                       System.out.println(""+i);
                    }
                }
                if(i>=10)
                {
                    int t=i;
                    c=0;
                    while(t!=0)
                    {
                        i1=t%10;
                        if(i1==3||i1==4){
                            n2=t;
                        
                            t=t/10;
                            continue;}
                        else
                        {c++;
                          
                          break;
                        }
                        
                    }
                   if(c==0)
                    System.out.println(""+i);
                }
            }