@echo off
mkdir target\classes 2>nul
mkdir target\test-classes 2>nul

javac -d target\classes src\main\mainjava\arieTriunghi.java
javac -cp ".;.\lib\junit-4.13.2.jar;.\lib\hamcrest-core-1.3.jar;.\target\classes" -d target\test-classes src\test\testjava\arieTriunghiTest.java

java -cp ".;.\lib\junit-4.13.2.jar;.\lib\hamcrest-core-1.3.jar;.\target\classes;.\target\test-classes" org.junit.runner.JUnitCore testjava.arieTriunghiTest
pause