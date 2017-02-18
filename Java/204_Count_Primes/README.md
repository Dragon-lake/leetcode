# Count Primes

## Problem：

<div class="question-content">
 <p>
 </p>
 <p>
  <b>
   Description:
  </b>
 </p>
 <p>
  Count the number of prime numbers less than a non-negative number,
  <b>
   <i>
    n
   </i>
  </b>
  .
 </p>
 <p>
  <b>
   Credits:
  </b>
  <br/>
  Special thanks to
  <a href="https://leetcode.com/discuss/user/mithmatt">
   @mithmatt
  </a>
  for adding this problem and creating all test cases.
 </p>
 <ol id="hints">
  <li class="hint">
   <p>
    Let's start with a
    <i>
     isPrime
    </i>
    function. To determine if a number is prime, we need to check if it is not divisible by any number less than
    <i>
     n
    </i>
    . The runtime complexity of
    <i>
     isPrime
    </i>
    function would be O(
    <i>
     n
    </i>
    ) and hence counting the total prime numbers up to
    <i>
     n
    </i>
    would be O(
    <i>
     n
    </i>
    <sup>
     2
    </sup>
    ). Could we do better?
   </p>
  </li>
  <li class="hint">
   <p>
    As we know the number must not be divisible by any number &gt;
    <i>
     n
    </i>
    / 2, we can immediately cut the total iterations half by dividing only up to
    <i>
     n
    </i>
    / 2. Could we still do better?
   </p>
  </li>
  <li class="hint">
   <p>
    Let's write down all of 12's factors:
   </p>
   <pre>
2 × 6 = 12
3 × 4 = 12
4 × 3 = 12
6 × 2 = 12
</pre>
   <p>
    As you can see, calculations of 4 × 3 and 6 × 2 are not necessary. Therefore, we only need to consider factors up to √
    <i>
     n
    </i>
    because, if
    <i>
     n
    </i>
    is divisible by some number
    <i>
     p
    </i>
    , then
    <i>
     n
    </i>
    =
    <i>
     p
    </i>
    ×
    <i>
     q
    </i>
    and since
    <i>
     p
    </i>
    ≤
    <i>
     q
    </i>
    , we could derive that
    <i>
     p
    </i>
    ≤ √
    <i>
     n
    </i>
    .
   </p>
   <p>
    Our total runtime has now improved to O(
    <i>
     n
    </i>
    <sup>
     1.5
    </sup>
    ), which is slightly better. Is there a faster approach?
   </p>
   <pre>
public int countPrimes(int n) {
   int count = 0;
   for (int i = 1; i 
  </pre>
  </li>
  <li class="hint">
   <p>
    The
    <a href="http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes" target="_blank">
     Sieve of Eratosthenes
    </a>
    is one of the most efficient ways to find all prime numbers up to
    <i>
     n
    </i>
    . But don't let that name scare you, I promise that the concept is surprisingly simple.
   </p>
   <p>
    <img src="/static/images/solutions/Sieve_of_Eratosthenes_animation.gif"/>
    <br/>
    <small>
     Sieve of Eratosthenes: algorithm steps for primes below 121. "
     <a href="http://commons.wikimedia.org/wiki/File:Sieve_of_Eratosthenes_animation.gif" target="_blank">
      Sieve of Eratosthenes Animation
     </a>
     " by
     <a href="http://de.wikipedia.org/wiki/Benutzer:SKopp" target="_blank">
      SKopp
     </a>
     is licensed under
     <a href="http://creativecommons.org/licenses/by/2.0/" target="_blank">
      CC BY 2.0
     </a>
     .
    </small>
   </p>
   <p>
    We start off with a table of
    <i>
     n
    </i>
    numbers. Let's look at the first number, 2. We know all multiples of 2 must not be primes, so we mark them off as non-primes. Then we look at the next number, 3. Similarly, all multiples of 3 such as 3 × 2 = 6, 3 × 3 = 9, ... must not be primes, so we mark them off as well. Now we look at the next number, 4, which was already marked off. What does this tell you? Should you mark off all multiples of 4 as well?
   </p>
  </li>
  <li class="hint">
   <p>
    4 is not a prime because it is divisible by 2, which means all multiples of 4 must also be divisible by 2 and were already marked off. So we can skip 4 immediately and go to the next number, 5. Now, all multiples of 5 such as 5 × 2 = 10, 5 × 3 = 15, 5 × 4 = 20, 5 × 5 = 25, ... can be marked off. There is a slight optimization here, we do not need to start from 5 × 2 = 10. Where should we start marking off?
   </p>
  </li>
  <li class="hint">
   <p>
    In fact, we can mark off multiples of 5 starting at 5 × 5 = 25, because 5 × 2 = 10 was already marked off by multiple of 2, similarly 5 × 3 = 15 was already marked off by multiple of 3. Therefore, if the current number is
    <i>
     p
    </i>
    , we can always mark off multiples of
    <i>
     p
    </i>
    starting at
    <i>
     p
    </i>
    <sup>
     2
    </sup>
    , then in increments of
    <i>
     p
    </i>
    :
    <i>
     p
    </i>
    <sup>
     2
    </sup>
    +
    <i>
     p
    </i>
    ,
    <i>
     p
    </i>
    <sup>
     2
    </sup>
    + 2
    <i>
     p
    </i>
    , ... Now what should be the terminating loop condition?
   </p>
  </li>
  <li class="hint">
   <p>
    It is easy to say that the terminating loop condition is
    <i>
     p
    </i>
    n, which is certainly correct but not efficient. Do you still remember
    <i>
     Hint #3
    </i>
    ?
   </p>
  </li>
  <li class="hint">
   <p>
    Yes, the terminating loop condition can be
    <i>
     p
    </i>
    n, as all non-primes ≥ √
    <i>
     n
    </i>
    must have already been marked off. When the loop terminates, all the numbers in the table that are non-marked are prime.
   </p>
   <p>
    The Sieve of Eratosthenes uses an extra O(
    <i>
     n
    </i>
    ) memory and its runtime complexity is O(
    <i>
     n
    </i>
    log log
    <i>
     n
    </i>
    ). For the more mathematically inclined readers, you can read more about its algorithm complexity on
    <a href="http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes#Algorithm_complexity" target="_blank">
     Wikipedia
    </a>
    .
   </p>
   <pre>
public int countPrimes(int n) {
   boolean[] isPrime = new boolean[n];
   for (int i = 2; i 
  </pre>
  </li>
 </ol>
</div>


## Source:
[Leetcode](https://leetcode.com/problems/count-primes/)
