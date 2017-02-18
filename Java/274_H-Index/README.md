# H-Index

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.
 </p>
 <p>
  According to the
  <a href="https://en.wikipedia.org/wiki/H-index" target="_blank">
   definition of h-index on Wikipedia
  </a>
  : "A scientist has index
  <i>
   h
  </i>
  if
  <i>
   h
  </i>
  of his/her
  <i>
   N
  </i>
  papers have
  <b>
   at least
  </b>
  <i>
   h
  </i>
  citations each, and the other
  <i>
   N − h
  </i>
  papers have
  <b>
   no more than
  </b>
  <i>
   h
  </i>
  citations each."
 </p>
 <p>
  For example, given
  <code>
   citations = [3, 0, 6, 1, 5]
  </code>
  , which means the researcher has
  <code>
   5
  </code>
  papers in total and each of them had received
  <code>
   3, 0, 6, 1, 5
  </code>
  citations respectively. Since the researcher has
  <code>
   3
  </code>
  papers with
  <b>
   at least
  </b>
  <code>
   3
  </code>
  citations each and the remaining two with
  <b>
   no more than
  </b>
  <code>
   3
  </code>
  citations each, his h-index is
  <code>
   3
  </code>
  .
 </p>
 <p>
  <b>
   Note
  </b>
  : If there are several possible values for
  <code>
   h
  </code>
  , the maximum one is taken as the h-index.
 </p>
 <ol id="hints">
  <li class="hint">
   An easy approach is to sort the array first.
  </li>
  <li class="hint">
   What are the possible values of h-index?
  </li>
  <li class="hint">
   A faster approach is to use extra space.
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
[Leetcode](https://leetcode.com/problems/h-index/)
