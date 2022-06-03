# Hashmaps
HashMap<KType, VType>, a collection of key value pairs.


```
// Initialization:
HashMap<String, Integer> hm = new HashMap<>();

// Methods:
hm.put("abc", 123);
hm.get("abc"); // return val
hm.containsKey("abc") // return bull
hm.containsValue(321); // return bull

hm.put("abc", 1234); // this changes the value
hm.replace("abc", 12345); // also changes the value

hm.putIfAbsent("abc", 123); // put only when the key not in table

hm.remove("abc");
```

## Difference between ```put``` and ```replace```
When both applied to an existing key, there is no difference. But when the key is not in the table, ```replace``` will not add the new key pair.

https://www.youtube.com/watch?v=H62Jfv1DJlU