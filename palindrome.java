while(a!=0)
        {
            a1=a%10;
            rev=rev*10+a1;
            a=a/10;
        }
        if(a2==rev)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
        