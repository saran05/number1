 while(n!=0)
        {
            n1=n%10;
            n=n/10;
            sum+=n1;
        }int sum1=sum;
        while(sum!=0)
        {
            n1=sum%10;
            rev=rev*10+n1;
            sum=sum/10;
        }if(sum1==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
