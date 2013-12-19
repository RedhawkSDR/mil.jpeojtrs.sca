package FRONTEND;


/**
* FRONTEND/AnalogTunerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/TunerControl.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

abstract public class AnalogTunerHelper
{
  private static String  _id = "IDL:FRONTEND/AnalogTuner:1.0";

  public static void insert (org.omg.CORBA.Any a, FRONTEND.AnalogTuner that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FRONTEND.AnalogTuner extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (FRONTEND.AnalogTunerHelper.id (), "AnalogTuner");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static FRONTEND.AnalogTuner read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AnalogTunerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FRONTEND.AnalogTuner value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static FRONTEND.AnalogTuner narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof FRONTEND.AnalogTuner)
      return (FRONTEND.AnalogTuner)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      FRONTEND._AnalogTunerStub stub = new FRONTEND._AnalogTunerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static FRONTEND.AnalogTuner unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof FRONTEND.AnalogTuner)
      return (FRONTEND.AnalogTuner)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      FRONTEND._AnalogTunerStub stub = new FRONTEND._AnalogTunerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
