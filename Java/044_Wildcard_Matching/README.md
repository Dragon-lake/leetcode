# Wildcard Matching

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Implement wildcard pattern matching with support for
  <code>
   '?'
  </code>
  and
  <code>
   '*'
  </code>
  .
 </p>
 <pre>
'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the <b>entire</b> input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "*") → true
isMatch("aa", "a*") → true
isMatch("ab", "?*") → true
isMatch("aab", "c*a*b") → false
</pre>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/wildcard-matching/)
