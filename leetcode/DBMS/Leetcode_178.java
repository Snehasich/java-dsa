package DBMS;

// https://leetcode.com/problems/rank-scores/description/?envType=problem-list-v2&envId=database

// Example 1:
//
//Input:
//Scores table:
//+----+-------+
//| id | score |
//+----+-------+
//| 1  | 3.50  |
//| 2  | 3.65  |
//| 3  | 4.00  |
//| 4  | 3.85  |
//| 5  | 4.00  |
//| 6  | 3.65  |
//+----+-------+
//Output:
//+-------+------+
//| score | rank |
//+-------+------+
//| 4.00  | 1    |
//| 4.00  | 1    |
//| 3.85  | 2    |
//| 3.65  | 3    |
//| 3.65  | 3    |
//| 3.50  | 4    |
//+-------+------+




// ANSWER

// SELECT
//    score,
//    DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
//FROM Scores
//ORDER BY score DESC;