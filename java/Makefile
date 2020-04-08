all: run

build:
	docker build -t agassner/just-coding-java:latest .

run: build
	docker run --rm -it agassner/just-coding-java:latest gradle clean build --stacktrace
