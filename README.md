Demonstration of using Java annotation processors using Gradle's `annotationProcessor` dependency configuration.

## Running

Just run `./gradlew test`.

This will run `CarMapperTest` which uses a generated *[mapstruct](https://github.com/mapstruct/mapstruct)* mapper class to map from a `CarEntity` to a `CarDto` class.

## How does it work?

In *build.gradle* the `annotationProcessor` dependency configuration is used to specify the *mapstruct* annotation processor:

```
    annotationProcessor 'org.mapstruct:mapstruct-processor:1.3.1.Final'
```

This will be passed to the Java compiler's `--processorpath` option which calls the annotation processor to generate the `CarMapper`
implementation class `CarMapperImpl`.