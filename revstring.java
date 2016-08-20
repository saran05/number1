for(i=0;i<t;i++)
        {String ss="";
         char[] c=s1[i].toCharArray();
          for(int j=0;j<c.length;j++)
           {
               if(c[j]>64&&c[j]<91){
                   c[j]=Character.toLowerCase(c[j]);
                   
                   ss=ss+c[j];
                   }
               else{
                   c[j]=Character.toUpperCase(c[j]);
                   ss=ss+c[j];
                  
           }}
          
     String   ss1=new StringBuffer(ss).reverse().toString();
            System.out.print(""+ss1);
            System.out.print(" ");
        