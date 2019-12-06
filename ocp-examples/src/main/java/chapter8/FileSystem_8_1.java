package chapter8;

public class FileSystem_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 What can Java applications do outside the scope of managing
objects and attributes in memory? How can they save data
so that information is not lost every time the program is
terminated? They use files, of course! You can design code that writes the current state of
an application to a file every time the application is closed and then reloads the data when
the application is executed the next time. In this manner, information is preserved between
program executions.
This chapter focuses on using the java.io API to interact with files and streams. We
start by describing how files and directories are organized within a file system and show
how to access them with the java.io.File class. We then show how to read and write
file data with the stream classes. Finally, we conclude this chapter by discussing ways of
reading user input at runtime using the Console class.
In the next chapter, “NIO.2,” we will revisit the discussion of files and show how Java
now provides more powerful techniques for managing files.
Understanding Files and Directories
We begin this chapter by describing what a file is and what a directory is within a file
system. We then present the java.io.File class and demonstrate how to use it to read
and write file information.
Conceptualizing the File System
Before we start working with files and directories, we present the terminology that we will
be using throughout this chapter.
A file is record within a file system that stores user and system data. Files are organized
using directories. A directory is a record within a file system that contains files as well
as other directories. For simplicity, we often refer to a directory reference as a file record
throughout this chapter, since it is stored in the file system with a unique name and with
attributes similar to a file. For example, a file and directory can both be renamed with the
same operation. Finally, the root directory is the topmost directory in the file system, from
which all files and directories inherit. In Windows, it is denoted with a drive name such as
c:\, while on Linux it is denoted with a single forward slash /.
In order to interact with files, we need to connect to the file system. The file system
is in charge of reading and writing data within a computer. Different operating systems
use different file systems to manage their data. For example, Windows-based systems use
ifferent fi le system than Unix-based ones. As you shall see, Java includes numerous
methods, which automatically connect to the local fi le system for you, allowing you to
perform the same operations across multiple fi le systems.
A path is a String representation of a fi le or directory within a fi le system. Each fi le system
defi nes its own path separator character that is used between directory entries. In most
fi le systems, the value to the left of a separator is the parent of the value to the right of the
separator. For example, the path value /user/home/zoo.txt means that the fi le zoo.txt is
inside the home directory, with the home directory inside the user directory. You will see that
paths can be absolute or relative later in this chapter.
We show how a directory and fi le system is organized in a hierarchical manner in Figure 8.1 .
In this diagram, directories are represented as rectangles and fi les as ovals. Directories can be
empty, as shown with the c:\zoo and c:\app\employees directories.
f I gu r e 8 .1 Directory and file hierarchy
c:
app
animals
Bear.java
Bear.class
employees
java.exe
zoo
info.txt
Introducing the File Class
The fi rst class that we will discuss is one of the most commonly used in the java.io API,
the java.io.File class, or File class for short. The File class is used to read information
about existing fi les and directories, list the contents of a directory, and create/delete fi les
and directories.
An instance of a File class represents the pathname of a particular fi le or directory on
the fi le system. The File class cannot read or write data within a fi le, although it can be
passed as a reference to many stream classes to read or write data, as you shall see in the
next section.
One common mistake new Java developers make is forgetting that the
File class can be used to represent directories as well as files.
		 
		 
		 
		 */
		
	}

}
