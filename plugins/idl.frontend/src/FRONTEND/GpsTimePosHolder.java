package FRONTEND;

/**
* FRONTEND/GpsTimePosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/GPS.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class GpsTimePosHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.GpsTimePos value = null;

  public GpsTimePosHolder ()
  {
  }

  public GpsTimePosHolder (FRONTEND.GpsTimePos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.GpsTimePosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.GpsTimePosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.GpsTimePosHelper.type ();
  }

}
