class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int i=0;
        int j=0;
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> d=new ArrayList<Integer>();
        
        while(i<n && j<m){
            if(a[i]==b[j]){
                if(d.size()==0 || d.get(d.size()-1)!=a[i]){
                    d.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                  if(d.size()==0 || d.get(d.size()-1)!=b[j]){
                   d.add(b[j]);   
                  }
                  j++;
            }
            else if(b[j]>a[i]){
                  if(d.size()==0 || d.get(d.size()-1)!=a[i]){
                   d.add(a[i]); 
                  
                  }
                  i++;
            }
        }
        while(i<n){
            
             if(d.size()==0 || d.get(d.size()-1)!=a[i]){
                 d.add(a[i]);
        }
        i++;
    }
    while(j<m){
            
             if(d.size()==0 || d.get(d.size()-1)!=b[j]){
                 d.add(b[j]);
        }
        j++;
    }
    return d;
}
}
