To import this into Intellij, do the following:

File -> New -> Project from Existing Sources -> navigate to pom.xml (to import as a Maven project) -> 
Check "Import Maven projects automatically" -> Next (until finished) -> right click "main" in the project view (alt-1) ->
Click mark directory as -> sources root

If you're getting a language level error, then do the following:

File -> Project Structure -> Modules -> Language Level (change to 8 or higher)
