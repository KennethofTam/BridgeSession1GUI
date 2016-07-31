# BridgeSession1GUI
An introductory Java quiz for the summer bridge program at Purdue University.

Originally created by Sahil Pujari and Victoria Shurman, August 2016

## Technical Overview
* [Java Swing](https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html)
* [ZipUtils](https://bitbucket.org/matulic/ziputils/overview)


## How to Run

> **NOTES:** This app was intended for the Linux machines at Lawson and
may have issues on other operating systems.

All of the files needed to run the quiz are in
'session01-activity.zip' which contains the executable 'Start.jar' file.

Run the following commands with your command line once you've navigated
to the directory that has 'session01-activity.zip' in it.

```
unzip session01-activity.zip
java -jar Start.jar
```

This will execute the jar file which has instructions on how to proceed through
the quiz.

The answers necessary to solve the quiz are in the repository text file
'answerkey.txt'. The answers for the section afterwards are also in this
repository in the 'session1-1XXhints.txt' depending on what section you choose.

## Troubleshooting
If you get the error "XXXXX cannot be resolved to a type", import the libraries
 - pdfbox-app-1.8.10.jar
 - ziputils-1.2.jar

## Contact
For any questions about the code implementation or so, please feel free to reach us at

  Victoria Shurman : vshurman@cs.purdue.edu
  Sahil Pujari : pujari@cs.purdue.edu
