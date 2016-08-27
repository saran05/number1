
        for(i=0;i<t1;i++)
        {
            for(j=i+1;j<=t1;j++)
            {
            s3[k]=s1.substring(i,j);
            ccc[k]=i;
             k++;
                
    }
    
}String s = null;
int nn = 0,tt=0,tt1;
        for(i=0;i<k;i++)
        {
            if(s3[i].equalsIgnoreCase(s2)){
                tt1=s3[i].length();
                if(tt1>tt)
                {tt=tt1;
                s=s3[i];
                nn=ccc[i];
            }
        }}
        System.out.println(""+s);
        System.out.println(""+nn);

