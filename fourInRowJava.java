
public class Game 
    {
        
        public static boolean firstPlayer(player p)
        {
            for (int col = 0; col < COL; col++)
            {
                for (int row = 0; row < ROW; row++)
                {
                    if (col == p1.Col() && row == p1.Row())
                    {
                        board[col][row] = "+";
                    }
                }
            }
        }
        public static boolean secondPlayer(player p)
        {
            for (int col = 0; col < COL; col++)
            {
                for (int row = 0; row < ROW; row++)
                {
                    if (col == p1.Col() && row == p1.Row())
                    {
                        board[col][row] = "-";
                    }
                }
            }
        }
    }
    public interface class board
    {
        final static int row = 7;
        final static int col = 6;
        char[][] TheBoard = {
                                        {" ", " ", " ", " ", " ", " ", " "}, 
                                        {" ", " ", " ", " ", " ", " ", " "}, 
                                        {" ", " ", " ", " ", " ", " ", " "}, 
                                        {" ", " ", " ", " ", " ", " ", " "}, 
                                        {" ", " ", " ", " ", " ", " ", " "}, 
                                        {" ", " ", " ", " ", " ", " ", " "}};
        
        public static void printBoard(board b)
        {
            for (int col = 0; col < COL; col++)
            {
                for (int row = 0; row < ROW; row++)
                {
                    System.out.println(TheBoard[col][row] + "");    
                }
            }
        }
    }
    
    class player
    {
        static int Row;
        static int Col;
    }
    public class cheakForWin
    {
        public static boolean CheakForWin(board b)
        {
            for (int row = 0; row < ROW; row++)
            {
                if (TheBoard[col][row] == "+" &&
                    TheBoard[col ][row + 1] == "+" &&
                    TheBoard[col][row + 2] == "+" &&
                    TheBoard[col][row + 3] == "+" ||
                    TheBoard[col][row] == "+" &&
                    TheBoard[col + 1][row] == "+" &&
                    TheBoard[col+ 2][row] == "+" &&
                    TheBoard[col + 3][row] == "+" ||
                    TheBoard[col][row] == "+" &&
                    TheBoard[col + 1][row + 1] == "+" &&
                    TheBoard[col+ 2][row + 2] == "+" &&
                    TheBoard[col + 3][row + 3] == "+" ||
                    TheBoard[col][row] == "+" &&
                    TheBoard[col - 1][row + 1] == "+" &&
                    TheBoard[col - 2][row + 2] == "+" &&
                    TheBoard[col - 3][row + 3] == "+")
                    {
                        System.out.println("The first player win!!!"); 
                    }
                if (TheBoard[col][row] == "-" &&
                    TheBoard[col ][row + 1] == "-" &&
                    TheBoard[col][row + 2] == "-" &&
                    TheBoard[col][row + 3] == "-" ||
                    TheBoard[col][row] == "-" &&
                    TheBoard[col + 1][row] == "-" &&
                    TheBoard[col+ 2][row] == "-" &&
                    TheBoard[col + 3][row] == "-" ||
                    TheBoard[col][row] == "-" &&
                    TheBoard[col + 1][row + 1] == "-" &&
                    TheBoard[col+ 2][row + 2] == "-" &&
                    TheBoard[col + 3][row + 3] == "-" ||
                    TheBoard[col][row] == "-" &&
                    TheBoard[col - 1][row + 1] == "-" &&
                    TheBoard[col - 2][row + 2] == "-" &&
                    TheBoard[col - 3][row + 3] == "-")
                    {
                        System.out.println("The second player win!!!"); 

                    }
            }
        }
    }
    public static void main(String[] args) 
    {
        board b = new board();
        Game g = new Game();
        player p1 = new player();
        player p2 = new player();
        System.out.println("First player turn"); 
        g.firstPlayer(p1);
        b.printBoard(b);
        p1.CheakForWin(b);
        p2.CheakForWin(b);
        System.out.println("Second player turn"); 
        g.secondPlayer(p2);
        b.printBoard(b);
        p1.CheakForWin(b);
        p2.CheakForWin(b);
        
    }