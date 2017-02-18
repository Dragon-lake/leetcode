# Dungeon Game

## Problem：

<div class="question-content">
 <p>
  <style>
   table.dungeon, .dungeon th, .dungeon td {
  border:3px solid black;
}

 .dungeon th, .dungeon td {
    text-align: center;
    height: 70px;
    width: 70px;
}
  </style>
 </p>
 <p>
  The demons had captured the princess (
  <b>
   P
  </b>
  ) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (
  <b>
   K
  </b>
  ) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.
 </p>
 <p>
  The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.
 </p>
 <p>
  Some of the rooms are guarded by demons, so the knight loses health (
  <i>
   negative
  </i>
  integers) upon entering these rooms; 
other rooms are either empty (
  <i>
   0's
  </i>
  ) or contain magic orbs that increase the knight's health (
  <i>
   positive
  </i>
  integers).
 </p>
 <p>
  In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.
 </p>
 <br/>
 <p>
  <b>
   Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.
  </b>
 </p>
 <p>
  For example, given the dungeon below, the initial health of the knight must be at least
  <b>
   7
  </b>
  if he follows the optimal path
  <code>
   RIGHT-&gt; RIGHT -&gt; DOWN -&gt; DOWN
  </code>
  .
 </p>
 <table class="dungeon">
  <tr>
   <td>
    -2 (K)
   </td>
   <td>
    -3
   </td>
   <td>
    3
   </td>
  </tr>
  <tr>
   <td>
    -5
   </td>
   <td>
    -10
   </td>
   <td>
    1
   </td>
  </tr>
  <tr>
   <td>
    10
   </td>
   <td>
    30
   </td>
   <td>
    -5 (P)
   </td>
  </tr>
 </table>
 <!---2K   -3  3
-5   -10   1
10 30   5P-->
 <br/>
 <p>
  <b>
   Notes:
  </b>
 </p>
 <ul>
  <li>
   The knight's health has no upper bound.
  </li>
  <li>
   Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.
  </li>
 </ul>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://oj.leetcode.com/discuss/user/stellari">
   @stellari
  </a>
  for adding this problem and creating all test cases.
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/dungeon-game/)
