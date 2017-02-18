# Integer to English Words

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 2
  <sup>
   31
  </sup>
  - 1.
 </p>
 <p>
  For example,
  <br/>
 </p>
 <pre>
123 -&gt; "One Hundred Twenty Three"
12345 -&gt; "Twelve Thousand Three Hundred Forty Five"
1234567 -&gt; "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"</pre>
 <ol id="hints">
  <li class="hint">
   Did you see a pattern in dividing the number into chunk of words? For example, 123 and 123000.
  </li>
  <li class="hint">
   Group the number by thousands (3 digits). You can write a helper function that takes a number less than 1000 and convert just that chunk to words.
  </li>
  <li class="hint">
   There are many edge cases. What are some good test cases? Does your code work with input such as 0? Or 1000010? (middle chunk is zero and should not be printed out)
  </li>
 </ol>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/integer-to-english-words/)
