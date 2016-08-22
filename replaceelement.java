for(i=0;i<a.length-1;i++)
        {int max=0;
            for(j=i+1;j<a.length;j++)
            {
             if(max<a[j])
                    max=a[j];
            }
            a[i]=max;
            System.out.println(""+a[i]);
        }if(i==a.length-1){
            a[i]=0;
        System.out.println(""+a[i]);}
    