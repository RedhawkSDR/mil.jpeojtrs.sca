package FRONTEND;


/**
* FRONTEND/RFCapabilities.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/Frontend.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class RFCapabilities implements org.omg.CORBA.portable.IDLEntity
{
  public FRONTEND.FreqRange freq_range = null;
  public FRONTEND.FreqRange bw_range = null;

  public RFCapabilities ()
  {
  } // ctor

  public RFCapabilities (FRONTEND.FreqRange _freq_range, FRONTEND.FreqRange _bw_range)
  {
    freq_range = _freq_range;
    bw_range = _bw_range;
  } // ctor

} // class RFCapabilities
