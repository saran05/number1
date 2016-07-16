 int n=5,i,f1=0,f2=1,f3;
        System.out.print(f1+"\t"+f2);
        for(i=2;i<5;i++)
        {
            f3=f1+f2;
            System.out.print("\t"+f3);
            f1=f2;
            f2=f3;
        }
       