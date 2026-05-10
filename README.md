# Assignment 4 - Graph Traversal and Representation System

## Student Information

Name: Diana Issen  
Group: SE-2514

---

# Project Overview

This project implements a graph traversal and representation system in Java using adjacency lists.

The project includes:
- Vertex representation
- Edge representation
- Graph implementation
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Performance analysis using System.nanoTime()

---

# Graph Structure

A graph consists of:
- Vertices (nodes)
- Edges (connections between vertices)

This project uses an adjacency list representation for storing graph connections.

---

# Class Descriptions

## Vertex Class

Represents a single vertex in the graph.

Fields:
- id

Methods:
- Constructor
- Getter
- toString()

---

## Edge Class

Represents a connection between two vertices.

Fields:
- source
- destination

Methods:
- Constructor
- Getters
- toString()

---

## Graph Class

Represents the graph using adjacency lists.

Main methods:
- addVertex()
- addEdge()
- printGraph()
- bfs()
- dfs()

---

## Experiment Class

Handles traversal execution and performance testing.

Main methods:
- runTraversals()
- runMultipleTests()
- printResults()

---

# BFS Algorithm

Breadth-First Search explores the graph level by level.

Steps:
1) Start from a vertex
2) Add it to queue
3) Visit neighbors
4) Continue until queue is empty

Data Structure Used:
- Queue

Time Complexity:
O(V + E)

Use Cases:
- Shortest path
- Network traversal
- Social networks

---

# DFS Algorithm

Depth-First Search explores as deep as possible before backtracking.

Steps:
1. Start from a vertex
2. Visit neighbor recursively
3. Continue until all vertices are visited

Data Structure Used:
- Recursion / Stack

Time Complexity:
O(V + E)

Use Cases:
- Maze solving
- Cycle detection
- Path finding

---

# Experimental Results

Graphs tested:
- 10 vertices
- 30 vertices
- 100 vertices

## Observations

1) Larger graphs require more traversal time.
2) BFS and DFS both follow O(V + E) complexity.
3) DFS usually goes deeper first, while BFS explores level by level.
4) BFS is preferred for shortest path problems.
5) DFS may use more recursion depth on large graphs.

## Reflection 

In this assignment, I learned how graph traversal algorithms work and how graphs can be represented using adjacency lists.
I understood the differences between BFS and DFS. BFS explores level by level using a queue, while DFS explores deeply using recursion.
One challenge for me was comprehending the traversal order and recursive DFS implementation.
This project improved my understanding of graph structures and algorithm complexity.

## Screenshots

![First](assignment4/screenshots/1.png)
![Second](assignment4screenshots/2.png)
![Third](assignment4/screenshots/3.png)


