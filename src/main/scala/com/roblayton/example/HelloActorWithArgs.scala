package com.roblayton.example

import akka.actor.Actor

class HelloActorWithArgs(name: String) extends Actor {
  def receive = {
    case "what's your name?" => println("my name is %s".format(name))
    case _ => println("message not recognized")
  }
}
