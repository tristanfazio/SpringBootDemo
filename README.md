# Spring Boot Demo

Simple Spring Boot API to learn how the framework works

---

To build: `.\mvnw install`

To run: `.\mvnw spring-boot:run`

To test: `newman run postmantests.json`

---

Accepts a post request on `localhost:8080/sort`, where the post request contains a JSON body in the format of:

```
{
    "list": []
}
```

Where `list` is a list of ***Integers***

Which will in turn return a response in the format:

```
{
    "sortedList":[],
    "listSummation":
}
```

Where `sortedList` is the sorted version of the submitted list, and `listSummation` is the sum of all numbers in the list.

Sorting is implemeted using Merge Sort.
