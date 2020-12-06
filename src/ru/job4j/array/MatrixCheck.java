package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    //6.7.2. Моно столбец в матрице. [#409029]
    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    //6.7.3. Массив из диагонали матрицы. [#409030]
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i+1];
        }
        return rsl;
    }
}
