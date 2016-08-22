for(i=0;i<t;i++)
        {
           if(i%2!=0)
           {
         String ss=new StringBuffer(s1[i]).reverse().toString();
         s1[i]=ss;
         System.out.print(""+s1[i]); 
               if(i!=t-1)
               System.out.print(" ");
           }else{
                System.out.print(""+s1[i]);
           if(i!=t-1)
                System.out.print(" ");
        }
      
        
        }
    
