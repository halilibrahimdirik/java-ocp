package chapter9;

public class chapter9 {

	 /*
	  * 
	  * 
Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
Files.isRegularFile(Paths.get("/canine/types.txt"));
Files.isSymbolicLink(Paths.get("/canine/coyote"));

The first example returns true if fur.jpg is a directory or a symbolic link to a directory
and false otherwise. Note that directories can have extensions in many file systems, so it
is possible for fur.jpg to be the name of a directory. 

The second example returns true if
types.txt points to a regular file or alternatively a symbolic link that points to a regular
file. The third example returns true if /canine/coyote is a symbolic link, regardless of
whether the file or directory it points to exists.


We illuminate these concepts in Table 9.3. For this table, assume that the file system
with the directory /canine/coyote and file /canine/types.txt exists. Furthermore,
assume that /coyotes is a symbolic link within the file system that points to another path
within the file system.


Ta B le 9. 3 isDirectory(), isRegularFile(), isSymbolicLink() examples
isDirectory() isRegularFile() isSymbolicLink()
/canine/coyote true false false
/canine/types.txt false true false
/coyotes true if the target is a
directory
true if the target is a
regular file
true
You see that the value of isDirectory() and isRegular() in Table 9.3 cannot be determined on the symbolic link /coyotes without knowledge of what the symbolic link points
to.
exception handling
You may notice when browsing the Files API that isDirectory(), isRegularFile(), and
isSymbolicLink() do not throw an exception if the path does not exist, so the following
code is redundant:
	  */
}
