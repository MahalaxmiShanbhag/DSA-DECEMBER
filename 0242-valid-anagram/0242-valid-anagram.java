class Solution {
    public boolean isAnagram(String s, String t) {
        int p=s.length();
        int q=t.length();
        if(p!=q)
        {
            return false;
        }
        else
        {
            int count[]=new int[26];
            for(int i=0;i<p;i++)
            {
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<q;i++)
            {
             count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++)
            {
                if(count[i]!=0)
                {
                  return false;
                }

            }
            return true;
        }

    }
}