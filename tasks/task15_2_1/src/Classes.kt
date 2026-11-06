// Task 15.2.1: syntax for subclasses
open class Person(val name: String)

open class Student(name: String, val degree: String) : Person(name)



open class Parent

open class Child : Parent()

class Grandchild: Child()

