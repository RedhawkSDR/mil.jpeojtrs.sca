package FRONTEND;


/**
* FRONTEND/AnalogTunerPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/TunerControl.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public class AnalogTunerPOATie extends AnalogTunerPOA
{

  // Constructors

  public AnalogTunerPOATie ( FRONTEND.AnalogTunerOperations delegate ) {
      this._impl = delegate;
  }
  public AnalogTunerPOATie ( FRONTEND.AnalogTunerOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public FRONTEND.AnalogTunerOperations _delegate() {
      return this._impl;
  }
  public void _delegate (FRONTEND.AnalogTunerOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }

  /** Set/Get tuner center frequency */
  public void setTunerCenterFrequency (String id, double freq) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerCenterFrequency(id, freq);
  } // setTunerCenterFrequency

  public double getTunerCenterFrequency (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerCenterFrequency(id);
  } // getTunerCenterFrequency


  /**  Set/Get tuner bandwidth */
  public void setTunerBandwidth (String id, double bw) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerBandwidth(id, bw);
  } // setTunerBandwidth

  public double getTunerBandwidth (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerBandwidth(id);
  } // getTunerBandwidth


  /**  MGC/AGC  */
  public void setTunerAgcEnable (String id, boolean enable) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerAgcEnable(id, enable);
  } // setTunerAgcEnable

  public boolean getTunerAgcEnable (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerAgcEnable(id);
  } // getTunerAgcEnable


  /**  MGC Gain (where negative gain is attentuation)*/
  public void setTunerGain (String id, float gain) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerGain(id, gain);
  } // setTunerGain

  public float getTunerGain (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerGain(id);
  } // getTunerGain


  /**  Tuner Reference Source: 0 = internal,  1 = external*/
  public void setTunerReferenceSource (String id, int source) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerReferenceSource(id, source);
  } // setTunerReferenceSource

  public int getTunerReferenceSource (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerReferenceSource(id);
  } // getTunerReferenceSource


  /**  Enable/Disable Tuner - Expected to keep current tuner settings on a disable and an EOS to be sent */
  public void setTunerEnable (String id, boolean enable) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    _impl.setTunerEnable(id, enable);
  } // setTunerEnable

  public boolean getTunerEnable (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerEnable(id);
  } // getTunerEnable


  /** Get the type of tuner (ie- RX or DDC) associated with this allocation id*/
  public String getTunerType (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerType(id);
  } // getTunerType


  /** Returns whether this allocation id has control (modification privledges) over the tuner*/
  public boolean getTunerDeviceControl (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerDeviceControl(id);
  } // getTunerDeviceControl


  /** Retrieves the group id (may be empty) for this allocation id */
  public String getTunerGroupId (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerGroupId(id);
  } // getTunerGroupId


  /** Retrieves the rf flow id (may be empty) for this allocation id */
  public String getTunerRfFlowId (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerRfFlowId(id);
  } // getTunerRfFlowId


  /** Key/Value pair of entire tuner status structure */
  public CF.DataType[] getTunerStatus (String id) throws FRONTEND.FrontendException, FRONTEND.BadParameterException, FRONTEND.NotSupportedException
  {
    return _impl.getTunerStatus(id);
  } // getTunerStatus

  private FRONTEND.AnalogTunerOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class AnalogTunerPOATie
