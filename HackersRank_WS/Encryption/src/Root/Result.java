package Root;
class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
    String out=new String();
    s.replaceAll("\\s+","");
    int l=s.length();
    System.out.println("Length of the string "+l);
    int a=(int)Math.sqrt(l);
    int b=a;
    if(a*(b)<l)
    {
      b=b+1;  
    }
    if(a*(b)<l)
    {
      a=a+1;  
    }
    System.out.println("Rows "+a);
    System.out.println("Column "+b);
    char[][] temp= new char[a][b];  
    int k=0;
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
        {
            if(k<l)
            {
            temp[i][j]=s.charAt(k);
            k++;
            System.out.print(temp[i][j]);
            }
            else
            {
            temp[i][j]='\0';
            k++;
            System.out.print(temp[i][j]); 
            }
        }
        System.out.println();
    }
    int m=0;
    for(int i=0;i<b;i++)
    {
        for(int j=0;j<a;j++)
        {
           if(m<=k)
           {
               if(temp[j][i]!='\0')
               out=out+temp[j][i];
           }
          m++;
        }
        if(m<=k)
           {
               out=out+" ";
           }
        
    } 
    return out;

    }

}