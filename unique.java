for(i=0;i<=11;i++)
        {
            flag=0;
            for(j=0;j<=11;j++)
            {
                if(i==j)
                    continue;
            if(a[i]==a[j]){
                flag=1;
                break;
            }}
                if(flag!=1)
                    System.out.println("the no"+a[i]+"is unique in the array");
            
        }
