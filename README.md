# Read Me First
this project was developed for the evaluation task for Java developer position at Progressoft Corp
# Work Done:
* created a spring boot app that connects to a mysql db, that is containerized using Docker, and following
  the SOLID and Clean code principles.
* the system validate the inputs before saving the records to the database using javax validation
* the system follows layered architecture where it's separated into (model, service, and controller) packages
* followed TDD, as I created unit test for the components of the system using Junit
* used sl4j for logging
* the project uses maven