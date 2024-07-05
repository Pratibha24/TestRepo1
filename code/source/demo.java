

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class demo

{
	// ---( internal utility methods )---

	final static demo _instance = new demo();

	static demo _newInstance() { return new demo(); }

	static demo _cast(Object o) { return (demo)o; }

	// ---( server methods )---




	public static final void new_javaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(new_javaService)>> ---
		// @sigtype java 3.5
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}
}

