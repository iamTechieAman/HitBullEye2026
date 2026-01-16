
**Array Problems in Java** 

This document explains two important array problems:
1. Majority Element
2. Rotate Array

---

## 1. Majority Element

### Problem Statement
Given an array `nums` of size `n`, return the **majority element**.  
The majority element is the element that appears **more than ⌊n/2⌋ times**.

---

### Approach 1: Using HashMap

#### Explanation
- Count the frequency of each element using a `HashMap`
- Traverse the map and return the element whose count is greater than `n/2`

#### Code
```java
public int majorityElement(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    n = n / 2;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > n) {
            return entry.getKey();
        }
    }
    return 0;
}
````

#### Time & Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

---

### Approach 2: Boyer-Moore Voting Algorithm

#### Explanation

* Maintains a `candidate` and a `count`
* If count becomes zero, change the candidate
* Increment count if current element equals candidate, otherwise decrement
* Final candidate is the majority element

#### Code

```java
public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }

        if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }
    return candidate;
}
```

#### Time & Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 2. Rotate Array

### Problem Statement

Given an array `arr[]` of size `n` and an integer `d`, rotate the array to the **left by `d` positions**.

---

### Approach: Repeated Left Rotation

#### Explanation

* Rotate the array one position to the left `d` times
* Store the first element temporarily
* Shift remaining elements left by one position
* Place the first element at the end

#### Code

```java
static void rotateArr(int[] arr, int d) {
    int n = arr.length;

    for (int i = 0; i < d; i++) {
        int first = arr[0];
        for (int j = 0; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = first;
    }
}
```

#### Time & Space Complexity

* **Time Complexity:** O(n × d)
* **Space Complexity:** O(1)

---


