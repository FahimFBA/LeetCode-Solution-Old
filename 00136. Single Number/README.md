# Concept

* If we take XOR of zero and some bit, it will return that bit
    * a ⊕ 0 = a
* If we take XOR of two same bits, it will return 0
    * a ⊕ a = 0
* a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b


<br>
<br>

## Python Representation

<br>

```python
print(1 ^ 9)
# Ouput: 8
print(8 ^ 1)
# Output: 9
print(0 ^ 2)
# Output: 2
print(2 ^ 2)
# Output: 0
print(0 ^ 1)
# Output: 1
```

### Thanks to Nick White