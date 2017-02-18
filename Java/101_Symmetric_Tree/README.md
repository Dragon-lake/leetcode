# Symmetric Tree

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 </p>
 <p>
  For example, this binary tree is symmetric:
 </p>
 <pre>
    1
   / \
  2   2
 / \ / \
3  4 4  3
</pre>
 <p>
  But the following is not:
  <br/>
 </p>
 <pre>
    1
   / \
  2   2
   \   \
   3    3
</pre>
 <p>
  <b>
   Note:
  </b>
  <br/>
  Bonus points if you could solve it both recursively and iteratively.
 </p>
 <div class="spoilers">
  <br/>
  <b>
   OJ's Binary Tree Serialization:
  </b>
  <p>
   The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
  </p>
  <p>
   Here's an example:
   <br/>
  </p>
  <pre>
   1
  / \
 2   3
    /
   4
    \
     5
</pre>
  The above binary tree is serialized as
  <code>
   "{1,2,3,#,#,4,#,#,5}"
  </code>
  .
 </div>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/symmetric-tree/)
