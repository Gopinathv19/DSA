package segmentTree;

public class segmentTreeImplementation {
    int n ;
    int [] seg;

    void update (int p){
        seg[p] = Math.max(seg[p<<1],seg[p<<1 | 1]);
    }

    void build (int p,int l,int r,int[] baskets){
          if(l==r) {
              seg[p]=baskets[l];
              return;
          }
          int mid = (l+r)>>1;
          build(p<<1,l,mid,baskets);
          build(p<<1|1,mid+1,r,baskets);
          update(p);
    }

    void assign(int x,int v,int l,int r ,int p){
        if (x<l || x>r) return;
        if(l==r){
            seg[p]=v;
            return;
        }
        int mid = (l+r) >>1;
        assign(x,v,l,mid,p<<1);
        assign(x,v,mid+1,r,p<<1|1);
        update(p);
    }
    int firstLarger(int v,int p,int l,int r){
        if(seg[p]<v){
            return r+1;
        }
        if(l==r){
            return r;
        }
        int mid = (l+r)>>1;
        int lf = firstLarger(v,p<<1,l,mid);
        if(lf<=mid){
            return lf;
        }
        return firstLarger(v,p<<1|1,mid+1,r);
    }
    int numOfFruitsNotFited(int[]fruits,int[]baskets){
        n=fruits.length;
        seg = new int[4*n+1];
        build(1,0,n-1,baskets);
        int res =0;
        for(int x: fruits){
            int pos = firstLarger(x,1,0,n-1);
            if(pos==n) res+=1;
            else{
                assign(pos,0,0,n-1,1);
            }
        }
        return res;
    }
}
