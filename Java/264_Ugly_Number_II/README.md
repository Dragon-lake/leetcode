# Ugly Number II

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Write a program to find the
  <code>
   n
  </code>
  -th ugly number.
 </p>
 <p>
  Ugly numbers are positive numbers whose prime factors only include
  <code>
   2, 3, 5
  </code>
  . For example,
  <code>
   1, 2, 3, 4, 5, 6, 8, 9, 10, 12
  </code>
  is the sequence of the first
  <code>
   10
  </code>
  ugly numbers.
 </p>
 <p>
  Note that
  <code>
   1
  </code>
  is typically treated as an ugly number.
 </p>
 <ol id="hints">
  <li class="hint">
   The naive approach is to call
   <code>
    isUgly
   </code>
   for every number until you reach the n
   <sup>
    th
   </sup>
   one. Most numbers are
   <i>
    not
   </i>
   ugly. Try to focus your effort on generating only the ugly ones.
  </li>
  <li class="hint">
   An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.
  </li>
  <li class="hint">
   The key is how to maintain the order of the ugly numbers. Try a similar approach of merging from three sorted lists: L
   <sub>
    1
   </sub>
   , L
   <sub>
    2
   </sub>
   , and L
   <sub>
    3
   </sub>
   .
  </li>
  <li class="hint">
   Assume you have U
   <sub>
    k
   </sub>
   , the k
   <sup>
    th
   </sup>
   ugly number. Then U
   <sub>
    k+1
   </sub>
   must be Min(L
   <sub>
    1
   </sub>
   * 2, L
   <sub>
    2
   </sub>
   * 3, L
   <sub>
    3
   </sub>
   * 5).
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
[Leetcode](https://leetcode.com/problems/ugly-number-ii/)
