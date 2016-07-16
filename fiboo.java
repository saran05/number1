int n=5,i,ff1=0,ff2=1,ff3;
        System.out.print(f1+"\t"+f2);
        for(i=2;i<5;i++)
        {
            ff3=ff1+ff2;
            System.out.print("\t"+ff3);
            ff1=ff2;
            ff2=ff3;
        }
 