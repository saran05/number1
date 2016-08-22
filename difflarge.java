 for(i=0;i<a.length-1;i++)
        {
            int diff=a[i]-a[i+1];
            if(max<diff){
                max=diff;
                m=i;
                m1=a[i];
                n=i+1;
                n1=a[i+1];
        }
    }
    if(m1>n1)
            System.out.println(""+i);
    else
            System.out.println(""+i+1);
