# Course Schedule II

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
  , return the ordering of courses you should take to finish all courses.
 </p>
 <p>
  There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.
 </p>
 <p>
  For example:
 </p>
 <pre>2, [[1,0]]</pre>
 <p>
  There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is
  <code>
   [0,1]
  </code>
 </p>
 <pre>4, [[1,0],[2,0],[3,1],[3,2]]</pre>
 <p>
  There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0. So one correct course order is
  <code>
   [0,1,2,3]
  </code>
  . Another correct ordering is
  <code>
   [0,2,1,3]
  </code>
  .
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
    This problem is equivalent to finding the topological order in a directed graph. If a cycle exists, no topological ordering exists and therefore it will be impossible to take all courses.
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
[Leetcode](https://leetcode.com/problems/course-schedule-ii/)
