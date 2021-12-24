1) Collection Pipeline: Collection pipelines are a model of how we can modularize and create software.Like most patterns, they are used in many places.
Collection pipelines organize a transaction that transmits a collection between them. Each operation receives a collection as input and transmits a collection as an output.
Collections transmitted between processes can be in different formats.

2) Exploring more pipelines and operations; Pipelines are too many. One of them is map. Collection returns, which is the result of applying lambda to each object in the input collection in the Map property. Another collection is pipline reduce. This operation reduces an input function to a single result. The function that does this is called reduction.

3) Nested Operator Expressions: & and | or are nested operators that connect with logic operators.

4) Laziness: Laziness is used together with take in a method and processes the highest ones as much as the number in take.
It can be included in a special collection class group. Some collection pipeline operations do not work with laziness. Sort is an example of this.

5) Immutability: Collection pipelines are suitable for immutable data structures.

6) Parallelism: It can also be used if the number of cores is high to increase performance while mapping.
Performance tests should be performed to see if there is a real performance improvement.

7) When to use it : It should not be used when there is no language support. Pipeline is linear, they work very well when it is profitable. 
There is only one collection input and output in each operation. It is also possible to separate inputs and outputs.
