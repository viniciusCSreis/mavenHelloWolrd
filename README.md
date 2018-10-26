# mavenHelloWolrd
Just a simple project using maven archetype using the tips of:
+ [Maven Tutorial](https://www.devmedia.com.br/introducao-ao-maven/25128)

## What do you need ?

  - Java version: 1.8.0_181

## How To use

  - Compile my app:
  ```
    $ mvn compile
  ```
  
  - If you want the docs of my app:
  ```
  $ cd my-app
  $ mvn clean site dashboard:dashboard
  $ cd target/site
  ``` 
   - install my app:
  ```
  $ cd my-app
  $ mvn clean install
  ```
  - start javaMagazine Web:
  ```
  $ cd javaMagazineWeb
  $ mvn clean install jetty:run
  ```
  - Open Your bowser on:
  ```
  http://localhost:8080/javaMagazineWeb/megasena
  ```
