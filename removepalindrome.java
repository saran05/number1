char[] c=s.toCharArray();
        int s1=s.length(),i,j=s1-1;
      int s2=s1/2;
      for(i=0;i<s2;i++)
      {
          if(c[i]==c[j])
              j--;
      }
           
        System.out.println(""+c[s2]+" "+(s2));
    