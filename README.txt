These are the TODOs left to be answered in text, the rest are code written in the source files. 
TestIterator.java
1. TODO also try with a LinkedList - does it make any difference?: Functionally, not really. Linked Lists are better if you are primarily accessing based on the first or last element, while arrayLists are better if you are accessing by index. In theory for our problem, the methods with adding and removing would be faster by linked list and the methods for accessing would likely be faster with ArrayLists.
2. TODO what happens if you use list.remove(Integer.valueOf(77))?: Rather than removing a specific index, it will traverse until it finds (if it finds) the integer (77) and then delete. That is handled by the Integer.valueOf which is then passed as an index to the remove function. 
TestList
1. What does this method do?: It removes the element at index 5 in the list, it does not remove the first occurrence of 5. 
Test Performance
1. Here are my printouts for my times, note that they do not really increase linearly as the size increases which is curious. 
Summary: There is probably some hardware trickery going on here, or maybe I did something wrong. In any case, I can tell just off the overall runtimes that the more efficient method is the linkedList. The arrayList add and remove took whole seconds to run while the linkedList equivalent was under 100 ms. Likewise, for access they consistently pulled similar times which is strange because you would think the arrayList would be measurably faster. 
testArrayListAccess: 
Testing ArrayList access for size: 10
ArrayList access time: 10
Testing ArrayList access for size: 100
ArrayList access time: 0
Testing ArrayList access for size: 1000
ArrayList access time: 10
Testing ArrayList access for size: 10000
ArrayList access time: 11
Testing ArrayList access for size: 100000
ArrayList access time: 5
testLinkedListAddRemove:
Testing add and remove for size 10
LinkedList Add and remove time: 34
Testing add and remove for size 100
LinkedList Add and remove time: 30
Testing add and remove for size 1000
LinkedList Add and remove time: 11
Testing add and remove for size 10000
LinkedList Add and remove time: 8
Testing add and remove for size 100000
LinkedList Add and remove time: 13






testLinkedAcess:
Testing linkedList access for size: 10
LinkedList access time: 16
Testing linkedList access for size: 100
LinkedList access time: 0
Testing linkedList access for size: 1000
LinkedList access time: 16
Testing linkedList access for size: 10000
LinkedList access time: 0
Testing linkedList access for size: 100000
LinkedList access time: 8


testArrayListAddRemove:
Testing add and remove for size 10
Add and remove time: 16


Testing add and remove for size 100
Add and remove time: 24


Testing add and remove for size 1000
Add and remove time: 9


Testing add and remove for size 10000
Add and remove time: 8


Testing add and remove for size 100000
Add and remove time: 8