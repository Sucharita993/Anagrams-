# Anagrams
Here two strings are taken,  and they may or may not be of the same length, we have to determine the minimum number of character 
deletions required to make anagrams. Any characters can be deleted from either of the strings.<br>
<b>Sample Input</b> <br>
cde<br>
abc<br>
<b>Sample Output</b><br>
4<br>
string a: a string<br>
string b: another string<br>
Returns<br>
int: the minimum total characters that must be deleted<br>
<br>
The above conditions can be achieved by various methods, but here we have used TreeSet for simplicity<br>
We know that set cannot contain dupilicate values and it has retainAll method, where we compare two inputs and it keeps a single set of common values. We have used the same method in this program<br>
The program we are dealing with is of character type, we convert the string into chatacter array<br>
```java
char [] c = a.toCharArray();
char [] ch = b.toCharArray();
```
Converting the array into set<br>
```java
Set<Character> s1 = new TreeSet<>();
Set<Character> s2 = new TreeSet<>();
for (char character : c) {
	s1.add(character);
}
for (char chare : ch) {
	s2.add(chare);
}
```
Comparing the both chracter arrays, and retaining only common characters<br>
```java
 s1.retainAll(s2);
```
Taking the count of number of elements to be removed to make anagrams.<br>
```java
 count = (c.length)-(s1.size());
count2 = (ch.length)-(s1.size());
System.out.println(count+count2);
```
<b>Output:</b>

![Challenge](https://user-images.githubusercontent.com/84003518/124362848-3ede0280-dc55-11eb-8c8a-0f2c8d2fe5a7.jpg)
