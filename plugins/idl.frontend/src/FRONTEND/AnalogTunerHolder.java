package FRONTEND;

/**
* FRONTEND/AnalogTunerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/TunerControl.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class AnalogTunerHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.AnalogTuner value = null;

  public AnalogTunerHolder ()
  {
  }

  public AnalogTunerHolder (FRONTEND.AnalogTuner initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.AnalogTunerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.AnalogTunerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.AnalogTunerHelper.type ();
  }

}
