while(n!=0)
        {
            int n2=n%10;
            n1*=n2;
            n=n/10;
        }
        System.out.println(""+n1);