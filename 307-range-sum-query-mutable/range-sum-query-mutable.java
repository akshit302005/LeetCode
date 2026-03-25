class NumArray {
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        this.n=nums.length;
        this.tree=new int[4*n];
        build(nums,1,0,n-1);
    }
    private void build(int[] nums, int node , int start , int end){
        if(start==end){
            this.tree[node]=nums[start];
            return;
        }else{
            int mid = start+(end-start)/2;
            build(nums,2*node,start,mid);
            build(nums,2*node+1,mid+1,end);

            tree[node]=tree[2*node] + tree[2*node+1];
        }
    }
    
    public void update(int index, int val) {
        updateHelper(1,0,n-1,index,val);
        
    }
    private void updateHelper(int node,int start, int end, int idx , int val){
        if(start==end){
            tree[node]=val;
            return;
        }
        int mid = start+(end-start)/2;
        if(idx<=mid){
            updateHelper(2*node, start,mid,idx,val);
        }else{
            updateHelper(2*node+1,mid+1,end,idx,val);
        }
        tree[node]=tree[2*node] + tree[2*node+1];
    }
    
    public int sumRange(int left, int right) {
        return sumRangeHelper(1,0,n-1,left,right);
    }
    private int sumRangeHelper(int node,int start, int end,int l , int r){
        if(start >= l && end <= r){
            return tree[node];
        }
        if(l>end || r<start){
            return 0;
        }
        int mid = start+(end-start)/2;
        int left = sumRangeHelper(2*node,start,mid,l,r);
        int right=sumRangeHelper(2*node+1,mid+1,end,l,r);
        return left+right;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */