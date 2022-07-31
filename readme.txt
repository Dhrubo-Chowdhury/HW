Bingo Game in Java

We keep all the drawn numbers in a ArrayList and iterate through it. In each iteration, we check if the number appears in the given Bingo card, if the number exists, we add the row and column number in the HashSet and check if we have already won. The isBingoVerify method checks all the rows, columns and diagonals to see if we have won

Initially, we keep the bingo card in a 2D integer array with the middle element as -1

Assumptions made:
1. first column in the Bingo card contains only values from 1-15
1. second column in the Bingo card contains only values from 16-30
1. third column in the Bingo card contains only values from 31-45
1. fourth column in the Bingo card contains only values from 46-60
1. fifth column in the Bingo card contains only values from 61-75
