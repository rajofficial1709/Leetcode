class Solution {
    public int compress(char[] chars) {
       
        int n=chars.length;
        int i=0,k=0;
        while(i<n){
            int j=i;
            int count=0;
            while(j<n && chars[i]==chars[j]){
                count++;
                j++;
            }
            chars[k++] = chars[i];

            

            if (count > 1) {
                String s = count + "";

                for (int p = 0; p < s.length(); p++) {
                    chars[k++] = s.charAt(p);
                }
            }
            i=j;    
        }
        return k;
    }
}