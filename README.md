# finch-stuff

| step | Description |
| :-----------: | :-----------: |
| snap | </ul><li>learn the part and tools of the finch robot</li><ul> |
| java(eclipse) | </ul><li> try to make the finch follow</li><ul> |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

i wanted the finch to follow me when i move.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

1. Imagine - finch to follow
2. plan - use dist and light censors to follow
3. create - code
4. test - pain
5. repeat

---

### Code to Highlight
```java
if(f1.getLight("L")>f1.getLight("R")) {
	f1.setMotors(10,-10);
}else if(f1.getLight("L")<=f1.getLight("R")) {
	f1.setMotors(-10, 10);
}

```

---
- What was your motivation?
  - to make the finch follow to be able to carry things around or to give some one else something.
- Why did you build this project?
  - to test the censors and discover how to use the finch in simple tasks like moving or turning.
- What did you learn?
  - how to use the censor to control the finch without user input
