package FRONTEND;


/**
* FRONTEND/GPSInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/GPS.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class GPSInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String source_id = null;

  /** NAV source identifier */
  public String rf_flow_id = null;

  /** identifier of rf_flow (ie - antenna) feeding into this GPS hardware */
  public String mode = null;
  public int fom = (int)0;

  /** Figure of merit (for position) */
  public int tfom = (int)0;

  /** Figure of merit (for time) */
  public int datumID = (int)0;

  /** Should be 47, WGS 1984 */
  public double time_offset = (double)0;

  /** Characterization of the Reference Source - should be mostly 0 */
  public double freq_offset = (double)0;

  /** Frequency offset of Reference Source */
  public double time_variance = (double)0;

  /** Timing Stability/Variance of Reference Source */
  public double freq_variance = (double)0;

  /** Frequency Stability/Variance of Reference Source */
  public short satellite_count = (short)0;
  public float snr = (float)0;
  public String status_message = null;
  public BULKIO.PrecisionUTCTime timestamp = null;

  /** Allows for keyword expansion*/
  public CF.DataType additional_info[] = null;

  public GPSInfo ()
  {
  } // ctor

  public GPSInfo (String _source_id, String _rf_flow_id, String _mode, int _fom, int _tfom, int _datumID, double _time_offset, double _freq_offset, double _time_variance, double _freq_variance, short _satellite_count, float _snr, String _status_message, BULKIO.PrecisionUTCTime _timestamp, CF.DataType[] _additional_info)
  {
    source_id = _source_id;
    rf_flow_id = _rf_flow_id;
    mode = _mode;
    fom = _fom;
    tfom = _tfom;
    datumID = _datumID;
    time_offset = _time_offset;
    freq_offset = _freq_offset;
    time_variance = _time_variance;
    freq_variance = _freq_variance;
    satellite_count = _satellite_count;
    snr = _snr;
    status_message = _status_message;
    timestamp = _timestamp;
    additional_info = _additional_info;
  } // ctor

} // class GPSInfo
