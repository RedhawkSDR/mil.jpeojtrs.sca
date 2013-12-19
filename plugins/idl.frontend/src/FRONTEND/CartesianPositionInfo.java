package FRONTEND;


/**
* FRONTEND/CartesianPositionInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/Frontend.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class CartesianPositionInfo implements org.omg.CORBA.portable.IDLEntity
{
  public boolean valid = false;
  public String datum = null;

  /** Default: DATUM_WGS84 */
  public double x = (double)0;

  /** Default Unit: Degrees */
  public double y = (double)0;

  /** Default Unit: Degrees */
  public double z = (double)0;

  public CartesianPositionInfo ()
  {
  } // ctor

  public CartesianPositionInfo (boolean _valid, String _datum, double _x, double _y, double _z)
  {
    valid = _valid;
    datum = _datum;
    x = _x;
    y = _y;
    z = _z;
  } // ctor

} // class CartesianPositionInfo
