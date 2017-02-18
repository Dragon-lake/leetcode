# Regular Expression Matching

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Implement regular expression matching with support for
  <code>
   '.'
  </code>
  and
  <code>
   '*'
  </code>
  .
 </p>
 <pre>
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the <b>entire</b> input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
</pre>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/regular-expression-matching/)
