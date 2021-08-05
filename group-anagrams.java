//https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> m=new HashMap<String,List>();
        int n=strs.length;
        // int[] c=new int[26];
        for(int i=0;i<n;i++){
            int[] c=new int[26];
            String t="";
            for(int j=0;j<strs[i].length();j++)
            c[strs[i].charAt(j)-'a']++;
            for(int j=0;j<26;j++)
            t=t+'#'+c[j];
            if(!m.containsKey(t)){
                m.put(t,new ArrayList());
            }
            m.get(t).add(strs[i]);

        }
        return new ArrayList(m.values());
    }
}
