1. What does the assertArrayEquals method do?
- Compares two different arrays. Lenght and index of each element needs to match with each other to pass the test.

2. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
- the Test will fail. AssertionError is thrown, because arrays are not Equal.

3. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
- It checks each sub-array to ensure they are equal. Corresponding elements in each dimension need to match.

