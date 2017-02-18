# Validate Binary Search Tree

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a binary tree, determine if it is a valid binary search tree (BST).
 </p>
 <p>
  Assume a BST is defined as follows:
 </p>
 <ul>
  <li>
   The left subtree of a node contains only nodes with keys
   <b>
    less than
   </b>
   the node's key.
  </li>
  <li>
   The right subtree of a node contains only nodes with keys
   <b>
    greater than
   </b>
   the node's key.
  </li>
  <li>
   Both the left and right subtrees must also be binary search trees.
  </li>
 </ul>
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
[Leetcode](https://leetcode.com/problems/validate-binary-search-tree/)
