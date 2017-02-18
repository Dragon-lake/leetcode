# Peeking Iterator

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given an Iterator class interface with methods:
  <code>
   next()
  </code>
  and
  <code>
   hasNext()
  </code>
  , design and implement a PeekingIterator that support the
  <code>
   peek()
  </code>
  operation -- it essentially peek() at the element that will be returned by the next call to next().
 </p>
 <hr/>
 <p>
  Here is an example. Assume that the iterator is initialized to the beginning of the list:
  <code>
   [1, 2, 3]
  </code>
  .
 </p>
 <p>
  Call
  <code>
   next()
  </code>
  gets you 1, the first element in the list.
 </p>
 <p>
  Now you call
  <code>
   peek()
  </code>
  and it returns 2, the next element. Calling
  <code>
   next()
  </code>
  after that
  <i>
   <b>
    still
   </b>
  </i>
  return 2.
 </p>
 <p>
  You call
  <code>
   next()
  </code>
  the final time and it returns 3, the last element. Calling
  <code>
   hasNext()
  </code>
  after that should return false.
 </p>
 <ol id="hints">
  <li class="hint">
   Think of "looking ahead". You want to cache the next element.
  </li>
  <li class="hint">
   Is one variable sufficient? Why or why not?
  </li>
  <li class="hint">
   Test your design with call order of
   <code>
    peek()
   </code>
   before
   <code>
    next()
   </code>
   vs
   <code>
    next()
   </code>
   before
   <code>
    peek()
   </code>
   .
  </li>
  <li class="hint">
   For a clean implementation, check out
   <a href="https://github.com/google/guava/blob/703ef758b8621cfbab16814f01ddcc5324bdea33/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterators.java#L1125" target="_blank">
    Google's guava library source code
   </a>
   .
  </li>
 </ol>
 <p>
  <b>
   Follow up
  </b>
  : How would you extend your design to be generic and work with all types, not just integer?
 </p>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://leetcode.com/discuss/user/porker2008">
   @porker2008
  </a>
  for adding this problem and creating all test cases.
 </p>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/peeking-iterator/)
