# Project2

## Pattern:

### **singleton pattern**:

**Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.**

for this project, we could use singleton pattern to match write result into a **file**. 

```java
class File is
    private static field instance: File;
	
	public static method getInstance() is
        if(File.instance == null) then
            if(File.instance == null) then
                File.instance = new File();
		return File.instance
     public method write(String) is
            // write result into file
            //....
    
        
```

**refer to this link:**

[Singleton (refactoring.guru)](https://refactoring.guru/design-patterns/singleton)

we created a class named as Log.Java to logging everything into "*pasur.log*". To make a better design, we choose to use Singleton Pattern to help implement logging feature. The reasons are we only need single instance(File/Log) in this class and it will available to all the clients class, also, the best part for Singleton Pattern is providing a way to access its only objects which can be accessed directly without need to instantiate the object of the class. 
