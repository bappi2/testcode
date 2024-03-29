public class CountBattleShip {

    public int countBattleships(char[][] board) {
        int m = board.length;
        if (m==0) return 0;
        int n = board[0].length;

        int count=0;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i-1][j] == 'X') continue;
                if (j > 0 && board[i][j-1] == 'X') continue;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountBattleShip cb = new CountBattleShip();
        char[][] board = {{'X','.','.','X'},
                          {'.','X','.','X'},
                          {'.','.','.','X'}};
            System.out.println(cb.countBattleships(board));
            System.out.println(cb.countBattleships(new char[][]{{'X'}}));
            System.out.println(cb.countBattleships(new char[][]{}));
            System.out.println(cb.countBattleships(new char[][]{{'.'}}));
            System.out.println(cb.countBattleships(new char[][]{{'.','.'},{'.','.'},{'.','.'},{'.','.'}}));
    }
}
