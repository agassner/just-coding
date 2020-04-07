all: run

build:
	docker build -t agassner/just-coding-python:latest .

run: build
	docker run --rm -it agassner/just-coding-python:latest py.test --cov=. --cov-report term-missing
	docker run --rm -it agassner/just-coding-python:latest pylama
