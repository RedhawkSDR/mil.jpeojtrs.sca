package FRONTEND;


/**
* FRONTEND/RFInfoPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/RFInfo.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/


/*******************************/
public class RFInfoPOATie extends RFInfoPOA
{

  // Constructors

  public RFInfoPOATie ( FRONTEND.RFInfoOperations delegate ) {
      this._impl = delegate;
  }
  public RFInfoPOATie ( FRONTEND.RFInfoOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public FRONTEND.RFInfoOperations _delegate() {
      return this._impl;
  }
  public void _delegate (FRONTEND.RFInfoOperations delegate ) {
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

  /** unique string that flows with data to describe its RF source*/
  public String rf_flow_id ()
  {
    return _impl.rf_flow_id();
  } // rf_flow_id

  /** unique string that flows with data to describe its RF source*/
  public void rf_flow_id (String newRf_flow_id)
  {
    _impl.rf_flow_id(newRf_flow_id);
  } // rf_flow_id


  /** generic container to describe RF frontend */
  public FRONTEND.RFInfoPkt rfinfo_pkt ()
  {
    return _impl.rfinfo_pkt();
  } // rfinfo_pkt

  /** generic container to describe RF frontend */
  public void rfinfo_pkt (FRONTEND.RFInfoPkt newRfinfo_pkt)
  {
    _impl.rfinfo_pkt(newRfinfo_pkt);
  } // rfinfo_pkt

  private FRONTEND.RFInfoOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class RFInfoPOATie
