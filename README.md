# jfr-merger

FIXME: description

## Installation

> cd ...
> docker run -it -v $(pwd):/app -w /app node:23 npm install react@17.0.2 react-dom@17.0.2 create-react-class
> docker run -it -v $(pwd):/app -w /app node:23 npm install --save-dev shadow-cljs
> mkdir -p lib && curl -o lib/jfr-converter.jar https://github.com/async-profiler/async-profiler/releases/download/nightly/jfr-converter.jar
> clj -M:cljs

{
    "dependencies": {
        "react": "^19.0.0",
        "react-dom": "^19.0.0"
    }
}

## Usage

FIXME: explanation

    $ java -jar jfr-merger-0.1.0-standalone.jar [args]
