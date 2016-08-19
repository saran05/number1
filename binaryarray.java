 for(i=0;i<t;i++)
        {
            s[i]=Integer.toBinaryString(a[i]);
        }
        for(i=0;i<t;i++)
            {c=0;
                int k=s[i].length();
            for(j=0;j<k;j++)
            {
                char c1=s[i].charAt(j);
                if(c1=='1')
                    c++;
            }
            b[i]=c;
            
    }
        for(i=0;i<t;i++)
        {for(j=i+1;j<t;j++)
        {
            if(b[i]<b[j])
            {
                t1=a[i];
                a[i]=a[j];
                a[j]=t1;
            }
            if(b[i]==b[j])
            {
                if(a[i]<a[j])
                {
                     t1=a[i];
                a[i]=a[j];
                a[j]=t1;
            
                }
            }
        }
    
}for(i=0;i<t;i++)
{
    System.out.println(""+a[i]);
}