package FRONTEND;

/**
* FRONTEND/NavDataHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/NavigationData.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/


/************************/
public final class NavDataHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.NavData value = null;

  public NavDataHolder ()
  {
  }

  public NavDataHolder (FRONTEND.NavData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.NavDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.NavDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.NavDataHelper.type ();
  }

}
