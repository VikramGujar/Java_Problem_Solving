package com.notes.collection;

public class CollectionNotes {
    /*
     * Java Collections Framework:
     *
     * Imagine you have a bunch of things you want to keep organized  
     * maybe a list of your favorite books,
     * a set of unique toys, or a line of people waiting for a ride. 
     * In Java, the Collections Framework
     * helps you do exactly that with groups of objects. 
     * It's like a toolkit filled with different ways
     * to store and manage your data.
     *
     * What is it?
     * -----------
     * The Collections Framework is a set of tools 
     * (interfaces and classes) in Java that makes working
     * with groups of objects much easier. It's found in the java.util package.
     *
     * Key Ideas:
     * ----------
     * - Collection: 
     * 				This is the most basic idea
     * 				it simply means a group of objects.
     * 
     * - Interfaces: 
     * 				Think of these as blueprints or contracts. 
     * 				They define what actions can be
     *   			performed on a collection (like adding or removing items), 
     *   			but they don't provide the actual implementation.
     *   
     * - Classes: 
     * 				These are the actual implementations of the interfaces. 
     * 				They provide the specific code that makes the actions work.
     *   
     * - Generics: 
     * 				This is a way to make sure you're only putting the correct type 
     * 				of objects into your collection.
     *    			For example, a "List of Strings" can only hold String objects. 
     *    			This helps prevent errors.
     *   
     * - Data Structures: 
     * 						These are different ways of organizing data, 
     * 						each with its own advantages
     *   					and disadvantages in terms of speed and memory usage.
     *
     * 
     * The Main Types of Collections:
     * -----------------------------
     * 1. List (Ordered and Allows Duplicates):
     *    
     *    - A List is like a numbered list. 
     *    	Each item has a specific position (index), and you can
     *      have duplicate items.
     *    
     *    - Examples:
     *      
     *      - ArrayList: 
     *      			Like a dynamic array that can grow as needed. 
     *      			Great for accessing items
     *        			quickly by their position, 
     *        			but adding or removing items in the middle can be slower.
     *        
     *        
     *      - LinkedList: 
     *      			Like a chain of linked boxes. 
     *      			Adding or removing items is quick, 
     *      			but finding
     *        			a specific item by its position can be slower.
     *        
     *        
     *      - Vector: 
     *      		An older, thread-safe version of ArrayList. 
     *      		Thread-safe means it's designed
     *        		to be used by multiple parts of a program at the same time 
     *        		without causing problems.
     *        
     *        
     *      - Stack: 
     *      		A special type of list where you add and remove 
     *      		items from the top (like a stack of plates). 
     *         		This is called LIFO (Last-In, First-Out).
     *         
     *         
     *    - Useful List Actions:
     *      - add(index, item): Put an item at a specific position.
     *      - get(index): Get the item at a specific position.
     *      - set(index, item): Replace the item at a specific position.
     *      - remove(index): Remove the item at a specific position.
     *
     *
     * 2. Set (Unordered and Does Not Allow Duplicates):
     * 
     *    - A Set is like a bag of unique items. 
     *    	You can't have duplicates. The order of items is
     *      not guaranteed.
     *    - Examples:
     *      - HashSet: 
     *      		Uses a technique called "hashing" to store items quickly. 
     *      		Very fast for checking if an item is in the set.
     *      - TreeSet: 
     *      		Stores items in a sorted order.
     *      		
     *
     * 3. Queue (Ordered and Follows FIFO):
     *    - A Queue is like a line of people. 
     *    	The first person in line is the first one to be served
     *      (FIFO: First-In, First-Out).
     *    - Examples:
     *      - LinkedList: Can also be used as a Queue.
     *      - PriorityQueue: Items are retrieved based on their priority 
     *      	(e.g., the most important task gets done first).
     *        
     *
     * Moving Through Collections (Iteration):
     * --------------------------------------
     * - Iterator: An object that lets you go through a collection one item at a time.
     * - ListIterator: A special type of Iterator for Lists that allows you to go both forward
     *   and backward.
     * - for-each loop: A simpler way to go through all the items in a collection.
     * - forEach() method: A more modern way (introduced in Java 8) to do something with each item
     *   in a collection using a concise syntax.
     *
     * Important Notes:
     * ---------------
     * - Thread Safety: Most collections are not designed to be used safely by multiple parts of
     *   a program at the same time (not thread-safe). If you need this, you'll need special
     *   "concurrent" collections or ways to synchronize access.
     * - Fixed-Size and Immutable Collections:
     *   - Arrays.asList(): Creates a list that cannot grow or shrink.
     *   - List.of(): Creates a list that cannot be changed at all (immutable).
     * - Performance: Different collections have different performance characteristics. ArrayList is
     *   fast for getting items by their position, but LinkedList is faster for adding/removing items.
     * - The Collections class: This is a utility class with helpful methods for working with
     *   collections, such as sorting and searching.
     */
}
