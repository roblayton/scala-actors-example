package com.roblayton.example

import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {
  var system = ActorSystem("HelloSystem")

  var helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "how are you?"
  helloActor ! "goodbye"

  var helloActorWithArgs = system.actorOf(Props(new HelloActorWithArgs("Rob")), name = "helloactorwithargs")
  helloActorWithArgs ! "what's your name?"
  helloActorWithArgs ! "goodbye"
}
