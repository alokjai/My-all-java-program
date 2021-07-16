
// Using environmental property

class ShowUserDir
 {
	 public static void main(String args[])
	 {
		 System.out.println(System.getProperty("user.home")); 
		 System.out.println(System.getProperty("os.arch")); 
		 System.out.println(System.getProperty("os.name")); 
		 System.out.println(System.getProperty(" os.version")); 
		 System.out.println(System.getProperty("user.name")); 
		 System.out.println(System.getProperty("java.home")); 
		 System.out.println(System.getProperty("file.separator")); 
		 System.out.println(System.getProperty("java.class.path")); 
		 System.out.println(System.getProperty("java.compiler")); 
		 
		 System.out.println(System.getProperty("java.library.path")); 
		 System.out.println(System.getProperty("java.specification.name")); 
		 System.out.println(System.getProperty("java.specification.vendor")); 
		 System.out.println(System.getProperty("java.vendor")); 
		 System.out.println(System.getProperty("java.vm.name")); 
		 System.out.println(System.getProperty(" java.vm.specification.name")); 
		 } 
}
