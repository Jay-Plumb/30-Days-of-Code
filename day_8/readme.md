## Objective 

Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure.

## Task 
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

## Constraints

1 <= n <= 10^5
1 <= queries <= 10^5

## Output Format

On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full name and phoneNumber in the format name=phoneNumber.

## Sample Input

```
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
```

## Sample Output

```
sam=99912222
Not found
harry=12299933
```
