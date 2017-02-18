# Text Justification

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given an array of words and a length
  <i>
   L
  </i>
  , format the text such that each line has exactly
  <i>
   L
  </i>
  characters and is fully (left and right) justified.
 </p>
 <p>
  You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces
  <code>
   ' '
  </code>
  when necessary so that each line has exactly
  <i>
   L
  </i>
  characters.
 </p>
 <p>
  Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 </p>
 <p>
  For the last line of text, it should be left justified and no extra space is inserted between words.
 </p>
 <p>
  For example,
  <br/>
  <b>
   words
  </b>
  :
  <code>
   ["This", "is", "an", "example", "of", "text", "justification."]
  </code>
  <br/>
  <b>
   L
  </b>
  :
  <code>
   16
  </code>
  .
 </p>
 <p>
  Return the formatted lines as:
  <br/>
 </p>
 <pre>
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
</pre>
 <p>
  <b>
   Note:
  </b>
  Each word is guaranteed not to exceed
  <i>
   L
  </i>
  in length.
 </p>
 <div class="spoilers">
  <b>
   Corner Cases:
  </b>
  <p>
  </p>
  <ul>
   <li>
    A line other than the last line might contain only one word. What should you do in this case?
    <br/>
    In this case, that line should be left-justified.
   </li>
  </ul>
 </div>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/text-justification/)
