# Binary Tree Inorder Traversal

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a binary tree, return the
  <i>
   inorder
  </i>
  traversal of its nodes' values.
 </p>
 <p>
  For example:
  <br/>
  Given binary tree
  <code>
   {1,#,2,3}
  </code>
  ,
  <br/>
 </p>
 <pre>
   1
    \
     2
    /
   3
</pre>
 <p>
  return
  <code>
   [1,3,2]
  </code>
  .
 </p>
 <p>
  <b>
   Note:
  </b>
  Recursive solution is trivial, could you do it iteratively?
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
[Leetcode](https://leetcode.com/problems/binary-tree-inorder-traversal/)
