# Different Ways to Add Parentheses

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are
  <code>
   +
  </code>
  ,
  <code>
   -
  </code>
  and
  <code>
   *
  </code>
  .
 </p>
 <br/>
 <b>
  Example 1
 </b>
 <p>
  Input:
  <code>
   "2-1-1"
  </code>
  .
 </p>
 <pre>((2-1)-1) = 0
(2-(1-1)) = 2</pre>
 <p>
  Output:
  <code>
   [0, 2]
  </code>
 </p>
 <br/>
 <b>
  Example 2
 </b>
 <p>
  Input:
  <code>
   "2*3-4*5"
  </code>
 </p>
 <pre>(2*(3-(4*5))) = -34
((2*3)-(4*5)) = -14
((2*(3-4))*5) = -10
(2*((3-4)*5)) = -10
(((2*3)-4)*5) = 10</pre>
 <p>
  Output:
  <code>
   [-34, -14, -10, -10, 10]
  </code>
 </p>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://leetcode.com/discuss/user/mithmatt">
   @mithmatt
  </a>
  for adding this problem and creating all test cases.
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/different-ways-to-add-parentheses/)
