all: run

build:
	docker build -t agassner/just-coding-ruby:latest .

run: build
	docker run --rm -it agassner/just-coding-ruby:latest ruby src/test_interest_calculator.rb
