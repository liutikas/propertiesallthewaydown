# Example of how gradle properties propagate

Run `./gradlew projects`

and you'll see that gradle.properties values are available in every project

```
> Configure project :libA
:libA - foo

> Configure project :libB
:libB - foo

> Configure project :libA:libA-fun
:libA:libA-fun - foo

```