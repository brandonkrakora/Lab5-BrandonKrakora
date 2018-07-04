-   Why don't we need an explicit constructor?
    - An explicit constructor is not needed because the data structure being used here is dynamic,
    meaning that the user does not have to specify the size of the stack at moment of creation.

-   What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main
    -> Push method: O(1)
    -> Pop method: O(1)
    -> Peek method: O(1)
    -> asList method: O(n)
    -> ReverseLines method: O(n)
    
 -  How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?
    - Without using Node class, we could have implemented the LinkedListStack using an Array which is constant in time and space.
  
 -  Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design
    - I think it is better for pop to return the item because you should be able to access the item popped for any successive operations on the item, 
    and the push method should return the stack so that the person can see what current items are on the stack.
    - The cons of having the push method not return the item is that if more items are pushed the user has no access to the earlier pushed items because they are now on the bottom of the stack.
    