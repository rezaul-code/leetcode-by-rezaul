<div align="center">

# 🚀 LeetCode Solutions

### Consistent Data Structures & Algorithms Practice in Java

[![LeetCode](https://img.shields.io/badge/LeetCode-Profile-orange?style=for-the-badge&logo=leetcode)](https://leetcode.com/u/rezaul2609/)
![Java](https://img.shields.io/badge/Language-Java-red?style=for-the-badge&logo=openjdk)
![DSA](https://img.shields.io/badge/Focus-Data%20Structures%20%26%20Algorithms-blue?style=for-the-badge)

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=24&duration=3000&pause=1000&center=true&vCenter=true&width=700&lines=Solving+Problems+Every+Day;Strengthening+DSA+Skills;Preparing+for+Software+Engineering+Roles" />

</div>

---

## 👨‍💻 About

This repository contains my LeetCode solutions implemented in **Java**.

The goal of this repository is to:

- Strengthen Data Structures & Algorithms fundamentals
- Improve problem-solving skills
- Prepare for Software Engineering interviews
- Maintain a consistent coding habit
- Track learning progress over time

---

## 🎯 Current Goal

```text
Target: 500+ LeetCode Problems

✅ Easy
✅ Medium
🚀 Hard

Focus Areas:
• Arrays & Strings
• Hashing
• Two Pointers
• Sliding Window
• Binary Search
• Linked Lists
• Trees
• Graphs
• Dynamic Programming
```

---

## 📂 Repository Structure

```text
leetcode-solutions
│
├── Easy
├── Medium
├── Hard
│
└── Solutions organized by problem number
```

---

## 💻 Solution Format

Each solution includes:

- Clean Java implementation
- Optimal approach whenever possible
- Readable variable names
- Time Complexity Analysis
- Space Complexity Analysis

Example:

```java
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
```

---

## 📈 Problem Solving Journey

```text
Start
  │
  ├── Arrays
  ├── Strings
  ├── Hashing
  ├── Two Pointers
  ├── Sliding Window
  ├── Binary Search
  ├── Linked Lists
  ├── Trees
  ├── Graphs
  ├── Dynamic Programming
  │
Software Engineer 🚀
```

---

## 🔗 Profiles

- GitHub: https://github.com/YOUR_USERNAME
- LeetCode: https://leetcode.com/u/rezaul2609/
- LinkedIn: https://linkedin.com/in/YOUR_LINKEDIN

---

## 📌 Philosophy

> Consistency compounds.
>
> One problem solved today is one less problem to fear tomorrow.
