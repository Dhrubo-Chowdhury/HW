Bingo Game in Java

We keep all the drawn numbers in a ArrayList and iterate through it. In each iteration, we check if the number appears in the given Bingo card, if the number exists, we add the row and column number in the HashSet and check if we have already won. The isBingoVerify method checks all the rows, columns and diagonals to see if we have won

Initially, we keep the bingo card in a 2D integer array with the middle element as -1
