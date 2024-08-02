

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.lang.ns.NSName;
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class demo

{
	// ---( internal utility methods )---

	final static demo _instance = new demo();

	static demo _newInstance() { return new demo(); }

	static demo _cast(Object o) { return (demo)o; }

	// ---( server methods )---




	public static final void addNumJS (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addNumJS)>> ---
		// @sigtype java 3.5
		// [i] field:0:required a
		// [i] field:0:required b
		// [o] field:0:required c
		IDataMap input = new IDataMap();
		input.put("num1", new IDataMap(pipeline).getAsString("a"));
		input.put("num2", new IDataMap(pipeline).getAsString("b"));
		try {
			IData doInvoke = Service.doInvoke(NSName.create("pub.math:addInts"), input.getIData());
			new IDataMap(pipeline).put("c", new IDataMap(doInvoke).getAsString("value"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}



	public static final void new_javaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(new_javaService)>> ---
		// @sigtype java 3.5
		// --- <<IS-END>> ---

                
	}
}

