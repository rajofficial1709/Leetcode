class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<n){
            while (s.charAt(i)==' ') i++;
            int j=i;
            while(j<n && s.charAt(j)!=' ') j++;
            String str=s.substring(i,j);
            StringBuilder t=new StringBuilder(str);
            ans.append(t.reverse());
            if(j<n){
                ans.append(" ");
            }
            i=j;






        }
        return ans.toString();
    }
}