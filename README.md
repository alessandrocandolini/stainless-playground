# stainless-playground

https://stainless.epfl.ch/ is a promising tool for formal verification of Scala programs, and this project is a simple playground to start exploring stainless capabilities and ergonomics. 

## Motivations

Formal verification has the reputation of being not cost-effective enough to justify its usage when it comes to prove correctness of software systems, particularly when the software in question is not either mission or life critical.
Depending on the needs, other techniques works "well enough" as cheaper surrogates of formal methods, including if/when applicable:
* example-based testing (any kind, manual, automated, unit, integration, UI, E2E, functional, TDD, BDD, etc) 
* property based testing 
* leveraging the compiler and type system as pour-man formal validation tool, 
* type level programming, 
* brute-force exhaustive checkers. 

These and other techniques have proved to be a valuable and more affordable alternative for detecting and preventing effectively whole categories of bugs in real-life software projects, without incurring the extra overhead, complexity and maintenance costs associated to formal methods. 

For cases when none of aforementioned techniques is powerful enough (eg, concorrecy), formal modelling by using specification languages like TLA+ can come to the rescue and assistence in preventing design mistakes that would translate directly into more subtle pitfalls in the code. 

The practical usefulness of formal verification in real-life sofware is also sometimes questioned based on the observations that formal methods themselves, despite their costs, cannot guarantee bullet-proof correctness in real cases.
Despite their cost, their uselefulness seems bound by several conditions, including (but not only): 
* non-academic software always (or almost always) has to interact typically with third parties libraries, frameworks, services that can be buggy, or that can have a beaviour different from our understanding (despite our attempts to infer the right behaviour under all circumstances from the docs)
* how can formal methods be helpful when developing sofware on top of pre-existing, legacy software that has got well-known bugs in backlog, never prioritised yet
* when following agile methodologies, often requirements may come in a incomplete form
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



