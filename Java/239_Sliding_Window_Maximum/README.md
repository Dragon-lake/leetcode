# Sliding Window Maximum

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given an array
  <i>
   nums
  </i>
  , there is a sliding window of size
  <i>
   k
  </i>
  which is moving from the very left of the array to the very right. You can only see the
  <i>
   k
  </i>
  numbers in the window. Each time the sliding window moves right by one position.
 </p>
 <p>
  For example,
  <br/>
  Given
  <i>
   nums
  </i>
  =
  <code>
   [1,3,-1,-3,5,3,6,7]
  </code>
  , and
  <i>
   k
  </i>
  = 3.
 </p>
 <pre>
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
</pre>
 <p>
  Therefore, return the max sliding window as
  <code>
   [3,3,5,5,6,7]
  </code>
  .
 </p>
 <p>
  <b>
   Note:
  </b>
  <br/>
  You may assume
  <i>
   k
  </i>
  is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 </p>
 <p>
  <b>
   Follow up:
  </b>
  <br/>
  Could you solve it in linear time?
 </p>
 <ol id="hints">
  <li class="hint">
   How about using a data structure such as deque (double-ended queue)?
  </li>
  <li class="hint">
   The queue size need not be the same as the window’s size.
  </li>
  <li class="hint">
   Remove redundant elements and the queue should store only elements that need to be considered.
  </li>
 </ol>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/sliding-window-maximum/)
