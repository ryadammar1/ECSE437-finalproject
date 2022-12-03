.PHONY: run
run:
	docker build --tag java-docker . && docker run -it -p 8080:8080 java-docker
