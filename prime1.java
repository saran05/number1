for(i=2;i<=n;i++){
            for(j=2;j<n;j++){
                if(i%j==0)
                    break;
        }
        if(i==j)
                System.out.println(i);
        }