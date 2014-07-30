# Vert.x Gradle Template

Template project for creating a Vert.x module with a Gradle build.

Clone this and adapt it to easily develop Vert.x modules using Gradle as your build tool.

By default this module contains a com.mycompany.myproject.HelloWorldVerticle example application implemented in all stable language implementations currently supported by vert.x.

This template provides a [gradle 2.0](http://www.gradle.org/docs/current/release-notes.html) wrapper.

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

* Change `modowner`, `modname` and `version` to your liking as described in the [modules manual](http://vertx.io/mods_manual.html).
* `pullInDeps` determines whether all module dependencies should be packaged into the module as [nested module](http://vertx.io/mods_manual.html#nested-mods) (default: true).
* `produceJar` Set to true if you want the build to output a jar as well as a module zip file (default: true).
* `createFatJar` Set to true if you want to build a fat executable jar containing everything needed to run the module (default: false).

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

## FAQ

* gradle command `runMod` fails to find classpath: 
    * try invoking the script `env -u VERTX_MODS ./gradlew runMod` can help if developing a single module 