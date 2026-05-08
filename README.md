# 🚆 Train Consist Management App — Java Collections, Streams & DSA Learning Project

> A console-based Java application that simulates how a railway system manages a train consist, which is a collection of bogies attached to an engine.  
This project is designed to teach **Java Collections**, **Streams**, **Regex**, **Exception Handling**, **Sorting**, **Searching**, and **DSA fundamentals** through a realistic railway management scenario.

---

# 📋 Table of Contents

- [Project Overview](#project-overview)
- [Problem Statement](#problem-statement)
- [Core Features](#core-features)
- [Use Case Scenarios](#use-case-scenarios)
- [Java Concepts Covered](#java-concepts-covered)
- [Data Structures Used](#data-structures-used)
- [Algorithms Used](#algorithms-used)
- [Application Architecture](#application-architecture)
- [Project Structure](#project-structure)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Sample Console Flow](#sample-console-flow)
- [Educational Goals](#educational-goals)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

# 📌 Project Overview

The **Train Consist Management App** is a Java console-based application that models how railway systems manage bogies attached to a train engine.

A train consist represents the complete arrangement of bogies in a train, such as:

```text
Engine → Sleeper → AC Chair → Cargo → Guard Coach
```

The application supports:

- Passenger bogies
- Goods bogies
- Unique bogie IDs
- Ordered train formation
- Bogie capacity mapping
- Sorting and filtering
- Safety compliance checks
- Regex validation
- Exception handling
- Performance comparison
- Searching and sorting algorithms

Each use case introduces one or more Java concepts using a real-world railway scenario.

---

# 🌍 Problem Statement

In a railway system, bogies cannot be managed as simple text values only.

A real train consist must support:

- Dynamic attachment and removal of bogies
- Unique bogie identifiers
- Ordered bogie sequence
- Passenger capacity tracking
- Goods cargo validation
- Safety compliance
- Sorting and searching
- Input validation
- Runtime exception handling

This project solves these problems step by step by introducing suitable Java data structures and algorithms for each situation.

---

# ✨ Core Features

| Module | Features |
|---|---|
| 🚆 Train Initialization | Welcome message and empty consist setup |
| 🚃 Passenger Bogies | Sleeper, AC Chair, First Class |
| 📦 Goods Bogies | Rectangular and Cylindrical cargo bogies |
| 🆔 Unique IDs | Prevent duplicate bogie registration |
| 🔗 Ordered Formation | Maintain physical bogie sequence |
| 💺 Capacity Mapping | Map bogies to seating/load capacity |
| 🔍 Searching | Linear and binary search |
| 📊 Sorting | Bubble sort, Arrays.sort(), Comparator |
| ⚡ Streams | filter(), map(), reduce(), groupingBy() |
| ✅ Safety Validation | Cargo compatibility checking |
| ⚠️ Exception Handling | Custom exceptions and fail-fast validation |
| 🧪 Performance Testing | Loop vs Stream benchmarking |

---

# 🧩 Use Case Scenarios

---

# 🚆 UC1 — Initialize Train and Display Consist Summary

## Goal

Initialize the Train Consist Management App and display the initial state of the train.

## Actor

User

## Flow

```text
User Runs Program
       ↓
Application Displays Welcome Message
       ↓
Train Consist Initialized
       ↓
Initial Bogie Count Displayed
```

## Key Concepts

- Class
- main() method
- static keyword
- ArrayList
- List interface
- Console output
- Dynamic initialization

## Key Requirements

- Create Train App class
- Implement main() method
- Print welcome message
- Initialize empty List using ArrayList
- Display initial bogie count using size()

## Sample Output

```text
=== Train Consist Management App ===
Initial Bogie Count: 0
```

## Benefits

- Introduces application startup flow
- Shows where execution begins
- Demonstrates why dynamic collections are useful
- Builds foundation for later use cases

---

# 🚃 UC2 — Add Passenger Bogies to Train

## Goal

Allow dynamic insertion and removal of passenger bogies using ArrayList.

## Previous Drawback

```text
UC1 only initializes the train but does not allow adding or removing bogies.
```

## Flow

```text
Create Passenger Bogie List
       ↓
Add Bogies
       ↓
Display Bogies
       ↓
Remove Bogie
       ↓
Check Existence
```

## Key Concepts

- ArrayList
- add()
- remove()
- contains()
- Insertion order
- CRUD operations

## Key Requirements

- Create ArrayList<String>
- Add Sleeper, AC Chair, First Class
- Remove AC Chair
- Check whether Sleeper exists
- Display final list

## Sample Output

```text
Passenger Bogies: [Sleeper, AC Chair, First Class]
After Removal: [Sleeper, First Class]
Sleeper Exists: true
```

## Benefits

- Demonstrates real-world list management
- Shows dynamic collection growth
- Introduces CRUD behavior
- Helps visualize bogie attachment and detachment

---

# 🆔 UC3 — Track Unique Bogie IDs Using HashSet

## Goal

Ensure no duplicate bogie IDs are added to the train.

## Previous Drawback

```text
ArrayList allows duplicate bogie IDs, which can corrupt railway records.
```

## Flow

```text
Add Bogie IDs
       ↓
Store in HashSet
       ↓
Duplicate IDs Ignored
       ↓
Display Unique IDs
```

## Key Concepts

- Set interface
- HashSet
- add()
- Automatic deduplication
- Unordered storage

## Key Requirements

- Create HashSet<String>
- Add duplicate IDs intentionally
- Print final unique set

## Sample Output

```text
Bogie IDs Added: BG101, BG102, BG101
Unique Bogie IDs: [BG101, BG102]
```

## Benefits

- Enforces uniqueness
- Prevents duplicate registration
- Teaches when to use Set instead of List
- Protects data integrity

---

# 🔗 UC4 — Maintain Ordered Bogie Sequence Using LinkedList

## Goal

Maintain the physical sequence of bogies in the train consist.

## Previous Drawback

```text
HashSet removes duplicates but does not preserve train formation order.
```

## Flow

```text
Create LinkedList
       ↓
Add Engine and Bogies
       ↓
Insert Pantry Car
       ↓
Remove First and Last
       ↓
Display Final Formation
```

## Key Concepts

- LinkedList
- Node structure
- addFirst()
- addLast()
- add(index, element)
- removeFirst()
- removeLast()
- Order preservation

## Key Requirements

- Create LinkedList<String>
- Add Engine, Sleeper, AC, Cargo, Guard
- Insert Pantry Car at position 2
- Remove first and last bogie
- Display final consist

## Sample Output

```text
Initial Consist: [Engine, Sleeper, AC, Cargo, Guard]
After Insert: [Engine, Sleeper, Pantry Car, AC, Cargo, Guard]
Final Consist: [Sleeper, Pantry Car, AC, Cargo]
```

## Benefits

- Models real-world chaining
- Demonstrates efficient insertion and deletion
- Shows when LinkedList is useful
- Helps understand node-based structures

---

# 🧾 UC5 — Preserve Insertion Order Using LinkedHashSet

## Goal

Maintain insertion order while enforcing uniqueness.

## Previous Drawback

```text
LinkedList preserves order but does not prevent duplicate bogies.
```

## Flow

```text
Add Bogies
       ↓
Store in LinkedHashSet
       ↓
Duplicate Ignored
       ↓
Display Formation in Original Order
```

## Key Concepts

- LinkedHashSet
- Set interface
- add()
- Automatic deduplication
- Insertion order preservation
- Ordered iteration

## Key Requirements

- Create LinkedHashSet<String>
- Add Engine, Sleeper, Cargo, Guard
- Add duplicate Sleeper
- Display final formation

## Sample Output

```text
Final Train Formation:
[Engine, Sleeper, Cargo, Guard]
```

## Benefits

- Prevents duplicate bogies
- Preserves physical attachment sequence
- Combines ordering with uniqueness
- Improves predictable train composition

---

# 💺 UC6 — Map Bogie to Capacity Using HashMap

## Goal

Associate each bogie with seating or load capacity.

## Previous Drawback

```text
Set stores only bogie names but cannot store capacity or operational attributes.
```

## Flow

```text
Create Bogie-Capacity Map
       ↓
Insert Bogie Capacities
       ↓
Iterate Using entrySet()
       ↓
Display Capacity Details
```

## Key Concepts

- Map interface
- HashMap
- put()
- Key-value mapping
- entrySet()
- Fast lookup

## Key Requirements

- Create HashMap<String, Integer>
- Add Sleeper, AC Chair, First Class capacities
- Iterate and display entries

## Sample Output

```text
Sleeper     → 72 seats
AC Chair    → 56 seats
First Class → 24 seats
```

## Benefits

- Models real-world attribute mapping
- Enables fast lookup
- Supports capacity validation
- Builds foundation for analytics

---

# 📊 UC7 — Sort Bogies by Capacity Using Comparator

## Goal

Sort passenger bogies based on seating capacity using a custom Comparator.

## Previous Drawback

```text
HashMap stores capacity but does not provide business-based ordering.
```

## Flow

```text
Create Bogie Objects
       ↓
Store in List
       ↓
Apply Comparator
       ↓
Sort by Capacity
       ↓
Display Sorted Bogies
```

## Key Concepts

- Comparator
- Custom objects
- List collection
- sort()
- Lambda expressions
- Separation of data and logic

## Key Requirements

- Create Bogie class with name and capacity
- Store bogies in List<Bogie>
- Use Comparator.comparingInt()
- Sort and display result

## Sample Output

```text
First Class - 24
AC Chair    - 56
Sleeper     - 72
```

## Benefits

- Introduces object-based collection handling
- Applies business logic during sorting
- Improves planning and reporting
- Demonstrates clean sorting logic

---

# ⚡ UC8 — Filter Passenger Bogies Using Streams

## Goal

Filter passenger bogies using Stream pipelines based on capacity.

## Previous Drawback

```text
Sorting organizes data, but it does not select bogies based on conditions.
```

## Flow

```text
Create Bogie List
       ↓
Convert to Stream
       ↓
Apply filter()
       ↓
Collect Result
       ↓
Display Filtered Bogies
```

## Key Concepts

- Stream API
- stream()
- filter()
- Lambda expressions
- collect()
- Declarative programming

## Key Requirements

- Reuse Bogie list
- Apply filter(b -> b.capacity > 60)
- Collect into a new list
- Display filtered bogies

## Sample Output

```text
High Capacity Bogies:
Sleeper - 72 seats
```

## Benefits

- Reduces boilerplate loops
- Improves readability
- Introduces functional programming
- Makes business rules clearer

---

# 🗂️ UC9 — Group Bogies by Type Using Collectors.groupingBy()

## Goal

Group bogies into categories using Stream collectors.

## Previous Drawback

```text
Filtering gives a flat list but does not categorize data for reporting.
```

## Flow

```text
Create Bogie List
       ↓
Convert to Stream
       ↓
Apply groupingBy()
       ↓
Store Result in Map
       ↓
Display Grouped Structure
```

## Key Concepts

- Collectors.groupingBy()
- Stream pipeline
- Map output structure
- Lambda classification
- Data aggregation

## Key Requirements

- Reuse Bogie objects
- Apply Collectors.groupingBy()
- Store result in Map<String, List<Bogie>>
- Print grouped bogies

## Sample Output

```text
Passenger:
  Sleeper
  AC Chair

Goods:
  Rectangular Cargo
  Cylindrical Tanker
```

## Benefits

- Converts flat data into structured groups
- Supports reporting
- Introduces advanced collectors
- Builds foundation for dashboards

---

# 🧮 UC10 — Count Total Seats Using reduce()

## Goal

Aggregate seating capacities into a single total value.

## Previous Drawback

```text
Grouped data does not provide numerical insight such as total capacity.
```

## Flow

```text
Create Bogie List
       ↓
stream()
       ↓
map() Capacity
       ↓
reduce() Sum
       ↓
Display Total Seats
```

## Key Concepts

- map()
- reduce()
- Integer::sum
- Functional aggregation
- Numeric analytics

## Key Requirements

- Extract capacity values
- Use reduce(0, Integer::sum)
- Display total seating capacity

## Sample Output

```text
Total Seating Capacity: 152
```

## Benefits

- Introduces aggregation
- Provides operational metrics
- Replaces manual summation
- Supports utilization planning

---

# ✅ UC11 — Validate Train ID and Cargo Codes Using Regex

## Goal

Validate Train ID and Cargo Code formats using Regular Expressions.

## Previous Drawback

```text
Earlier use cases assume that all input data is valid.
```

## Valid Formats

```text
Train ID   : TRN-1234
Cargo Code : PET-AB
```

## Flow

```text
User Enters Input
       ↓
Pattern Compiled
       ↓
Matcher Validates
       ↓
Input Accepted or Rejected
```

## Key Concepts

- Regex
- Pattern
- Matcher
- matches()
- Format enforcement
- Data integrity validation

## Key Requirements

- Train ID pattern: TRN-\d{4}
- Cargo Code pattern: PET-[A-Z]{2}
- Use Pattern and Matcher
- Display valid or invalid result

## Sample Output

```text
Train ID TRN-1234 is valid
Cargo Code PET-IN is valid
```

## Benefits

- Ensures input correctness
- Prevents invalid data
- Introduces enterprise validation
- Improves reliability

---

# 🛡️ UC12 — Safety Compliance Check for Goods Bogies

## Goal

Validate cargo safety rules for goods bogies.

## Previous Drawback

```text
Goods bogies were processed without enforcing cargo compatibility rules.
```

## Safety Rule

```text
Cylindrical Bogie → Only Petroleum Allowed
Rectangular Bogie → Petroleum Not Allowed
```

## Flow

```text
Create Goods Bogie List
       ↓
Convert to Stream
       ↓
Apply allMatch()
       ↓
Validate Safety Rules
       ↓
Display Compliance Result
```

## Key Concepts

- Streams API
- allMatch()
- Lambda expressions
- Conditional logic
- Short-circuit evaluation
- Business rule modeling

## Key Requirements

- Create goods bogies with shape and cargo
- Use allMatch()
- Validate cylindrical bogie cargo
- Display safety compliance result

## Sample Output

```text
Safety Compliance Status: SAFE
```

## Benefits

- Enforces real-world safety constraints
- Prevents unsafe cargo configuration
- Uses declarative validation
- Improves operational reliability

---

# ⏱️ UC13 — Performance Comparison: Loops vs Streams

## Goal

Compare loop-based logic and stream-based logic using execution time.

## Previous Drawback

```text
Streams are readable, but performance should be measured instead of assumed.
```

## Flow

```text
Prepare Bogie Collection
       ↓
Record Start Time
       ↓
Run Loop or Stream Logic
       ↓
Record End Time
       ↓
Display Execution Time
```

## Key Concepts

- System.nanoTime()
- Performance benchmarking
- Loop-based processing
- Stream-based processing
- Evidence-driven optimization

## Key Requirements

- Capture start time
- Execute filtering logic
- Capture end time
- Calculate elapsed time
- Print duration

## Sample Output

```text
Loop Execution Time   : 12000 ns
Stream Execution Time : 18000 ns
```

## Benefits

- Introduces performance awareness
- Compares imperative and declarative styles
- Avoids blind assumptions
- Builds measurement-driven thinking

---

# ⚠️ UC14 — Handle Invalid Bogie Capacity Using Custom Exception

## Goal

Prevent invalid passenger bogies from being added.

## Previous Drawback

```text
Invalid values like zero or negative capacity may enter the system.
```

## Flow

```text
Create Passenger Bogie
       ↓
Validate Capacity
       ↓
If Capacity <= 0
       ↓
Throw Custom Exception
```

## Key Concepts

- Custom exception
- Exception inheritance
- throw
- throws
- Fail-fast validation
- Business rule enforcement

## Key Requirements

- Create InvalidCapacityException
- Validate capacity in constructor
- Throw exception if capacity <= 0
- Prevent invalid bogie creation

## Sample Output

```text
InvalidCapacityException: Capacity must be greater than zero
```

## Benefits

- Protects system from corrupted input
- Encourages defensive programming
- Stops invalid object creation early
- Improves downstream reliability

---

# 🚨 UC15 — Safe Cargo Assignment Using try-catch-finally

## Goal

Safely handle unsafe cargo assignments without crashing the app.

## Previous Drawback

```text
Runtime cargo assignment errors may crash the application if not handled.
```

## Flow

```text
Assign Cargo
       ↓
Validate Shape and Cargo
       ↓
Throw Exception if Unsafe
       ↓
catch Handles Error
       ↓
finally Logs Completion
```

## Key Concepts

- try-catch-finally
- Runtime exception
- Custom runtime exception
- Graceful failure
- finally block

## Key Requirements

- Create CargoSafetyException
- Validate cargo compatibility
- Throw exception for unsafe assignment
- Catch and display message
- Use finally for cleanup/logging

## Sample Output

```text
Error: Petroleum cannot be assigned to Rectangular Bogie
Cargo assignment process completed
```

## Benefits

- Improves runtime safety
- Prevents application crash
- Teaches structured error handling
- Ensures cleanup always happens

---

# 🔢 UC16 — Sort Passenger Bogies Using Bubble Sort

## Goal

Sort passenger bogie capacities manually using Bubble Sort.

## Previous Drawback

```text
Built-in sorting hides how sorting works internally.
```

## Flow

```text
Create Capacity Array
       ↓
Compare Adjacent Elements
       ↓
Swap if Out of Order
       ↓
Repeat Passes
       ↓
Display Sorted Array
```

## Key Concepts

- Bubble Sort
- Array manipulation
- Nested loops
- Swapping logic
- O(n²) complexity

## Key Requirements

- Create capacity array
- Use nested loops
- Swap values manually
- Avoid Arrays.sort()
- Display sorted result

## Sample Output

```text
Sorted Capacities:
[24, 56, 72]
```

## Benefits

- Builds algorithmic thinking
- Explains sorting internals
- Improves problem-solving
- Bridges theory and implementation

---

# 🔤 UC17 — Sort Bogie Names Using Arrays.sort()

## Goal

Sort bogie type names alphabetically using Java’s built-in Arrays.sort().

## Previous Drawback

```text
Bubble Sort is useful for learning but inefficient for production.
```

## Flow

```text
Create Bogie Name Array
       ↓
Apply Arrays.sort()
       ↓
Display Sorted Names
```

## Key Concepts

- Arrays.sort()
- Natural ordering
- O(n log n) awareness
- Library optimization
- Readable code

## Key Requirements

- Create String array
- Use Arrays.sort()
- Print using Arrays.toString()
- Ensure alphabetical output

## Sample Output

```text
Sorted Bogie Names:
[AC Chair, First Class, Sleeper]
```

## Benefits

- Improves performance
- Uses standard Java utilities
- Keeps code clean
- Connects algorithm learning to production practice

---

# 🔍 UC18 — Linear Search for Bogie ID

## Goal

Search for a bogie ID from an unsorted list using Linear Search.

## Previous Drawback

```text
The system can display bogies but cannot locate a specific bogie ID.
```

## Flow

```text
Create Bogie ID Array
       ↓
Enter Search Key
       ↓
Traverse Sequentially
       ↓
Compare Each ID
       ↓
Display Found / Not Found
```

## Key Concepts

- Linear Search
- Sequential traversal
- equals()
- Early termination
- O(n) complexity

## Key Requirements

- Create bogie ID array
- Traverse using loop
- Compare with equals()
- Stop when found
- Print result

## Sample Output

```text
Bogie BG102 Found
```

## Benefits

- Works on unsorted data
- Simple and reliable
- Introduces searching fundamentals
- Prepares for binary search

---

# ⚡ UC19 — Binary Search for Bogie ID

## Goal

Find a bogie ID efficiently using binary search on sorted data.

## Previous Drawback

```text
Linear Search becomes slow for large datasets.
```

## Flow

```text
Use Sorted Bogie IDs
       ↓
Set low and high
       ↓
Calculate mid
       ↓
Compare Search Key
       ↓
Halve Search Range
       ↓
Display Result
```

## Key Concepts

- Binary Search
- Divide and conquer
- Sorted data precondition
- low, high, mid indexes
- compareTo()
- O(log n) complexity

## Key Requirements

- Ensure array is sorted
- Calculate mid correctly
- Compare using compareTo()
- Adjust low/high
- Display found or not found

## Sample Output

```text
Bogie BG104 Found at index 3
```

## Benefits

- Faster searching
- Introduces optimization
- Shows importance of sorted data
- Builds efficient lookup logic

---

# 🛑 UC20 — Exception Handling During Search Operations

## Goal

Prevent searching on an empty train by throwing an exception early.

## Previous Drawback

```text
Searching before adding bogies produces meaningless output.
```

## Flow

```text
Search Triggered
       ↓
Check Collection Empty
       ↓
If Empty
       ↓
Throw IllegalStateException
       ↓
Display Meaningful Error
```

## Key Concepts

- Defensive programming
- IllegalStateException
- Fail-fast principle
- State validation
- Runtime exception handling

## Key Requirements

- Check whether bogie collection is empty
- Throw IllegalStateException
- Provide meaningful message
- Stop invalid search logic

## Sample Output

```text
IllegalStateException: Cannot search because train consist is empty
```

## Benefits

- Prevents invalid operations
- Improves reliability
- Makes errors explicit
- Teaches defensive coding

---

# ☕ Java Concepts Covered

| Category | Concepts |
|---|---|
| Arrays | Indexing, traversal, swapping, searching |
| Collections | List, Set, Map |
| Lists | ArrayList, LinkedList |
| Sets | HashSet, LinkedHashSet, TreeSet |
| Maps | HashMap, TreeMap |
| Sorting | Bubble Sort, Arrays.sort(), Comparator |
| Searching | Linear Search, Binary Search |
| Streams | filter(), map(), reduce(), collect(), groupingBy() |
| Lambdas | Functional interfaces, method references |
| Regex | Pattern, Matcher, validation |
| Exceptions | try-catch-finally, custom exceptions |
| Performance | System.nanoTime(), loop vs stream |

---

# 📚 Data Structures Used

| Data Structure | Purpose |
|---|---|
| Array | Manual sorting and searching |
| ArrayList | Dynamic passenger bogie management |
| LinkedList | Ordered train formation |
| HashSet | Unique bogie IDs |
| LinkedHashSet | Unique + insertion order |
| TreeSet | Sorted unique bogie IDs |
| HashMap | Bogie to capacity mapping |
| Map<String, List<Bogie>> | Grouped bogie reports |

---

# 🧮 Algorithms Used

| Algorithm | Purpose | Complexity |
|---|---|---|
| Bubble Sort | Manual capacity sorting | O(n²) |
| Arrays.sort() | Optimized name sorting | O(n log n) |
| Linear Search | Search unsorted bogie IDs | O(n) |
| Binary Search | Search sorted bogie IDs | O(log n) |
| Stream reduce() | Total seat calculation | O(n) |
| allMatch() | Safety compliance check | O(n) |

---

# 🏛️ Application Architecture

```text
Presentation Layer
       ↓
Train Controller
       ↓
Consist Service
       ↓
Bogie Service
       ↓
Validation / Sorting / Search / Safety Services
       ↓
Collections / Arrays / Streams
```

---

# 📁 Project Structure

```text
TrainConsistManagementApp/
│
├── src/
│   ├── main/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Bogie.java
│   │   ├── PassengerBogie.java
│   │   ├── GoodsBogie.java
│   │   └── Train.java
│   │
│   ├── service/
│   │   ├── TrainConsistService.java
│   │   ├── PassengerBogieService.java
│   │   ├── GoodsBogieService.java
│   │   ├── CapacityService.java
│   │   ├── SafetyService.java
│   │   └── PerformanceService.java
│   │
│   ├── algorithm/
│   │   ├── BubbleSort.java
│   │   ├── LinearSearch.java
│   │   └── BinarySearch.java
│   │
│   ├── validation/
│   │   ├── RegexValidator.java
│   │   └── InputValidator.java
│   │
│   ├── exception/
│   │   ├── InvalidCapacityException.java
│   │   └── CargoSafetyException.java
│   │
│   └── util/
│       ├── Constants.java
│       └── ConsolePrinter.java
│
├── output/
│   └── train_report.txt
│
├── README.md
└── requirements.txt
```

---

# 💻 Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core application development |
| 📦 Collections Framework | Train consist data management |
| 🔢 Arrays | DSA sorting and searching |
| ⚡ Stream API | Filtering, grouping, aggregation |
| 🧠 Lambda Expressions | Functional-style processing |
| ✅ Regex | Train ID and cargo validation |
| ⚠️ Exception Handling | Safe runtime behavior |
| ⏱️ System.nanoTime() | Performance benchmarking |

---

# 🚀 Getting Started

---

# Prerequisites

```bash
Java 17+
IDE: IntelliJ IDEA / Eclipse / VS Code
```

---

# Compile Project

```bash
javac Main.java
```

---

# Run Application

```bash
java Main
```

---

# 🖥️ Sample Console Flow

```text
===== TRAIN CONSIST MANAGEMENT APP =====

1. Initialize Train
2. Add Passenger Bogies
3. Track Unique Bogie IDs
4. Maintain Ordered Consist
5. Map Bogie Capacity
6. Sort Bogies by Capacity
7. Filter High Capacity Bogies
8. Group Bogies by Type
9. Count Total Seats
10. Validate Train ID
11. Safety Compliance Check
12. Search Bogie
13. Performance Comparison
14. Exit

Enter Choice:
```

---

# 🎯 Educational Goals

| Module | Learning Outcome |
|---|---|
| Java Basics | class, main(), static, console output |
| Collections | ArrayList, LinkedList, Set, Map |
| DSA | Sorting, searching, arrays |
| Streams | filter, map, reduce, groupingBy |
| Regex | Format validation |
| Exceptions | Custom and runtime exception handling |
| Performance | Benchmarking with nanoTime |
| Clean Code | Modular and maintainable design |
| Real-World Modeling | Railway bogie management scenario |

---

# 🔮 Future Enhancements

- GUI using JavaFX or Swing
- Database integration with MySQL
- Train formation visualization
- REST API using Spring Boot
- Admin dashboard
- Passenger allocation system
- Cargo safety reporting
- PDF train consist report
- Real-time railway simulation
- File-based persistence

---

# 📜 License

This project is created for educational and learning purposes.

---

> 🚆 *"A train consist is more than a list of bogies — it is a perfect example of how data structures, algorithms, and business rules work together in real software."*
