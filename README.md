This is a simple implementation of a Magical Arena game in Java.

Project Structure
````
MagicalArena/

    src/
        main/
            java/
                com/
                    magicalarena/
                        Player.java
                        Die.java
                        Arena.java
                        Main.java
        test/
            java/
                com/
                    magicalarena/
                        PlayerTest.java
                        DieTest.java
                        ArenaTest.java
    pom.xml
    README.md 
````
How to Run

Ensure you have Java JDK 11 or higher installed.

Navigate to the project root directory.

Compile the project:
````
javac -d out src/main/java/com/magicalarena/*.java
````

Run the main class:
````
java -cp out com.magicalarena.Main
````


Running Tests

To run the tests, you'll need JUnit 5. You can run the tests using your IDE's test runner or by using Maven:
````
mvn test
````