package FRONTEND;

/**
* FRONTEND/FreqRangeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/Frontend.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class FreqRangeHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.FreqRange value = null;

  public FreqRangeHolder ()
  {
  }

  public FreqRangeHolder (FRONTEND.FreqRange initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.FreqRangeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.FreqRangeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.FreqRangeHelper.type ();
  }

}