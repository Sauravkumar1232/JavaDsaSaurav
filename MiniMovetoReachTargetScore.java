public class MiniMovetoReachTargetScore {
    public static void main(String[] args) {
        System.out.println(minMoves(5,0));

    }
    static int minMoves(int target,int maxDouble){
       return helper(target,maxDouble,0);
    }
    static int helper(int target,int maxDouble,int minMoves){
        int x=1;
        if(x==target){
            return minMoves;
        }
        helper(target, maxDouble, minMoves)
    }
}
