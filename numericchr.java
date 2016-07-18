 public static void main(String[] args) {
         String str;
         int i,t,count=0;
         System.out.println("enter the string");
         Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
         t=str.length();
         char[] a=str.toCharArray();
         for(i=0;i<t;i++)
         {
           if(a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9')
         {
         count++;
        }}
         System.out.println("the no. of numeric character in a string is"+count);
   }