public class Sudoku {
    static int board[][] = {
        {5,3,0,0,7,0,0,0,0}
    ,{6,0,0,1,9,5,0,0,0}
    ,{0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}};

        static void  print(){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    static boolean solver(int row,int col){

        //befor going in 1 to 9 option check that cell is empty
        if(col==board.length){
            col=0;
            row=row+1;
        }

        if(row==board.length){
           print();
            return true;
        }


        if(board[row][col]!=0){
            return solver(row, col+1);
        }
        //loop for 1 to 9 posiblity
        for(int value=1;value<=9;value++){
            if(canIPlaceValue(row,col,value)){
                //now value can be place
                board[row][col]=value;
                boolean result=solver(row, col+1);
                if(result){
                    return true;
                }
                board[row][col]=0;  //backtraking
            }
        }
        return false;
    }
    private static boolean canIPlaceValue(int row, int col, int value) {
        //check value in row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==value){
                return false;
            }
        }

        //check value in column
        for(int i=0;i<board.length;i++){
            if(board[i][col]==value){
                return false;
            }
        }

        //value in subgrid
       int  startRow=row-row%3;
        int startCol=col-col%3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==value){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean r=solver(0,0);
        System.out.println(r);
    }
}
