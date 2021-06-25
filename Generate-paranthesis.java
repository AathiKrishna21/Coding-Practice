class Solution {
    public void para(List<String> t,char[] c,int p,int n,int open,int close){
        if(close==n){
            String str="";
            for(int i=0;i<2*n;i++){
                str=str+c[i];
            }
            t.add(str);
        }
        else{
            if(open>close){
                c[p]=')';
                para(t,c,p+1,n,open,close+1);
            }
            if(open<n){
                c[p]='(';
                para(t,c,p+1,n,open+1,close);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        char[] c=new char[2*n];
        List<String> a=new ArrayList<String>();
        if(n>0){
            para(a,c,0,n,0,0);
        }
        return a;
    }
}