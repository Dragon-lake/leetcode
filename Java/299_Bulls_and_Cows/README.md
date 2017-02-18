# Bulls and Cows

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  You are playing the following
  <a href="https://en.wikipedia.org/wiki/Bulls_and_Cows" target="_blank">
   Bulls and Cows
  </a>
  game with your friend: You write a 4-digit secret number and ask your friend to guess it. Each time your friend guesses a number, you give a hint. The hint tells your friend how many digits are in the correct positions (called "bulls") and how many digits are in the wrong positions (called "cows"). Your friend will use those hints to find out the secret number.
 </p>
 <p>
  For example:
 </p>
 <pre>
Secret number:  "1807"
Friend's guess: "7810"
</pre>
 Hint:
 <code>
  1
 </code>
 bull and
 <code>
  3
 </code>
 cows. (The bull is
 <code>
  8
 </code>
 , the cows are
 <code>
  0
 </code>
 ,
 <code>
  1
 </code>
 and
 <code>
  7
 </code>
 .)
 <p>
  Write a function to return a hint according to the secret number and friend's guess, use
  <code>
   A
  </code>
  to indicate the bulls and
  <code>
   B
  </code>
  to indicate the cows. In the above example, your function should return
  <code>
   "1A3B"
  </code>
  .
 </p>
 <p>
  Please note that both secret number and friend's guess may contain duplicate digits, for example:
 </p>
 <pre>
Secret number:  "1123"
Friend's guess: "0111"
</pre>
 In this case, the 1st
 <code>
  1
 </code>
 in friend's guess is a bull, the 2nd or 3rd
 <code>
  1
 </code>
 is a cow, and your function should return
 <code>
  "1A1B"
 </code>
 .
 <p>
  You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 </p>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://leetcode.com/discuss/user/jeantimex">
   @jeantimex
  </a>
  for adding this problem and creating all test cases.
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/bulls-and-cows/)
