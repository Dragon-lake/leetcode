# Binary Tree Level Order Traversal II

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a binary tree, return the
  <i>
   bottom-up level order
  </i>
  traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 </p>
 <p>
  For example:
  <br/>
  Given binary tree
  <code>
   {3,9,20,#,#,15,7}
  </code>
  ,
  <br/>
 </p>
 <pre>
    3
   / \
  9  20
    /  \
   15   7
</pre>
 <p>
  return its bottom-up level order traversal as:
  <br/>
 </p>
 <pre>
[
  [15,7],
  [9,20],
  [3]
]
</pre>
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
[Leetcode](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
