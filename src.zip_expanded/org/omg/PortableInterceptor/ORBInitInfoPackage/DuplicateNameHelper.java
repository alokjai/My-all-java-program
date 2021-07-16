package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
* org/omg/PortableInterceptor/ORBInitInfoPackage/DuplicateNameHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u202/12323/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, December 15, 2018 8:02:44 PM PST
*/

abstract public class DuplicateNameHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/ORBInitInfo/DuplicateName:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id (), "DuplicateName", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName value = new org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName ();
    // read and discard the repository ID
    istream.read_string ();
    value.name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.name);
  }

}
