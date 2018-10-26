# mavenHelloWolrd
Just a simple project using maven archetype

## What do you need ?

  - Java version: 1.8.0_181

## How To use

  - If you want to se the docs of my app run:
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
