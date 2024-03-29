Demonstration of using Java annotation processors using Gradle's `annotationProcessor` dependency configuration.

Accompanies the *Annotation processors in Gradle with the annotationProcessor dependency configuration* 
[YouTube video](https://youtu.be/EMdavUDRmy4) and article at [tomgregory.com](https://tomgregory.com/annotation-processors-in-gradle-with-the-annotationprocessor-dependency-configuration/).

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

## Need Gradle support?
Contact me if you need help with Gradle at [tom@tomgregory.com](mailto:tom@tomgregory.com).
