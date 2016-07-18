 public static void main(String[] args) {
         String str;
         int i,t,count=1;
         System.out.println("enter the line");
         Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
         t=str.length();
         char[] a=str.toCharArray();
         for(i=0;i<t-1;i++)
         {
             if(a[i]==' '&&a[i+1]!=' '){
                 count++;
             }
         }
         System.out.println("the no. of words a line is"+count);
   }