package FRONTEND;

/**
* FRONTEND/NavigationPacketHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/NavigationData.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class NavigationPacketHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.NavigationPacket value = null;

  public NavigationPacketHolder ()
  {
  }

  public NavigationPacketHolder (FRONTEND.NavigationPacket initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.NavigationPacketHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.NavigationPacketHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.NavigationPacketHelper.type ();
  }

}
