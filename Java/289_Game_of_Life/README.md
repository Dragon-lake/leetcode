# Game of Life

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  According to the
  <a href="https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life" target="_blank">
   Wikipedia's article
  </a>
  : "The
  <b>
   Game of Life
  </b>
  , also known simply as
  <b>
   Life
  </b>
  , is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 </p>
 <p>
  Given a
  <i>
   board
  </i>
  with
  <i>
   m
  </i>
  by
  <i>
   n
  </i>
  cells, each cell has an initial state
  <i>
   live
  </i>
  (1) or
  <i>
   dead
  </i>
  (0). Each cell interacts with its
  <a href="https://en.wikipedia.org/wiki/Moore_neighborhood" target="_blank">
   eight neighbors
  </a>
  (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 </p>
 <p>
 </p>
 <ol>
  <li>
   Any live cell with fewer than two live neighbors dies, as if caused by under-population.
  </li>
  <li>
   Any live cell with two or three live neighbors lives on to the next generation.
  </li>
  <li>
   Any live cell with more than three live neighbors dies, as if by over-population..
  </li>
  <li>
   Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
  </li>
 </ol>
 <p>
  Write a function to compute the next state (after one update) of the board given its current state.
 </p>
 <p>
  <b>
   Follow up
  </b>
  :
  <br/>
 </p>
 <ol>
  <li>
   Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
  </li>
  <li>
   In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
  </li>
 </ol>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://leetcode.com/discuss/user/jianchao.li.fighter">
   @jianchao.li.fighter
  </a>
  for adding this problem and creating all test cases.
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/game-of-life/)
