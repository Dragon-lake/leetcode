# Word Search II

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  Given a 2D board and a list of words from the dictionary, find all words in the board.
 </p>
 <p>
  Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 </p>
 <p>
  For example,
  <br/>
  Given
  <b>
   words
  </b>
  =
  <code>
   ["oath","pea","eat","rain"]
  </code>
  and
  <b>
   board
  </b>
  =
 </p>
 <pre>
[
  ['<span style="color:#d70">o</span>','<span style="color:#d70">a</span>','a','n'],
  ['e','<span style="color:#d30">t</span>','<span style="color:#d00">a</span>','<span style="color:#d00">e</span>'],
  ['i','<span style="color:#d70">h</span>','k','r'],
  ['i','f','l','v']
]
</pre>
 Return
 <code>
  ["eat","oath"]
 </code>
 .
 <p>
  <b>
   Note:
  </b>
  <br/>
  You may assume that all inputs are consist of lowercase letters
  <code>
   a-z
  </code>
  .
 </p>
 <div class="spoilers">
  <p>
   You would need to optimize your backtracking to pass the larger test. Could you stop backtracking earlier?
  </p>
  <p>
   If the current candidate does not exist in all words' prefix, you could stop backtracking immediately. What kind of data structure could answer such query efficiently? Does a hash table work? Why or why not? How about a Trie? If you would like to learn how to implement a basic trie, please work on this problem:
   <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">
    Implement Trie (Prefix Tree)
   </a>
   first.
  </p>
 </div>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/word-search-ii/)
