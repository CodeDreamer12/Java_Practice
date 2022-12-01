class HelloWorld {
    public static void LPS(String pat, int m, int lps[]){
        int length1 = 0 ;
        int i=1;
        lps[0] =0;
        while(i< m ){
            if(pat.charAt(i)==pat.charAt(length1)){
                length1++;
                lps[i]=length1;
                i++;
            }
            else{
                if(length1!=0){
                    length1=lps[length1-1];
                    }
                    else{
                         lps[i]=length1;
                         i++;
                    }
            }
        }
    }
    public static void KMP(String txt, String pat){
        int m = pat.length();
        int n = txt.length();
        int lps[] = new int[m];
        int  i = 0;
        int j=0;
        boolean flag = false;
        LPS(pat, m , lps);
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
           if(j==m){
             flag=true;
             System.out.println("Patern found at index "+ (i-j));
             
           } 
          else if(i<n && txt.charAt(i)!=pat.charAt(j))  {
              if(j!=0){
                  j=lps[j-1];
              }
              else{
                  i++;
              }
          }
            
            
        }
        if(!flag)
         System.out.println("String not foud");
    }
    public static void main(String[] args) {
       String txt ="ababcabcdbababd";
       String pat ="ababd";
       KMP(txt, pat);
    }
}
