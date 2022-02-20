# java.demo.fun_with_abstract
Some idea that can be useful for certain computation situation.

Here is a simple example for when we need a `orElse` method to let the caller of the method to have an option to provide their own default value.

A typical usage would be:

```java 
R myR = Util.convertTtoR(someT).orElse(defaultR);
```

See the `Util` package for full implementation.
