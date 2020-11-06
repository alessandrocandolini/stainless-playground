# stainless-playground

https://stainless.epfl.ch/ is a promising tool for formal verification of programs that are written in (a subset of) the Scala programming language, and this project is a simple playground to start exploring stainless capabilities and ergonomics, as well as whether/how stainless can fit into larger scale projects.

## Motivations

Formal verification has the reputation of being not cost-effective enough to justify its business usage when it comes to prove correctness of software systems, particularly when the software in question is not either mission or life critical.
Depending on the needs, other techniques works "well enough" as cheaper surrogates of formal methods, including if/when applicable some suitable combination of:
* example-based testing (any kind of: manual, automated, unit, integration, UI, E2E, functional, TDD, BDD, etc),
* property-based testing,
* linters and code analysers, 
* leveraging type system and compiler as pour-man formal validation tool, 
* type level programming (ie, "type safety" on steroids), 
* brute-force exhaustive checkers. 

These and other techniques have proved to be a valuable and more affordable alternative for detecting and preventing effectively whole categories of bugs in real-life software projects, without incurring the extra overhead, complexity and maintenance costs associated to formal methods. 

For cases when none of aforementioned techniques is powerful enough (eg, concurrecy), formal modelling by using specification languages like TLA+ can come to the rescue and assistence in preventing design mistakes that would translate directly into more subtle pitfalls in the code. Formal specification has the additional advantage of providing a way to precisely think about the software, and express ideas *above the code level*. TLA+ is a tool to formalise and develop specifications in a way that helps reasoning about those. This is a huge advantage when it comes to design, and it allows to detect and surface conceptual limitations of the specification without the noise of the nitty-gritty implementation details. The general question on whether and how it's meaninful/helpful/possible to prove adherence of the software implementation to a TLA spec (and ultimately whether this approach even makes sense conceptually, considering the fact that TLA+ operates at a different, higher, level of abstraction) remains largely unanswered though.

The practical usefulness of formal verification in real-life sofware is also sometimes questioned based on the observations that formal methods themselves, despite their costs, cannot guarantee bullet-proof correctness in real cases.
Despite their cost, their uselefulness seems bound by several conditions, including (but not only): 
* non-academic software always (or almost always) has to interact typically with third parties libraries, frameworks, services that can be buggy, or that can have a beaviour different from our understanding (despite our attempts to infer the right behaviour under all circumstances from the docs)
* how can formal methods be helpful when developing sofware on top of pre-existing, legacy software that has got well-known bugs in backlog, never prioritised yet
* when following agile methodologies, often requirements may come in a incomplete form
* sometimes, there are edge cases that are known but we want to ignore on purpose, to decrease the size and the scope of the project
* sometimes it's hard to translate product, business and domain requirements into laws that can be formally verified, it's more a list of example-based high-level, user-centric acceptance criteria 

Last but not least, tools for formal verification like Coq have a steep learning curve that might discourage adoption. 

A question naturally arise: Is there room for formal verification in software industry? 

Modern software development seems to be dominated and stretched by the following competing forces:
* increase in software complexity, that inherently makes the code more prone to errors
* bugs are less and less tolerated by end users and by the companies themselves that might end up loosing money either directly or indirectly as consequence of certain faults
* desire to accelerate the speed of development 

Software engineers needs cheap but powerful tools that allow them to deliver higher quality software even more at pace. 
Companies often needs quality & speed. 
Knowing formal methods can be another weapon in the toolkit that sometimes can make the difference. 

## How to run the playground

The playground is a simple `sbt` scala project. Stainless comes either as a stand-alone CLI tool or as a sbt plugin. This project uses the sbt plugin.  

Notice
* The sbt plugin currently does not support dotty though: https://github.com/epfl-lara/stainless/issues/178) 
* Scala 2.13.x is also unsupported. To use stainless use the following Scala version: 2.12.9

When executing sbt `compile` on a module where the `StainlessPlugin` is enabled (eg, the `verified` module in this project(, Stainless will check the scala code and report compilation errors if some of the properties are not verified. 





