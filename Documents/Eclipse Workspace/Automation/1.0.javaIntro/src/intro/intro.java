/*
	Java
	
		Class level concurrent object oriented programming language
		Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995.
		James Gosling is known as the father of Java. 
		Before Java, its name was Oak. 
		Since Oak was already a registered company, 
		so James Gosling and his team changed the Oak name to Java.	
		JDK - Java Development kit (Extension .java)
		JRE - Java runtime environment (Extension .class)
		JVM - Java virtual machine
				-> If error or machine fails ->Exception handles
			 
	Setting environment variable
	
		Windows
			Open Search and type advanced system settings
			In the shown options, select the View advanced system settings link
			Under the Advanced tab, click Environment Variables
			In the System variables section, click New (or User variables for single user setting)
			Set JAVA_HOME as the Variable name and the path to the JDK installation as the Variable value and click OK
			Click OK and click Apply to apply the changes
		Mac
			Open ~/.bash_profile in any text editor and add:
				export JAVA_HOME=$(/usr/libexec/java_home)
			Save and close the file.
			Open a Terminal and run the source command to apply the changes:	
				source ~/.bash_profile
			Now we can check the value of the JAVA_HOME variable:
				echo $JAVA_HOME
			The result should be the path to the JDK installation:
				/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home	

	Eclipse
	
	 	Open a workspace
	 	.matadata -> Data about data
	 	File -> New -> other -> Java project -> Next -> Project Name (Must be a camel case)
	 	
	selenium workspace
	
	  	Workspace -> project (Multiple project) -> package (multiple package) ->class -> function
	  				
	  	workspace -> SampleProject -> com.CompanyName.ProjectName.ModuleName.SubModuleName.SampleTest -> SampleTest
	
	  	
	  	
	  	
*/