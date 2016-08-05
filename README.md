# android-scala-template
A basic template for getting a Scala on Android app up and running

## Setting up Intelli J
* Ensure that the project SDK is Android Java, and not just Java
* From the SBT android plugin: To ensure proper building, configure the IDE Run command to execute an SBT android:package task instead of Make (remove the make entry); this is found under Run Configurations.
* Make sure that you mark the `target` directory as `Not Excluded` in order for the R class to appear as compiled
* Once that is done, IntelliJ should notice that you have an Android project - configure it, and you can use Android Monitor
