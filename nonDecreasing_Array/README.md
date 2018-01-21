## Problem

Given an array with `n` integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if `array[i] <= array[i + 1]` holds for every i (1 <= i < n).


```
sumNumbers("abc123xyz") → 123
```

```
sumNumbers("aa11b33") → 44
```

```
sumNumbers("7 11") → 18
```

Problem available at: [LeetCode Non-Decreasing Array](https://leetcode.com/problems/non-decreasing-array/description/)

## Approach

Iterate through the array till there is a violation to the non-decreasing array constraint. Once one is encountered, we check if we already applied a modification to the array or not (since we are allowed at most 1 modification). If we did, we return false.

If no modification has been applied yet, we look at the neighbours of the current index in order to determine how we will swap the numbers around:

If `nums[i-1]` > `nums[i+1]` we can not but increase `nums[i+1]` to `nums[i]` in order to retrieve the non-decreasing order. This has a risk though, in the case that `nums[i+2]` exists, where it might now be smaller than `nums[i+1]`.

If there is no previous number, or `nums[i-1]` <= `nums[i+1]` we can avoid the aforementioned risk, by decreasing `nums[i]` to `nums[i+1]` to resolve the violation. This is the safest modification, since we know that we did not cause a violation later on.

This algorithm runs in _O_(n)
