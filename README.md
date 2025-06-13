# Parameterized-Enum-Module
A repository containing two intellij projects in which there is an issue with importing parameterized enums that I am unable to find a solution for. Both are running Gradle 8.14.1 and Java SDK JBR17.0.3.

### Project owner
   * [Daniel Moore](danielmoore@evertz.com)

This repository showcases an error with importing a parameterized enum using the java module system that I have not been able to find a fix for.
It is very likely due to the version of intellij I am using or some other local issue, but creating a public repository may help figure out the issue in case it isnt, and may help anyone else who finds the same error, as looking online for my own solution I found nothing of help.

The repository is split into two intellij projects to showcase the error.
- The issue is that the import of ParameterEnum fails. The error shown on intellij is 'Cannot resolve symbol 'ParameterEnum'
- The module is shown in external libraries as expected and the basic non-parameterized enum ExampleEnum imports successfully
- ParameterEnum has a header of 'Decompiled .class file, bytecode version: 61.0 (Java 17))', ExampleEnum does not.

![An image showing the error](https://github.com/DanielMoore-Evertz/Parameterized-Enum-Module/blob/main/enumimporterror.png)


I am using:
- Intellij IDEA 2022.2 (Community Edition)
Build #IC-222.3345.118, built on July 26, 2022
Runtime version: 17.0.3+7-b469.32 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
- Gradle 8.14.1 for both projects
- Java SDK JBR17.0.3 for both projects
