package CF.PropertyChangeListenerPackage;

/**
 * This is the helper for {@link PropertyChangeEvent} from the Redhawk 2.0 series. It un-marshals the <b>old</b> event
 * into the <b>new</b> event data structure from Redhawk 2.1.
 */
abstract public class PropertyChangeEventHelper_2_0
{
  private static String  _id = "IDL:CF/PropertyChangeListener/PropertyChangeEvent:1.0";

  public static void insert (org.omg.CORBA.Any a, CF.PropertyChangeListenerPackage.PropertyChangeEvent that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CF.PropertyChangeListenerPackage.PropertyChangeEvent extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "evt_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "reg_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "resource_id",
            _tcOf_members0,
            null);
          _tcOf_members0 = CF.DataTypeHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (CF.PropertiesHelper.id (), "Properties", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "properties",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (CF.PropertyChangeListenerPackage.PropertyChangeEventHelper.id (), "PropertyChangeEvent", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CF.PropertyChangeListenerPackage.PropertyChangeEvent read (org.omg.CORBA.portable.InputStream istream)
  {
    CF.PropertyChangeListenerPackage.PropertyChangeEvent value = new CF.PropertyChangeListenerPackage.PropertyChangeEvent ();
    value.evt_id = istream.read_string ();
    value.reg_id = istream.read_string ();
    value.resource_id = istream.read_string ();
    value.properties = CF.PropertiesHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CF.PropertyChangeListenerPackage.PropertyChangeEvent value)
  {
    ostream.write_string (value.evt_id);
    ostream.write_string (value.reg_id);
    ostream.write_string (value.resource_id);
    CF.PropertiesHelper.write (ostream, value.properties);
  }

}
