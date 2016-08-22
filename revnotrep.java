for(i=0;i<t;i++)
      {
      for(j=i+1;j<t;j++)
      {
      if(c[i]==c[j])
          {
          c[j]='\0';
          }
      }}
      for(i=0;i<t;i++)
      {
          if(c[i]!='\0')
           s2=s2+c[i];   
      }
      
        System.out.println(""+s2);   
      