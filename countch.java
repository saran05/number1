 public static void main(String[] args) {
         String str;
         int i,t,count=0;
         System.out.println("enter the line");
         Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
         t=str.length();
         char[] a=str.toCharArray();
         for(i=0;i<t;i++)
         {
             if(a[i]==' '){
                 continue;
             }else count++;
         }
         System.out.println("the no. of words a line is"+count);
  }