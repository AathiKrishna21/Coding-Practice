class Solution {
    public void back(HashMap<Integer,String> h,String ans,List<String> a,int d){
        int temp=d%10;
        if(temp==0){
            a.add(ans);
            return;
        }
        else if(temp>1 && temp<10){
            String v=h.get(temp);
            d=d/10;
            for(int i=0;i<v.length();i++){
                back(h,v.charAt(i)+ans,a,d);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        List<String> a=new ArrayList<String>();
        h.put(2,"abc");
        h.put(3,"def");
        h.put(4,"ghi");
        h.put(5,"jkl");
        h.put(6,"mno");
        h.put(7,"pqrs");
        h.put(8,"tuv");
        h.put(9,"wxyz");
        String ans="";
        if(digits.equals("")){
            return a;
        }
        int d=Integer.parseInt(digits);
        back(h,ans,a,d);
        return a;
    }
}