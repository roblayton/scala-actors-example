package com.roblayton.example

import akka.actor.Actor

class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello to you as well")
    case "how are you?" => println("doing fine")
    case _ => println("message not recognized")
  }
}
