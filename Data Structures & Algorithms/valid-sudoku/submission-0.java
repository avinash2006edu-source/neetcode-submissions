class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char num=board[row][col];

                if(num=='.'){
                    continue;
                }
                int box=(row/3)*3+(col/3);
                String rowCheck=num+"row"+row;
                String colCheck=num+"col"+col;
                String boxCheck = num+ "box" +box;

                if(set.contains(rowCheck)||set.contains(colCheck)|| set.contains(boxCheck)){
                    return false;
                }
                set.add(rowCheck);
                set.add(colCheck);
                set.add(boxCheck);



            }
        }
        return true;
    }
}
