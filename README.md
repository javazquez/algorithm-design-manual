# algorithm-design-manual

Code that I wrote while going through *The Algorithm Design Manual* by Steven S. Skiena

## Run Tests

lein midje will run all tests.

lein midje namespace.* will run only tests beginning with "namespace.".

lein midje :autotest will run all the tests indefinitely. It sets up a watcher on the code files. If they change, only the relevant tests will be run again.



