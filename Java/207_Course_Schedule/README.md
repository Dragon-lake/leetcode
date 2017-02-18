# Course Schedule

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  There are a total of
  <i>
   n
  </i>
  courses you have to take, labeled from
  <code>
   0
  </code>
  to
  <code>
   n - 1
  </code>
  .
 </p>
 <p>
  Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair:
  <code>
   [0,1]
  </code>
 </p>
 <p>
  Given the total number of courses and a list of prerequisite
  <b>
   pairs
  </b>
  , is it possible for you to finish all courses?
 </p>
 <p>
  For example:
 </p>
 <pre>2, [[1,0]]</pre>
 <p>
  There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
 </p>
 <pre>2, [[1,0],[0,1]]</pre>
 <p>
  There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 </p>
 <p>
  <b>
   Note:
  </b>
  <br/>
  The input prerequisites is a graph represented by
  <b>
   a list of edges
  </b>
  , not adjacency matrices. Read more about
  <a href="https://www.khanacademy.org/computing/computer-science/algorithms/graph-representation/a/representing-graphs" target="_blank">
   how a graph is represented
  </a>
  .
 </p>
 <div class="spoilers">
  <b>
   Hints:
  </b>
  <ol>
   <li>
    This problem is equivalent to finding if a cycle exists in a directed graph. If a cycle exists, no topological ordering exists and therefore it will be impossible to take all courses.
   </li>
   <li>
    <a href="https://class.coursera.org/algo-003/lecture/52" target="_blank">
     Topological Sort via DFS
    </a>
    - A great video tutorial (21 minutes) on Coursera explaining the basic concepts of Topological Sort.
   </li>
   <li>
    Topological sort could also be done via
    <a href="http://en.wikipedia.org/wiki/Topological_sorting#Algorithms" target="_blank">
     BFS
    </a>
    .
   </li>
  </ol>
 </div>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/course-schedule/)
