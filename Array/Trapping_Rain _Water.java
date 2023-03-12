class  Trapping_Rain_Water{
    public static void main(String[] args) {
        //System.out.println("sas");
        int[] column={0,1,0,2,1,1,3,2,1,2,1};
        int total=0;
        int n=column.length;
        int pmax[]={0,1,1,2,2,2,2,3,3,3,3,3};
        int smax[]={3,3,3,3,3,2,2,2,2,1,1,0};
       // pmax[0]=column[0];
        for (int i = 0; i < n; i++) {
            int curret=column[i];
            int height=Math.min(pmax[i],smax[i]);
            if(height>curret){
                total+=height-curret;
            }
        }
        System.out.println(total);
    }
}