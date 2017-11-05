##Problem

Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.

maxSpan([1, 2, 1, 1, 3]) → 4

maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6

maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

Problem available at: [codingBat maxSpan](http://codingbat.com/prob/p189576)

##Approch

We will try to solve this problem efficiently by capitalizing on checking the end-point of the spans from the right of the array. This way, we minimize the number of remaining checks we need to perform. For example, if we found in our first iteration that the endpoint is at the end of the array, then we do not need any more checks - we already got our solution.

If we let the `x` be the number of elements to the right of the biggest end point we encountered so far, then we only need to do `x` comparisons to get the maxSpan, because in each iteration the max. possible value for maxSpan decreases by 1 as we go through the numbers on the left of the array.

##Tests

Passes all tests on [codingBat maxSpan](http://codingbat.com/prob/p189576)