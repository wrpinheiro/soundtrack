# Soundtrack

This is a demo application that shows how to use Maven multimodules.

The related post is available [here](http://thecodeinside.com/criando-uma-aplicacao-multimodulo-com-maven/) (pt-BR only)

# Building & Running

Let `${soundtrack-path}` be the application's root directory. Just execute the following commands:

```
cd ${soundtrack-path}
mvn package
cd ./soundtrack-web
mvn exec:java
```

Point your browser to `http://localhost:8080`. You should see something like that:

```
Rainbow in the Dark
For Those About To Rock
The Court of the Crimson King
And Justice for All
The Working Man
Dread And The Fugitive Mind
Heart of the Sunrise
Children of the Grave
```
