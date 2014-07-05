# Vert.x Gradle Template

Template project for creating a Vert.x module with a Gradle build.

Clone this and adapt it to easily develop Vert.x modules using Gradle as your build tool.

By default this module contains a HelloWorld example application implemented in all stable language implementations currently supported by vert.x.

This template provides a [http://www.gradle.org/docs/current/release-notes#upgraded-to-groovy-2.3.2](gradle v2.0) wrapper.

## Getting started 

Clone this repo, replace `origin` with your preferred one and run `gradlew` to test whether everything is working. 

````sh
git clone git@github.com:macedigital/vertx-gradle-template.git <name of your project>

cd my-vertx-module

git remote rm origin

git remote add origin <path to your repo>

./gradlew test 
````

For further details go to http://vertx.io/gradle_dev.html. 

## Configure the project

You can configure many things in `gradle.properties`:

* Change `modowner`, `modname` and `version` to your liking as described in the [http://vertx.io/mods_manual.html](modules manual).
* `pullInDeps` determines whether all module dependencies should be packaged into the module as [http://vertx.io/mods_manual.html#nested-mods](nested module).

## Setup your IDE

You can use the `idea` and `eclipse` Gradle plugins to create the project files for your IDE.

````sh
./gradlew idea
````

Or

````sh
./gradlew eclipse
````

Once the IDE files have been created you can open the project in your IDE.

See the [build script](build.gradle) for the list of useful tasks


