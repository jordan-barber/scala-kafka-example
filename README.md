<h1 align="center">Scala Kafka Example</h1>
<p align="center">
    This is an example project to see how well Scala works with kafka. 
    _This is one of my first Scala projects, and so may not be the best code._
    Feel free to submit a <a href="https://github.com/jordan-barber/scala-kafka-example/pulls">PR</a>
    with any improvements that could be inside this codebase. 
</p>

<p>
    This example was made primarily for myself, however if others find it useful,
    then feel free to take a peak at the code and dig in.
</p>

<h2>Setup</h2>
* **To run this project you will need to have <a href="https://www.scala-sbt.org/">sbt</a> installed,as well as 
<a href="https://www.docker.com/">Docker</a>.**
* Bring up <a href="https://kafka.apache.org/">Kafka</a>, Zookeeper and the schema registry using the following - 
`docker-compose up`.
* Ensure the above has worked, and running on the correct ports as defined in the
`docker-compose.yml`. You can also run `docker ps` to see which port the container
is running on.
* Ensuring you're inside the root of the project, run `sbt run`, this will start the application. I 
will later be 'dockerising' this, however for now this works.

<h3>Libraries worth reading up on</h3>
This project uses multiple libraries/frameworks, below I will list some of the best ones
as and when I use them, and if they're worth while reading up on.
