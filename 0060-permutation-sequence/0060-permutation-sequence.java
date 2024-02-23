class Solution {
    public String getPermutation(int n, int k) {
         if(n<1||n>9) return "";
        if(k<1||k>factorial(n)) return "";
        String result="";
        ArrayList<Integer> index=new ArrayList<Integer>();
        for(int i=0;i<n;i++) index.add(0);
        ArrayList<Integer> res=new ArrayList<Integer>();
        int kk=k-1;
        for(int i=n-1;i>=0;i--){
            while(kk>=factorial(i)){
                index.set(i,index.get(i)+1);
                kk -=factorial(i);
            }
        }
        for(int i=0;i<n;i++) res.add(i+1);
        for(int i=n-1;i>=0;i--){
            result +=(char)(res.get(index.get(i))+'0');
            res.remove(res.get(index.get(i)));//注意Arraylist的remove方法的用法
        }
        return result;
    }
    int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++) f *=i;
        return f;
    }
}