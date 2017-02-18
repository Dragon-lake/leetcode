# Simplify Path

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given an absolute path for a file (Unix-style), simplify it.
 </p>
 <p>
  For example,
  <br/>
  <b>
   path
  </b>
  =
  <code>
   "/home/"
  </code>
  , =&gt;
  <code>
   "/home"
  </code>
  <br/>
  <b>
   path
  </b>
  =
  <code>
   "/a/./b/../../c/"
  </code>
  , =&gt;
  <code>
   "/c"
  </code>
  <br/>
 </p>
 <div class="spoilers">
  <b>
   Corner Cases:
  </b>
  <p>
  </p>
  <ul>
   <li>
    Did you consider the case where
    <b>
     path
    </b>
    =
    <code>
     "/../"
    </code>
    ?
    <br/>
    In this case, you should return
    <code>
     "/"
    </code>
    .
   </li>
   <li>
    Another corner case is the path might contain multiple slashes
    <code>
     '/'
    </code>
    together, such as
    <code>
     "/home//foo/"
    </code>
    .
    <br/>
    In this case, you should ignore redundant slashes and return
    <code>
     "/home/foo"
    </code>
    .
   </li>
  </ul>
 </div>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/simplify-path/)
