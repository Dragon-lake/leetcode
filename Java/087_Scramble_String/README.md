# Scramble String

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a string
  <i>
   s1
  </i>
  , we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 </p>
 <p>
  Below is one possible representation of
  <i>
   s1
  </i>
  =
  <code>
   "great"
  </code>
  :
 </p>
 <pre>
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>
 <p>
  To scramble the string, we may choose any non-leaf node and swap its two children.
 </p>
 <p>
  For example, if we choose the node
  <code>
   "gr"
  </code>
  and swap its two children, it produces a scrambled string
  <code>
   "rgeat"
  </code>
  .
 </p>
 <pre>
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>
 <p>
  We say that
  <code>
   "rgeat"
  </code>
  is a scrambled string of
  <code>
   "great"
  </code>
  .
 </p>
 <p>
  Similarly, if we continue to swap the children of nodes
  <code>
   "eat"
  </code>
  and
  <code>
   "at"
  </code>
  , it produces a scrambled string
  <code>
   "rgtae"
  </code>
  .
 </p>
 <pre>
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>
 <p>
  We say that
  <code>
   "rgtae"
  </code>
  is a scrambled string of
  <code>
   "great"
  </code>
  .
 </p>
 <p>
  Given two strings
  <i>
   s1
  </i>
  and
  <i>
   s2
  </i>
  of the same length, determine if
  <i>
   s2
  </i>
  is a scrambled string of
  <i>
   s1
  </i>
  .
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/scramble-string/)
