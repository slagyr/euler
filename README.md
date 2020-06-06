# Project Euler in Clojure

Project Euler ([http://projecteuler.net](http://projecteuler.net)) is an addictive and fun way to learn a new language and practice your craft.  This repository is a scaffold for solving Euler problems using Clojure.  It generates specs and solution stubs in an organized structure, making life just a little bit better.

## Install

1. If you don't have [Leiningen](https://github.com/technomancy/leiningen) installed, [download this script](https://github.com/technomancy/leiningen/raw/stable/bin/lein) and add it to you path.
2. Check out this project: 

		$ git clone git@github.com:slagyr/euler.git

3. Download dependencies: 

		$ lein deps

4. Run the specs:
	
	    $ lein spec
	    F
	    1)
	    'Euler Problem #1 Solves #1' FAILED
	    Expected: <-1>
	         got: nil (using =)
	    /Users/micahmartin/Projects/clojure/euler/problem001_spec.clj:11
	    Finished in 0.00288 seconds
	    1 examples, 1 failures
	

## Usage

### Problem #1

Euler Problem #1 is ready to go with two files pre-generated:
1. spec file: `spec/euler/level1/problem001_spec.clj`
2. source file: `src/euler/level1/problem001.clj`

In the source file you'll fine a link to the problem on the Project Euler web site.  Plan your solution then write a test, make it pass, repeat.  Each generated spec file contains one example (or test), that you'll need to edit.  Feel free to add more.

### Starting the Next Problem

When you're ready for a new problem, generate stubs.  A Leiningen task has been provided to do this for you.  Simple provide the problem number.

	$ lein euler 2
	writing 247 bytes to spec/euler/level1/problem002_spec.clj
	writing 52 bytes to src/euler/level1/problem002.clj
	
### Running Specs

Run all the specs:

	$ lein spec
	
Run one spec or one directory
	
	$ lein spec spec/euler/<file or dir name>
	
My favorite way to run the spec is to use the auto runner.  Start her up and she'll run specs every time you touch a file.

	$ lein spec -a
		
or for nicer output (for reasons we won't go into, commands run using Leiningen get whitespace stripped)

	$ java -cp `lein classpath` speclj.main -a -c
	
### Have Fun

Remember this is a learning exercise.  There's plenty of stuff to practice:

* Clojure
* Writing Clean Code
* TDD/BDD
* Good Design
* Refactoring
* Organization
		
## Contribute

Contributions are welcome.  Just submit a pull request. 

## License

Copyright (C) 2020 Micah Martin

Distributed under the MIT License.
