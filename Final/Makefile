CLASSPATH = .
JFLAGS = -g -cp $(CLASSPATH)
.SUFFIXES: .java .class
.java.class:
	javac $(JFLAGS) $*.java

SRC = BestInt.java  BestSorter.java

default: classes

classes: $(SRC:.java=.class)

clean:
	rm -f *.class

run: classes
	java -cp $(CLASSPATH) BestSorter

test: test-build
	java -cp $(CLASSPATH) BestSorter
